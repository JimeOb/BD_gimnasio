/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablas;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kamil
 */
public class EntrenadorPersonalizadoDAO {
    
    public EntrenadorPersonalizado obtenerEntrenadorPersonalizado(String contraseña, int cedula){
        
        try{
            EntrenadorPersonalizado entrenadorPersonalizado;
            Connection conexion = Conectar.obtenerconexion();
            String sql = "SELECT * from entrenador_general c WHERE c.cedula = ? AND c.contraseña = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, cedula);
            ps.setString(2, contraseña);
            ResultSet respuesta = ps.executeQuery();
            respuesta.next();
            entrenadorPersonalizado = new EntrenadorPersonalizado(Integer.parseInt(respuesta.getString("num_cli")),respuesta.getString("nombre"),Integer.parseInt(respuesta.getString("cedula")),respuesta.getString("direccion"),Integer.parseInt(respuesta.getString("telefono")),respuesta.getString("correo"),Integer.parseInt(respuesta.getString("id_gym"))
                    ,respuesta.getDate("fecha_nacimiento"),respuesta.getString("sexo").charAt(0),respuesta.getString("contraseña"),Double.parseDouble(respuesta.getString("sueldo")),Integer.parseInt(respuesta.getString("id_cli")));
            ps.close();
            return entrenadorPersonalizado;
        }catch(Exception e){
            throw new RuntimeException("Error en la consulta" , e);
        }
    }
    
}
