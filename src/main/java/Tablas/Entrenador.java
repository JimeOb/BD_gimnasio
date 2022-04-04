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
public class Entrenador extends Empleado {
    
    private double sueldo;
    private int id_cli;
    
    public Entrenador (String nombre, int cedula, String direccion, int telefono, String correo, int gym, Date fecha_nacimiento, char sexo, String contraseña, double sueldo, int id_cli){
        super(nombre, cedula, direccion, telefono, correo, gym, fecha_nacimiento, sexo, contraseña);
        this.sueldo = sueldo;
        this.id_cli = id_cli;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    @Override
    public String toString() {
        return ("Entrenador{" + "nombre= " + this.getNombre() + ", cedula= " + this.getCedula() + ", direccón= " + this.getDireccion() + ", telefono= " + this.getTelefono() + ", correo= " + this.getCorreo() +
                ", gym= " + this.getGym() + ",fecha nacimiento= " + this.getFecha_nacimiento() + ", sexo= " + this.getSexo() + ", sueldo=" + this.getSueldo() + ", id_cli=" + this.getId_cli() + "}");
    }
    
    
    
}
