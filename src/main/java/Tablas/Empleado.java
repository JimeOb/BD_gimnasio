/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.sql.Date;

/**
 *
 * @author sjgar
 */
public class Empleado {
    
    private int gym;
    private String nombre;
    private int cedula;
    private String direccion;
    private int telefono;
    private String correo;
    private Date fecha_nacimiento;
    private char sexo;
    private String contraseña;
    
    public Empleado(String nombre, int cedula, String direccion, int telefono, String correo, int gym, Date fecha_nacimiento, char sexo, String contraseña){
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.gym = gym;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.contraseña = contraseña;
    }

    public int getGym() {
        return gym;
    }

    public void setGym(int gym) {
        this.gym = gym;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    @Override
    public String toString(){
        return ("Empleado{" + "nombre= " + this.getNombre() + ", cedula= " + this.getCedula() + ", direccón= " + this.getDireccion() + ", telefono= " + this.getTelefono() + ", correo= " + this.getCorreo() +
                ", gym= " + this.getGym() + ",fecha nacimiento= " + this.getFecha_nacimiento() + ", sexo= " + this.getSexo() + "}");
    }
}
