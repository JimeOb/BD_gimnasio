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
          getVista().setSize(1040, 760);
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
        if (afiliado.getGym()== 1){
            getVista().getLbsedeClie().setText("Sede A");
        }
        else if (afiliado.getGym()== 2){
            getVista().getLbsedeClie().setText("Sede B");
        }
        else if (afiliado.getGym()== 2){
            getVista().getLbsedeClie().setText("Sede C");
        }
        if (afiliado.getPlan()==1){
            getVista().getLbplanClie().setText("PLAN BASICO");
        }
        else if (afiliado.getPlan()==2){
            getVista().getLbplanClie().setText("PLAN PERSONALIZADO");
        }
        getVista().getLbfFin().setText(String.valueOf(afiliado.getFecha_fin()));
        getVista().getLbfInicio().setText(String.valueOf(afiliado.getFecha_ini()));
        getVista().getLbfecnaClie().setText(String.valueOf(afiliado.getFecha_na()));
        getVista().getLbcorClie().setText(String.valueOf(afiliado.getCorreo()));
        getVista().getLbsexClie().setText(String.valueOf(afiliado.getSexo()));
        getVista().getLbocuClie().setText(String.valueOf(afiliado.getOcupacion()));
        getVista().getLbdirClie().setText(String.valueOf(afiliado.getDireccion()));
        getVista().getLbcedCli().setText(String.valueOf(afiliado.getCedula()));
        getVista().getLbnomClie().setText((afiliado.getNombre()));
        getVista().getLbtelClie().setText(String.valueOf(afiliado.getTelefono()));
    }
    
}
