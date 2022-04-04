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
public class EntrenadorPersonalizado extends Entrenador {
    
    private int num_cli;

    public EntrenadorPersonalizado(int num_cli, String nombre, int cedula, String direccion, int telefono, String correo, int gym, Date fecha_nacimiento, char sexo, String contraseña, int sueldo) {
        super(nombre, cedula, direccion, telefono, correo, gym, fecha_nacimiento, sexo, contraseña, sueldo);
        this.num_cli = num_cli;
    }

    public int getNum_cli() {
        return num_cli;
    }

    public void setNum_cli(int num_cli) {
        this.num_cli = num_cli;
    }

    @Override
    public String toString() {
        return "EntrenadorPersonalizado{" + "nombre= " + this.getNombre() + ", cedula= " + this.getCedula() + ", direccón= " + this.getDireccion() + ", telefono= " + this.getTelefono() + ", correo= " + this.getCorreo() +
                ", gym= " + this.getGym() + ",fecha nacimiento= " + this.getFecha_nacimiento() + ", sexo= " + this.getSexo() + ", sueldo=" + this.getSueldo() + ", num_cli=" + num_cli + '}';
    }
    
    
    
}
