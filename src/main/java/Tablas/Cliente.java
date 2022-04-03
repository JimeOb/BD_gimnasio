package Tablas;

import java.sql.Date;


public class Cliente {
    
    private String nombre;
    private String ocupacion;
    private Date fecha_na;

    public Cliente(String nombre, String ocupacion, Date fecha_na) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.fecha_na = fecha_na;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public Date getFecha_na() {
        return fecha_na;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", ocupacion=" + ocupacion + ", fecha_na=" + fecha_na + '}';
    }
    
}
