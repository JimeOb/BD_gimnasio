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
    /*
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
    */
    
    
    public Cliente obtenerCliente(String contraseña, int cedula){
        
        try{
            Cliente cliente;
            boolean existe = false;
            Connection conexion = Conectar.obtenerconexion();
            String sql = "SELECT * from cliente c WHERE c.cedula = ? AND c.contraseña = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, cedula);
            ps.setString(2, contraseña);
            ResultSet respuesta = ps.executeQuery();
            while (respuesta.next()){
               existe = true;
            }
            ps.close();
            
            cliente = new Cliente(respuesta.getString("nombre"),Integer.parseInt(respuesta.getString("cedula")),Integer.parseInt(respuesta.getString("gym")),Integer.parseInt(respuesta.getString("plan")),Integer.parseInt(respuesta.getString("telefono")),respuesta.getString("sexo").charAt(0),respuesta.getString("direccion"),
                    respuesta.getString("ocupacion"),respuesta.getString("correo"),respuesta.getDate("fecha_na"),respuesta.getDate("fecha_ini"),respuesta.getDate("fecha_fin"),respuesta.getString("contraseña"));
            return cliente;
        }
        catch (Exception e){
            throw new RuntimeException("Error en la consulta" , e);
        }
    }
    
}
