package Vista;

import javax.swing.JButton;
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
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbnomClie = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbcodClie = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbnomInstr = new javax.swing.JLabel();
        btnSalirCli = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        lbtelClie = new javax.swing.JLabel();
        lbdirClie = new javax.swing.JLabel();
        lbmpagoClie = new javax.swing.JLabel();
        lbsedeClie = new javax.swing.JLabel();
        lbplanClie1 = new javax.swing.JLabel();

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
        jLabel3.setText("Usuario:");
        pnIniciar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 30));

        JtxUsuario.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        JtxUsuario.setToolTipText("");
        pnIniciar.add(JtxUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 210, 30));
        pnIniciar.add(JpaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, 30));

        btnAcceder.setBackground(new java.awt.Color(204, 255, 204));
        btnAcceder.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        btnAcceder.setText("Iniciar Sesión");
        pnIniciar.add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 160, 50));

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

        pnInfo.add(pnEntrenador, "card3");

        pnCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnCliente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnCliente1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 200, 230));

        jLabel18.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel18.setText("Instructor: ");
        pnCliente1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 130, 40));

        jLabel13.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel13.setText("Medio de pago: ");
        pnCliente1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 170, 40));

        jLabel15.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel15.setText("Fecha de fin: ");
        pnCliente1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 170, 40));

        jLabel16.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel16.setText("Telefono: ");
        pnCliente1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 120, 40));

        jLabel19.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel19.setText("Dirección: ");
        pnCliente1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 120, 40));

        lbnomClie.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        lbnomClie.setText("nombre cliente");
        pnCliente1.add(lbnomClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 560, 40));

        jLabel20.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel20.setText("Codigo del cliente: ");
        pnCliente1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 220, 40));

        lbcodClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbcodClie.setText("Datos");
        pnCliente1.add(lbcodClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 80, 40));

        jLabel22.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel22.setText("Plan: ");
        pnCliente1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 80, 40));

        jLabel23.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel23.setText("Fecha de inicio: ");
        pnCliente1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 170, 40));

        jLabel24.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel24.setText("Bienvenido: ");
        pnCliente1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 180, 40));

        lbnomInstr.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        lbnomInstr.setText("nombre cliente");
        pnCliente1.add(lbnomInstr, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 560, 40));

        btnSalirCli.setBackground(new java.awt.Color(255, 0, 0));
        btnSalirCli.setFont(new java.awt.Font("Lato Black", 0, 14)); // NOI18N
        btnSalirCli.setText("Salir");
        pnCliente1.add(btnSalirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 630, 180, -1));

        jLabel25.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel25.setText("Sede: ");
        pnCliente1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 80, 40));

        lbtelClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbtelClie.setText("Datos");
        pnCliente1.add(lbtelClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 230, 40));

        lbdirClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbdirClie.setText("Datos");
        pnCliente1.add(lbdirClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 80, 40));

        lbmpagoClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbmpagoClie.setText("Datos");
        pnCliente1.add(lbmpagoClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 80, 40));

        lbsedeClie.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbsedeClie.setText("Datos");
        pnCliente1.add(lbsedeClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 80, 40));

        lbplanClie1.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbplanClie1.setText("Datos");
        pnCliente1.add(lbplanClie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 80, 40));

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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNombre_coach;
    private javax.swing.JLabel lbcodClie;
    private javax.swing.JLabel lbdirClie;
    private javax.swing.JLabel lbdirEmple;
    private javax.swing.JLabel lbinfoBasico;
    private javax.swing.JLabel lbinfoPerso;
    private javax.swing.JLabel lbmpagoClie;
    private javax.swing.JLabel lbncargoEmple;
    private javax.swing.JLabel lbnomClie;
    private javax.swing.JLabel lbnomInstr;
    private javax.swing.JLabel lbnomsedeEmple;
    private javax.swing.JLabel lbnumEntre;
    private javax.swing.JLabel lbnumiEmpe;
    private javax.swing.JLabel lbplanClie1;
    private javax.swing.JLabel lbsalEmple;
    private javax.swing.JLabel lbsedeClie;
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
    }
}
