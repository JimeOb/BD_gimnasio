package Tablas;
import Conexion.Conectar;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
    
    public List<Cliente> obtenerCliente (){
        
        try {
            Connection conexion = Conectar.obtenerconexion();
            
            String sql = "SELECT * from cliente";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet respuesta = ps.executeQuery();
            List<Cliente> clientes = new ArrayList<>();
            while(respuesta.next()){
                String nombre = respuesta.getString("nombre");
                String ocupacion = respuesta.getString("ocupacion");
                Date fechaNacimiento = respuesta.getDate("fecha_nacimiento");
                Cliente afiliado = new Cliente(nombre, ocupacion, fechaNacimiento);
                clientes.add(afiliado);
            }
            return clientes;
                    } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
