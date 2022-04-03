package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private final Modelo modelo;

    public Controlador(Ventana vista) {
        this.modelo = vista.getModelo();
    }  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == modelo.getVista().getBtnAcceder()){
            modelo.iniciarSesion();
        }
    }
    
}
