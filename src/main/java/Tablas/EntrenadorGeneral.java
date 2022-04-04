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
public class EntrenadorGeneral extends Entrenador {
    
    private int hor_tra;

    public EntrenadorGeneral(int hor_tra, String nombre, int cedula, String direccion, int telefono, String correo, int gym, Date fecha_nacimiento, char sexo, String contraseña, double sueldo, int id_cli) {
        super(nombre, cedula, direccion, telefono, correo, gym, fecha_nacimiento, sexo, contraseña, sueldo, id_cli);
        this.hor_tra = hor_tra;
    }
    
    public int getHor_tra() {
        return hor_tra;
    }

    public void setHor_tra(int hor_tra) {
        this.hor_tra = hor_tra;
    }

    @Override
    public String toString() {
        return "EntrenadorGeneral{" + "nombre= " + this.getNombre() + ", cedula= " + this.getCedula() + ", direccón= " + this.getDireccion() + ", telefono= " + this.getTelefono() + ", correo= " + this.getCorreo() +
                ", gym= " + this.getGym() + ",fecha nacimiento= " + this.getFecha_nacimiento() + ", sexo= " + this.getSexo() + ", sueldo=" + this.getSueldo() + ", id_cli=" + this.getId_cli() + "hor_tra=" + hor_tra + '}';
    }
    
    
    
}
