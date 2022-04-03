package Tablas;

import java.sql.Date;


public class Cliente {
    
    private String nombre;
    private int cedula;
    private int gym;
    private int plan;
    private int telefono;
    private char sexo;
    private String direccion;
    private String ocupacion;
    private String correo;
    private Date fecha_na;
    private Date fecha_ini;
    private Date fecha_fin;
    private String contraseña;
    
    public Cliente(String nombre, int cedula, int gym, int plan, int telefono, char sexo, String direccion, String ocupacion, String correo, Date fecha_na, Date fecha_ini, Date fecha_fin, String contraseña) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.gym = gym;
        this.plan = plan;
        this.telefono = telefono;
        this.sexo = sexo;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.correo = correo;
        this.fecha_na = fecha_na;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return this.ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Date getFecha_na() {
        return this.fecha_na;
    }
    
    public void setFecha_na(Date fecha_na) {
        this.fecha_na = fecha_na;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getGym() {
        return gym;
    }

    public void setGym(int gym) {
        this.gym = gym;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    

    @Override
    public String toString() {
        return ("Cliente{" + "nombre= " + this.getNombre() + ", cedula= " + this.getCedula() + ", gym= " + this.getGym() + ", plan= " + this.getPlan() + ", telefono=" + this.getTelefono() + ", dirección= " + this.getDireccion() + ", ocupación= " + this.getOcupacion() + ", correo= " + this.getCorreo() + 
                ", fecha nacimiento= " + this.getFecha_na() + ", fecha inicio= " + this.getFecha_ini() + ", fecha fin= " + this.getFecha_fin() + '}');
    }
    
}
