package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MyLink {

    protected Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/casanas_bank", user = "root", password = "";

    public void connect() {
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            
            if(con != null) {
                System.out.println("Conexion establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Error al conectar");
        }
    }
    
    public Connection getConnection() {
        return con;
    }
    
    public void disconect() {
        con = null;
        if(con == null) {
            System.out.println("Se cerro la coneccion");
        }
    }
}