package Vista;

import Tablas.Cliente;
import Tablas.ClienteDAO;
import java.awt.CardLayout;
import java.awt.LayoutManager;
import javax.swing.JOptionPane;

public class Modelo {
 
    private Ventana vista;
    private ClienteDAO cliente;
    private Cliente afiliado;
    
    public Ventana getVista() {
        if (vista == null)
            vista = new Ventana(this);
        return vista;
    }

    public ClienteDAO getCliente() {
         if (cliente == null)
            cliente = new ClienteDAO();
         return cliente;
    }
    
        public void iniciar (){
        getVista().setVisible(true);
        getVista().setSize(400, 511);     
    }
    
    public void iniciarSesion(){
        Integer usuario = Integer.parseInt(getVista().getJtxUsuario().getText());
        String contraseña = String.copyValueOf(getVista().getJpaContraseña().getPassword());
       try { 
           afiliado = getCliente().obtenerCliente(contraseña,usuario);
          cambiarvistaCliente("pnCliente");
          getVista().setSize(1000, 1000);
          actulizarvista();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Los datos ingresados son incorrectos","Error", JOptionPane.ERROR_MESSAGE);
        }    
    }

    public void cambiarvistaCliente(String pnCliente) {
        final CardLayout layout = (CardLayout) getVista().getPnInfo().getLayout();
        layout.show(getVista().getPnInfo(), pnCliente);
    }
    
    public void actulizarvista (){
        getVista().getLbtelClie().setText(String.valueOf(afiliado.getTelefono()));
    }
    
}
