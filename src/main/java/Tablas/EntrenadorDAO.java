/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author sjgar
 */
public class EntrenadorDAO {
    
    
     public Entrenador obtenerEntrenador(String contraseña, int cedula){
        
        try{
            Entrenador entrenador;
            Connection conexion = Conectar.obtenerconexion();
            String sql = "SELECT * from entrenador AS e inner join empleado AS i ON e.id_emp = i.id_emp WHERE i.cedula = ? AND i.contraseña = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, cedula);
            ps.setString(2, contraseña);
            ResultSet respuesta = ps.executeQuery();
            respuesta.next();
            entrenador = new Entrenador(respuesta.getString("nombre"),Integer.parseInt(respuesta.getString("cedula")),respuesta.getString("direccion"),Integer.parseInt(respuesta.getString("telefono")),respuesta.getString("correo"),Integer.parseInt(respuesta.getString("id_gym"))
                    ,respuesta.getDate("fecha_nacimiento"),respuesta.getString("sexo").charAt(0),respuesta.getString("contraseña"),Integer.parseInt(respuesta.getString("sueldo")));
            ps.close();
            return entrenador;
        }
        catch (Exception e){
            throw new RuntimeException("Error en la consulta" , e);
        }
    }
}
