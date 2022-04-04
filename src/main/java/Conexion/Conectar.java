package Conexion;

// import com.sun.jdi.connect.spi.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conectar {
     
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "123456789"; /* Contraseña de cada uno */
    private static final String url = "jdbc:mysql://localhost:3309/gimnasio_workfit2"; /* Si amerita el caso editar el puerto de conexión */
    public static Connection conexion;
    
    public static Connection obtenerconexion (){
        try{
            if(conexion == null){
                conexion = DriverManager.getConnection(url,user,pass);
                System.out.println("Se conecto");
            }
            return conexion;
        } catch (SQLException e){
            throw new RuntimeException("Conexión fallida" , e);
        }
        
    }
}