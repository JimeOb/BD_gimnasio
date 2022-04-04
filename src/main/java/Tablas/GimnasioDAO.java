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
public class GimnasioDAO {
    
    
    public Gimnasio obtenerGimnasio(String nombre){
        
        try{
            Gimnasio gimnasio;
            Connection conexion = Conectar.obtenerconexion();
            String sql = "SELECT * from gimnasio g WHERE g.nombre = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet respuesta = ps.executeQuery();
            respuesta.next();
            gimnasio = new Gimnasio(respuesta.getString("nombre"),Integer.parseInt(respuesta.getString("telefono")),respuesta.getString("direccion"));
            ps.close();
            return gimnasio;
        }
        catch (Exception e){
            throw new RuntimeException("Error en la consulta" , e);
        }
    }
}
