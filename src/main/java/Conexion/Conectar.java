package Conexion;

// import com.sun.jdi.connect.spi.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conectar {
    
    Connection conexion;

    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "123456789";
    private static final String url = "jdbc:mysql://localhost:3309/gimnasio_workfit2";
    
    public static Connection obtenerconexion () throws SQLException{

      return DriverManager.getConnection(url,user,pass);

    }
}