/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

/**
 *
 * @author sjgar
 */
public class Gimnasio {
    private String nombre;
    private int telefono;
    private String direccion;
    
    public Gimnasio(String nombre, int telefono, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Gimnasio{" + "nombre=" + this.getNombre() + ", telefono=" + this.getTelefono() + ", direccion=" + this.getDireccion() + '}';
    }
    
    
}
