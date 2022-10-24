package main;

//Importacion de los recursos necesarios
import javax.swing.*;
import connection.DBClientActions;
import graphic_interface.Home;
import graphic_interface.MainActions;
import java.sql.SQLException;

public class Client {

    private static String usrID, usrName = "", usrLastname = "", cellphoneNumber, email, password;
    private static short activeLoan;
    private static double totalSaved, loanAmount;

    public Client() {
        //Constructor
    }

    public void atStartSetBankingInformation(double totalSaved, short activeLoan, double loanAmount) {
        //Esta metodo es ejecutado desde DBClientActions al inicir sesion, guarda los datos bancarios en las viariable privadas de la clase
        Client.totalSaved = totalSaved;
        Client.activeLoan = activeLoan;
        Client.loanAmount = loanAmount;
        System.out.println(Client.totalSaved + " " + Client.activeLoan + " " + Client.loanAmount);
    }

    public void newUser(String name, String lastName, String usrID, String cellphoneNumber, String email, String password) throws SQLException {
        /*Consulta a la base de datos, si existe un usuario con el numero de cedula indicado, si existe dice que ya se 
          creo el usuario y no permite volver a crearlo. pero si no, toma los datos de los JTextField y los 
          ingresa como un nuevo registro a la base de datos
         */
        Client.usrID = usrID;
        DBClientActions dbClientActions = new DBClientActions();
        boolean created = dbClientActions.queryClient(Client.usrID);

        if (created == true) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
            MainActions mainActions = new MainActions();
            mainActions.setVisible(true);
        } else {
            Client.usrName = name;
            Client.usrLastname = lastName;
            Client.cellphoneNumber = cellphoneNumber;
            Client.email = email;
            Client.password = password;

            boolean toCreate = dbClientActions.insertClient(this);

            if (toCreate == false) {
                Client.usrName = null;
                Client.usrLastname = null;
                Client.cellphoneNumber = null;
                Client.email = null;
                Client.password = null;
                JOptionPane.showMessageDialog(null, "No se pudo crear el usuario");
            } else {
                JOptionPane.showMessageDialog(null, "¡Usuario creado correctamente!");
                MainActions mainActions = new MainActions();
                mainActions.setVisible(true);
            }
        }
    }

    //Metodo que obtiene las credenciales ingresadas y consulta que sea igual a las credenciales guardadas en el servidor
    public String validateCredentials(String usrID, String password) throws SQLException {

        // *Hace consulta a la base de datos y compara con el dato ingresado por el usuario*
        String returned = "";
        DBClientActions dbClientActions = new DBClientActions();
        boolean queryResult = dbClientActions.loginQueryClient(usrID, password);

        if (queryResult == true) {
            Home home = new Home();
            home.setVisible(true);
            returned = "Login correcto";
            returned = "1";

            dbClientActions.getBankingInformation(usrID);
        } else {
            returned = "Correo y/o contraseña incorrectos";
        }

        return returned;
    }

    //Metodo agregar dinero
    public static void addMoney(double toSave) throws SQLException {
        DBClientActions dbClientActions = new DBClientActions();
        short operation = 1;

        if (toSave > 0) {
            totalSaved += toSave;
            boolean added = dbClientActions.BankingOperations(usrID, totalSaved, operation);

            if (added == true) {
                JOptionPane.showMessageDialog(null, "Saldo ingresado exitosamente. Total ahorrado: " + totalSaved);
            } else {
                JOptionPane.showMessageDialog(null, "Error al depositar el dinero, intentelo de nuevo");
                totalSaved -= toSave;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un saldo mayor a 0");
        }
    }

    //Metodo retirar dinero
    public static void withdrawMoney(double toDiscount) throws SQLException {
        DBClientActions dbClientActions = new DBClientActions();
        short operation = 1;

        if (totalSaved >= toDiscount) {
            totalSaved = totalSaved - toDiscount;
            boolean added = dbClientActions.BankingOperations(usrID, totalSaved, operation);

            if (added == true) {
                JOptionPane.showMessageDialog(null, "Descontaste " + toDiscount + " de tu cuenta. Te queda: " + totalSaved + "\n");
            } else {
                JOptionPane.showMessageDialog(null, "Error al depositar el dinero, intentelo de nuevo");
                totalSaved += toDiscount;
            }
        } else {
            JOptionPane.showMessageDialog(null, "El monto a retirar supera el total en la cuenta");
        }
    }

    public static void requestLoan(double balance, double toRequest) throws SQLException {
        short operation = 2;
        DBClientActions dbClientActions = new DBClientActions();

        if (balance < 100000) {
            JOptionPane.showMessageDialog(null, "Debe tener un saldo mayor a 100.000 para pedir un prestamo");
        } else {
            if (activeLoan == 1) {
                JOptionPane.showMessageDialog(null, "Lo sentimos, ya tiene un prestamo activo, por lo cual no podemos abrir otro");
            } else {
                boolean requestedLoan = dbClientActions.BankingOperations(usrID, toRequest, operation);
                if (requestedLoan == true) {
                    JOptionPane.showMessageDialog(null, "Felicidades, ya se realizo la solicitud de su prestamo");
                    activeLoan = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al realizar la operacion");
                }
            }
        }
    }

    public void updatePassword(String password, String toConfirmPassword) throws SQLException {
        DBClientActions dbClientActions = new DBClientActions();
        boolean passwordConfirmed = false;

        do {
            if (password.equals(toConfirmPassword)) {
                Client.password = password;
                dbClientActions.updatePassword(usrID, password);
                passwordConfirmed = true;
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas ingresadas no son identicas");
                password = JOptionPane.showInputDialog("Ingrese la nueva contraseña");
                toConfirmPassword = JOptionPane.showInputDialog("Confirme la contraseña");
            }
        } while (passwordConfirmed == false);

    }

    public void closeSesion() throws SQLException {
        DBClientActions dbClientActions = new DBClientActions();
        dbClientActions.closeSesion();
    }

    //Desde linea 67 a 81 se crearon metodos getters y setters para varios fines
    public String getUsrID() {
        return usrID;
    }

    public String getUsrName() {
        return usrName;
    }

    public String getUsrLastName() {
        return usrLastname;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public short getActiveLoan() {
        return activeLoan;
    }

    public double seeBalance() {
        return totalSaved;
    }

    public void setUsrID(String usrID) {
        Client.usrID = usrID;
    }

    public void setUsrName(String usrName) throws SQLException {

        DBClientActions dbClientActions = new DBClientActions();
        boolean isUpdate = dbClientActions.updateUsrName(usrName.toLowerCase());

        if (isUpdate == true) {
            Client.usrName = usrName;
            System.out.println("Nombre de cliente actualizado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar nombre de usuario");
        }
    }

    public void setUsrLastName(String usrLastName) {
        Client.usrLastname = usrLastName;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        Client.cellphoneNumber = cellphoneNumber;
    }

    public void setEmail(String email) {
        Client.email = email;
    }
}
