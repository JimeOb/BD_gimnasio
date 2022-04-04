package Vista;

import Tablas.Cliente;
import Tablas.ClienteDAO;
import Tablas.EntrenadorDAO;
import Tablas.Entrenador;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class Modelo {
 
    private Ventana vista;
    private ClienteDAO cliente;
    private Cliente afiliado;
    private EntrenadorDAO empleado;
    private Entrenador trabajador;
    
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
        
    public EntrenadorDAO getEmpleado(){
        if(empleado == null){
            empleado = new EntrenadorDAO();
        }
        return empleado;
    }
    
    
    public void inicio(){
        if(getVista().getCmbTipo().getSelectedIndex() == 0){
            iniciarSesionEmpleado();
        }
        else if(getVista().getCmbTipo().getSelectedIndex() == 1){
            iniciarSesionCliente();
        }
    }
    
        
    public void iniciarSesionCliente(){
        Integer usuario = Integer.parseInt(getVista().getJtxUsuario().getText());
        String contraseña = String.copyValueOf(getVista().getJpaContraseña().getPassword());
       try { 
          afiliado = getCliente().obtenerCliente(contraseña,usuario);
          cambiarvistaCliente("pnCliente");
          getVista().setSize(1040, 760);
          actulizarVistaCliente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Los datos ingresados son incorrectos","Error", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    public void iniciarSesionEmpleado(){
        Integer usuario = Integer.parseInt(getVista().getJtxUsuario().getText());
        String contraseña = String.copyValueOf(getVista().getJpaContraseña().getPassword());
       try { 
          trabajador = getEmpleado().obtenerEntrenador(contraseña,usuario);
          cambiarvistaEntrenador("pnEntrenador");
          getVista().setSize(1040, 760);
          actulizarVistaEntrenador();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Los datos ingresados son incorrectos","Error", JOptionPane.ERROR_MESSAGE);
        }    
    }

    public void cambiarvistaCliente(String pnCliente) {
        final CardLayout layout = (CardLayout) getVista().getPnInfo().getLayout();
        layout.show(getVista().getPnInfo(), pnCliente);
    }
    
    public void cambiarvistaEntrenador(String pnEntrenador) {
        final CardLayout layout = (CardLayout) getVista().getPnInfo().getLayout();
        layout.show(getVista().getPnInfo(), pnEntrenador);
    }
    
    public void actulizarVistaCliente (){
        if (afiliado.getGym()== 1){
            getVista().getLbsedeClie().setText("Sede A");
        }
        else if (afiliado.getGym()== 2){
            getVista().getLbsedeClie().setText("Sede B");
        }
        else if (afiliado.getGym()== 3){
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
    
    
     public void actulizarVistaEntrenador (){
         
         
         
         
         
         if (trabajador.getGym()== 1){
            getVista().getLbNomSede().setText("Sede A");
        }
        else if (trabajador.getGym()== 2){
            getVista().getLbNomSede().setText("Sede B");
        }
        else if (trabajador.getGym()== 3){
            getVista().getLbNomSede().setText("Sede C");
        }
      
        getVista().getLbNombre_coach().setText(String.valueOf(trabajador.getNombre()));
        getVista().getLbCeduEmpl().setText(String.valueOf(trabajador.getCedula()));
        getVista().getLbFecNac().setText(String.valueOf(trabajador.getFecha_nacimiento()));
        getVista().getLbSalEmpl().setText(String.valueOf(trabajador.getSueldo()));
        getVista().getLbSexEmpl().setText(String.valueOf(trabajador.getSexo()));
        getVista().getLbNumSed().setText(String.valueOf(trabajador.getGym()));
        getVista().getLbDirecEmpl().setText(String.valueOf(trabajador.getDireccion()));
        getVista().getLbCorrEmpl().setText(String.valueOf(trabajador.getCorreo()));
        getVista().getLbTeleEmpl().setText(String.valueOf(trabajador.getTelefono()));
    }
    
}
