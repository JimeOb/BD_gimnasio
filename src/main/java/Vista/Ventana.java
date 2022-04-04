package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Ventana extends javax.swing.JFrame {

    private final Modelo modelo;
    private Controlador control;

    public Ventana(Modelo m) {
      modelo = m;
      initComponents();
      capturarEventos();
      setLocationRelativeTo(null);
      setTitle("Base de datos GYM");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Controlador getControl() {
        if(control == null){
            control = new Controlador(this);
        }
        return control;
    }

    public JButton getBtnAcceder() {
        return btnAcceder;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnSalirCli() {
        return btnSalirCli;
    }

    public JPasswordField getJpaContraseña() {
        return JpaContraseña;
    }

    public JTextField getJtxUsuario() {
        return JtxUsuario;
    }

    public JPanel getPnInfo() {
        return pnInfo;
    }

    public JLabel getLbtelClie() {
        return lbtelClie;
    }

    public JLabel getLbNombre_coach() {
        return lbNombre_coach;
    }

    public JLabel getLbcedCli() {
        return lbcedCli;
    }

    public JLabel getLbcorClie() {
        return lbcorClie;
    }

    public JLabel getLbdirClie() {
        return lbdirClie;
    }

    public JLabel getLbdirEmple() {
        return lbdirEmple;
    }

    public JLabel getLbfFin() {
        return lbfFin;
    }

    public JLabel getLbfInicio() {
        return lbfInicio;
    }

    public JLabel getLbfecnaClie() {
        return lbfecnaClie;
    }

    public JLabel getLbinfoBasico() {
        return lbinfoBasico;
    }

    public JLabel getLbinfoPerso() {
        return lbinfoPerso;
    }

    public JLabel getLbncargoEmple() {
        return lbncargoEmple;
    }

    public JLabel getLbnomClie() {
        return lbnomClie;
    }

    public JLabel getLbnomInstr() {
        return lbnomInstr;
    }

    public JLabel getLbnomsedeEmple() {
        return lbnomsedeEmple;
    }

    public JLabel getLbnumEntre() {
        return lbnumEntre;
    }

    public JLabel getLbnumiEmpe() {
        return lbnumiEmpe;
    }

    public JLabel getLbocuClie() {
        return lbocuClie;
    }

    public JLabel getLbplanClie() {
        return lbplanClie;
    }

    public JLabel getLbsalEmple() {
        return lbsalEmple;
    }

    public JLabel getLbsedeClie() {
        return lbsedeClie;
    }

    public JLabel getLbsexClie() {
        return lbsexClie;
    }

    public JLabel getLbtelEmple() {
        return lbtelEmple;
    }

    public JComboBox<String> getCmbTipo() {
        return cmbTipo;
    }
    
    
    
    
    
    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        pnInfo = new javax.swing.JPanel();
        pnIniciar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JtxUsuario = new javax.swing.JTextField();
        JpaContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        pnEntrenador = new javax.swing.JPanel();
        lbNombre_coach = new javax.swing.JLabel();
        tbpCoach = new javax.swing.JTabbedPane();
        pndatosCoach = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbncargoEmple = new javax.swing.JLabel();
        lbsalEmple = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbnumEntre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbtelEmple = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbdirEmple = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbnomsedeEmple = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbinfoBasico = new javax.swing.JLabel();
        lbnumiEmpe = new javax.swing.JLabel();
        lbinfoPerso = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        pnCliente = new javax.swing.JPanel();
        pnCliente1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbnomClie = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbcedCli = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbnomInstr = new javax.swing.JLabel();
        btnSalirCli = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        lbtelClie = new javax.swing.JLabel();
        lbdirClie = new javax.swing.JLabel();
        lbocuClie = new javax.swing.JLabel();
        lbsedeClie = new javax.swing.JLabel();
        lbplanClie = new javax.swing.JLabel();
        lbfInicio = new javax.swing.JLabel();
        lbfFin = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbsexClie = new javax.swing.JLabel();
        lbcorClie = new javax.swing.JLabel();
        lbfecnaClie = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnInfo.setLayout(new java.awt.CardLayout());

        pnIniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnIniciar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 110, 100));

        jLabel1.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel1.setText("Contraseña:");
        pnIniciar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 30));

        jLabel3.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel3.setText("Tipo de usuario:");
        pnIniciar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, 30));

        JtxUsuario.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        JtxUsuario.setToolTipText("");
        pnIniciar.add(JtxUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 210, 30));
        pnIniciar.add(JpaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, 30));

        btnAcceder.setBackground(new java.awt.Color(204, 255, 204));
        btnAcceder.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        btnAcceder.setText("Iniciar Sesión");
        pnIniciar.add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 160, 50));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTRENADOR", "CLIENTE" }));
        pnIniciar.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 130, 40));

        jLabel5.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel5.setText("Usuario:");
        pnIniciar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 30));

        pnInfo.add(pnIniciar, "card2");

        pnEntrenador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNombre_coach.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        lbNombre_coach.setText("Nombre del coach :V");
        pnEntrenador.add(lbNombre_coach, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 300, 40));

        pndatosCoach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pndatosCoach.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 170, 230));

        lbncargoEmple.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbncargoEmple.setText("Numero :v");
        pndatosCoach.add(lbncargoEmple, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 250, 40));

        lbsalEmple.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbsalEmple.setText("blablabla");
        pndatosCoach.add(lbsalEmple, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 120, 40));

        jLabel8.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel8.setText("Codigo empleado: ");
        pndatosCoach.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 250, 40));

        lbnumEntre.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbnumEntre.setText("Numero :v");
        pndatosCoach.add(lbnumEntre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 250, 40));

        jLabel9.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel9.setText("Cargo: ");
        pndatosCoach.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 80, 40));

        lbtelEmple.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbtelEmple.setText("ola :3");
        pndatosCoach.add(lbtelEmple, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 120, 40));

        jLabel11.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel11.setText("Dirección: ");
        pndatosCoach.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 120, 40));

        lbdirEmple.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbdirEmple.setText("blablabla");
        pndatosCoach.add(lbdirEmple, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 120, 40));

        jLabel12.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel12.setText("Salario: ");
        pndatosCoach.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 40));

        lbnomsedeEmple.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbnomsedeEmple.setText("Nom sede");
        pndatosCoach.add(lbnomsedeEmple, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 120, 40));

        jLabel14.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel14.setText("Telefono: ");
        pndatosCoach.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 120, 40));

        lbinfoBasico.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbinfoBasico.setText("Horas trabajadas: ");
        pndatosCoach.add(lbinfoBasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 190, 40));

        lbnumiEmpe.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbnumiEmpe.setText("Un numero ");
        pndatosCoach.add(lbnumiEmpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 160, 40));

        lbinfoPerso.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbinfoPerso.setText("Clientes asociados: ");
        pndatosCoach.add(lbinfoPerso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 210, 40));

        jLabel17.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel17.setText("Sede: ");
        pndatosCoach.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 120, 40));

        tbpCoach.addTab("Datos basicos del entrenador", pndatosCoach);

        pnConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pnConsulta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        tbpCoach.addTab("Consultas", pnConsulta);

        pnEntrenador.add(tbpCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 990, 570));

        jLabel6.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel6.setText("Bienvenido: ");
        pnEntrenador.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 150, 40));

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Lato Black", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        pnEntrenador.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 240, 60));

        pnInfo.add(pnEntrenador, "pnEntrenador");

        pnCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnCliente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel18.setText("Instructor: ");
        pnCliente1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 130, 40));

        jLabel13.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel13.setText("Ocupación: ");
        pnCliente1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 160, 40));

        jLabel15.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel15.setText("Sexo:");
        pnCliente1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 170, 40));

        jLabel16.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel16.setText("Telefono: ");
        pnCliente1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 120, 40));

        jLabel19.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel19.setText("Dirección: ");
        pnCliente1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 120, 40));

        lbnomClie.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        lbnomClie.setText("nombre cliente");
        pnCliente1.add(lbnomClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 560, 40));

        jLabel20.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel20.setText("Cedula:");
        pnCliente1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 40));

        lbcedCli.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbcedCli.setText("Datos");
        pnCliente1.add(lbcedCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 240, 40));

        jLabel22.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel22.setText("Plan: ");
        pnCliente1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 80, 40));

        jLabel23.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel23.setText("Correo:");
        pnCliente1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 170, 40));

        jLabel24.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel24.setText("Bienvenido: ");
        pnCliente1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 180, 40));

        lbnomInstr.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        lbnomInstr.setText("nombre cliente");
        pnCliente1.add(lbnomInstr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 560, 40));

        btnSalirCli.setBackground(new java.awt.Color(255, 0, 0));
        btnSalirCli.setFont(new java.awt.Font("Lato Black", 0, 14)); // NOI18N
        btnSalirCli.setText("Salir");
        pnCliente1.add(btnSalirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 200, 70));

        jLabel25.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel25.setText("Sede: ");
        pnCliente1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 80, 40));

        lbtelClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbtelClie.setText("Datos");
        pnCliente1.add(lbtelClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 230, 40));

        lbdirClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbdirClie.setText("Datos");
        pnCliente1.add(lbdirClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 230, 40));

        lbocuClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbocuClie.setText("Datos");
        pnCliente1.add(lbocuClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 230, 40));

        lbsedeClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbsedeClie.setText("Datos");
        pnCliente1.add(lbsedeClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 230, 40));

        lbplanClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbplanClie.setText("Datos");
        pnCliente1.add(lbplanClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 250, 40));

        lbfInicio.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbfInicio.setText("Datos");
        pnCliente1.add(lbfInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 250, 40));

        lbfFin.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbfFin.setText("Datos");
        pnCliente1.add(lbfFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 250, 40));

        jLabel21.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel21.setText("Fecha de fin: ");
        pnCliente1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 170, 40));

        jLabel26.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel26.setText("Fecha de nacimiento: ");
        pnCliente1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 230, 40));

        jLabel27.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel27.setText("Fecha de inicio: ");
        pnCliente1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 170, 40));

        lbsexClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbsexClie.setText("Datos");
        pnCliente1.add(lbsexClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 250, 40));

        lbcorClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbcorClie.setText("Datos");
        pnCliente1.add(lbcorClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 250, 40));

        lbfecnaClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbfecnaClie.setText("Datos");
        pnCliente1.add(lbfecnaClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 250, 40));

        pnCliente.add(pnCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 660));

        pnInfo.add(pnCliente, "pnCliente");

        getContentPane().add(pnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 3, 1010, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JpaContraseña;
    private javax.swing.JTextField JtxUsuario;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirCli;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNombre_coach;
    private javax.swing.JLabel lbcedCli;
    private javax.swing.JLabel lbcorClie;
    private javax.swing.JLabel lbdirClie;
    private javax.swing.JLabel lbdirEmple;
    private javax.swing.JLabel lbfFin;
    private javax.swing.JLabel lbfInicio;
    private javax.swing.JLabel lbfecnaClie;
    private javax.swing.JLabel lbinfoBasico;
    private javax.swing.JLabel lbinfoPerso;
    private javax.swing.JLabel lbncargoEmple;
    private javax.swing.JLabel lbnomClie;
    private javax.swing.JLabel lbnomInstr;
    private javax.swing.JLabel lbnomsedeEmple;
    private javax.swing.JLabel lbnumEntre;
    private javax.swing.JLabel lbnumiEmpe;
    private javax.swing.JLabel lbocuClie;
    private javax.swing.JLabel lbplanClie;
    private javax.swing.JLabel lbsalEmple;
    private javax.swing.JLabel lbsedeClie;
    private javax.swing.JLabel lbsexClie;
    private javax.swing.JLabel lbtelClie;
    private javax.swing.JLabel lbtelEmple;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnCliente1;
    private javax.swing.JPanel pnConsulta;
    private javax.swing.JPanel pnEntrenador;
    private javax.swing.JPanel pnInfo;
    private javax.swing.JPanel pnIniciar;
    private javax.swing.JPanel pndatosCoach;
    private javax.swing.JTabbedPane tbpCoach;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
     btnAcceder.addActionListener(getControl());
     btnSalirCli.addActionListener(getControl());
     btnSalir.addActionListener(getControl());
    }
}
