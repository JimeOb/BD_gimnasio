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
public class PlanDAO {
    
    public Plan obtenerGimnasio(String nombre){
        
        try{
            Plan plan;
            Connection conexion = Conectar.obtenerconexion();
            String sql = "SELECT * from plan p WHERE p.nombre = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet respuesta = ps.executeQuery();
            respuesta.next();
            plan = new Plan(respuesta.getString("nombre"),Integer.parseInt(respuesta.getString("precio")),respuesta.getString("descripcion"));
            ps.close();
            return plan;
        }
        catch (Exception e){
            throw new RuntimeException("Error en la consulta" , e);
        }
    }
}
