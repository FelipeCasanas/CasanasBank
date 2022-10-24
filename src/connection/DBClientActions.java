package connection;

//Importacion de los recursos necesarios
import graphic_interface.MainActions;
import main.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBClientActions extends MyLink {

    public DBClientActions() {
        //Constructor
    }

    public void getBankingInformation(String usrID) throws SQLException {

        try {
            Client client = new Client();
            this.connect();
            Connection con = this.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM account WHERE client_id = ?");
            ps.setString(1, usrID);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double amount = Double.parseDouble(rs.getString("amount"));
                short activeLoan = Short.parseShort(rs.getString("active_loan"));
                double loanAmount = Double.parseDouble(rs.getString("loan_amount"));
                client.atStartSetBankingInformation(amount, activeLoan, loanAmount);
            } else {
                System.out.println("No se puedo obtener la informacion del cliente");
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            con.close();
        }

    }

    public boolean queryClient(String usrID) throws SQLException {

        /*Conecta con base de datos y realiza consulta para verificar si la cedula de la persona ya existe en base de datos.
          SI existe en la BD devuelve true (EL USUARIO YA EXISTE).
          SI NO devuelve false (EL USUARIO NO EXISTE.
          Posteriormente SI se da una excepcion imprime dialogo con el mensaje de error y cierra la conexion
         */
        try {
            Client client = new Client();
            this.connect();
            Connection con = this.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM client WHERE client_id = ?;");
            ps.setString(1, usrID);
            ps.execute();
            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos: " + e.getMessage());
            return false;
        } finally {
            con.close();
        }
    }

    public boolean loginQueryClient(String usrID, String password) throws SQLException {
        try {

            //Conecta con la base de datos y realiza consulta para verificar la veracidad de las credenciales ingresadas por el usuario
            Client client = new Client();
            this.connect();
            Connection con = this.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM client WHERE client_id = ? AND password = ?;");
            ps.setString(1, usrID);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            /*SI usuario existe en base de datos muestra mensaje y guarda nombre y apellido en las variables privadas de Client.
              SI NO retorna un valor falso, el cual en Client muestra mensaje de crerdenciales no validas
             */
            if (rs.next()) {
                System.out.println("Consulta exitosa");
                client.setUsrID(String.valueOf(rs.getString("client_id")));
                client.setUsrName(String.valueOf(rs.getString("name")));
                client.setUsrLastName(String.valueOf(rs.getString("last_name")));
                client.setCellphoneNumber(String.valueOf(rs.getString("cellphone")));
                client.setEmail(String.valueOf(rs.getString("email")));
                return true;
            } else {
                return false;
            }

            //Error al conectar con base de datos, posteriormente cierra conexion
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos: ");
            return false;
        } finally {
            con.close();
        }
    }

    public boolean insertClient(Client client) throws SQLException {

        /*Conecta con la base de datos y hace consulta INSERT para crear nuevo Cliente. 
          SI el proceso se realiza correctamente devuelve mensaje de exito seguido de un booleano true.
          SI NO devuelve el mensaje de error de la excepcion SQL, retorna booleano falso y cierra conexion
         */
        try {
            this.connect();
            PreparedStatement ps = con.prepareStatement("INSERT INTO client(client_id, name, last_name, cellphone, email, password) VALUES (?, ?, ?, ?, ?, ?);");
            ps.setString(1, client.getUsrID());
            ps.setString(2, client.getUsrName());
            ps.setString(3, client.getUsrLastName());
            ps.setString(4, client.getCellphoneNumber());
            ps.setString(5, client.getEmail());
            ps.setString(6, client.getPassword());
            ps.executeUpdate();
            System.out.println("Cliente creado");

            PreparedStatement psBankAccount = con.prepareStatement("INSERT INTO account(client_id, amount, active_loan, loan_amount) VALUES (? , 0, 0, 0);");
            psBankAccount.setString(1, client.getUsrID());
            psBankAccount.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            con.close();
        }
    }

    public boolean BankingOperations(String usrID, double amount, short operation) throws SQLException {
        boolean completed = false;

        this.connect();
        Connection con = this.getConnection();

        if (operation == 1) {
            try {
                PreparedStatement ps = con.prepareCall("UPDATE account SET amount = ? WHERE client_id = ?;");
                ps.setString(1, String.valueOf(amount));
                ps.setString(2, usrID);
                ps.executeUpdate();

                completed = true;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                completed = false;
            } finally {
                con.close();
            }
        } else if (operation == 2) {
            try {
                PreparedStatement ps = con.prepareStatement("UPDATE account SET active_loan = ?, loan_amount = ? WHERE client_id = ?;");
                ps.setString(1, "1");
                ps.setString(2, String.valueOf(amount));
                ps.setString(3, usrID);
                ps.executeUpdate();

                completed = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                completed = false;
            } finally {
                con.close();
            }
        }

        return completed;
    }

    public boolean updateUsrName(String name) throws SQLException {
        boolean returned = false;

        try {
            Client client = new Client();
            this.connect();
            Connection con = this.getConnection();

            PreparedStatement ps = con.prepareStatement("UPDATE client SET name = ? WHERE client_id = ?;");
            ps.setString(1, name);
            ps.setString(2, client.getUsrID());
            ps.executeUpdate();
            returned = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            returned = false;
        } finally {
            con.close();
        }

        return returned;
    }

    public void updatePassword(String usrID, String password) throws SQLException {
        try {
            this.connect();
            Connection con = this.getConnection();

            PreparedStatement ps = con.prepareStatement("UPDATE client SET password = ? WHERE client_id = ?;");
            ps.setString(1, password);
            ps.setString(2, usrID);
            ps.executeUpdate();
            System.out.println("Contraseña actualizada");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            con.close();
        }
    }

    public void closeSesion() throws SQLException {
        Client client = new Client();
        this.connect();
        Connection con = this.getConnection();

        try {
            MainActions mainActions = new MainActions();
            mainActions.setVisible(true);
            client.setUsrID("");
            client.setUsrName("");
            client.setUsrLastName("");
            client.setCellphoneNumber("");
            client.setEmail("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            con.close();
        }
    }
}
