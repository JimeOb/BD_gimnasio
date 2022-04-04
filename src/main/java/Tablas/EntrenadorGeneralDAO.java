package Tablas;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kamil
 */
public class EntrenadorGeneralDAO {
    
    public EntrenadorGeneral obtenerEntrenadorGeneral(String contraseña, int cedula){
        
        try{
            EntrenadorGeneral entrenadorGeneral;
            Connection conexion = Conectar.obtenerconexion();
            String sql = "SELECT * from entrenador_general c WHERE c.cedula = ? AND c.contraseña = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, cedula);
            ps.setString(2, contraseña);
            ResultSet respuesta = ps.executeQuery();
            respuesta.next();
            entrenadorGeneral = new EntrenadorGeneral(Integer.parseInt(respuesta.getString("Hor_tra")),respuesta.getString("nombre"),Integer.parseInt(respuesta.getString("cedula")),respuesta.getString("direccion"),Integer.parseInt(respuesta.getString("telefono")),respuesta.getString("correo"),Integer.parseInt(respuesta.getString("id_gym"))
                    ,respuesta.getDate("fecha_nacimiento"),respuesta.getString("sexo").charAt(0),respuesta.getString("contraseña"),Double.parseDouble(respuesta.getString("sueldo")),Integer.parseInt(respuesta.getString("id_cli")));
            ps.close();
            return entrenadorGeneral;
        }catch(Exception e){
            throw new RuntimeException("Error en la consulta" , e);
        }
        
    }
    
}
