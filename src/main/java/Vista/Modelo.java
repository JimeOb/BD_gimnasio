package Vista;

import Tablas.ClienteDAO;
import javax.swing.JOptionPane;

public class Modelo {
    
    private Ventana vista;
    private ClienteDAO cliente;
    
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
        
        Integer usuario = Integer.parseInt(getVista().getJtxUsuario().getText());
        String contraseña = String.copyValueOf(getVista().getJpaContraseña().getPassword());
        
       try {
           cliente.obtenerCliente(contraseña,usuario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Los datos ingresados son incorrectos","Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
