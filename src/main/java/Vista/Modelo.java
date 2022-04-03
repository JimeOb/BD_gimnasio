package Vista;

public class Modelo {
    
    private Ventana vista;

    public Ventana getVista() {
        if (vista == null)
            vista = new Ventana(this);
        return vista;
    }
    
        public void iniciar (){
        getVista().setVisible(true);
        getVista().setSize(400, 511);     
    }
    
    public void iniciarSesion(){
        
        
        
    }
}
