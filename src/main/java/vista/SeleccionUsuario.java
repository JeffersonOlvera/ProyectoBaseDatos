package vista;

public class SeleccionUsuario extends javax.swing.JFrame {

    public SeleccionUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        tituloEncabezado = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        EncabezadoPanel = new javax.swing.JPanel();
        tituloBotonera1 = new javax.swing.JLabel();
        btnConductor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel - Cliente");

        jPanel1.setBackground(new java.awt.Color(176, 202, 233));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 580));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));

        Encabezado.setBackground(new java.awt.Color(0, 123, 255));

        tituloEncabezado.setBackground(new java.awt.Color(51, 51, 51));
        tituloEncabezado.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        tituloEncabezado.setForeground(new java.awt.Color(51, 51, 51));
        tituloEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEncabezado.setText("Bienvenido a Express");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(tituloEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setForeground(new java.awt.Color(255, 255, 255));

        btnCliente.setBackground(new java.awt.Color(29, 29, 29));
        btnCliente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        EncabezadoPanel.setBackground(new java.awt.Color(0, 107, 222));

        tituloBotonera1.setBackground(new java.awt.Color(255, 255, 255));
        tituloBotonera1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera1.setForeground(new java.awt.Color(255, 255, 255));
        tituloBotonera1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera1.setText("Elija su tipo de Usuario ");

        javax.swing.GroupLayout EncabezadoPanelLayout = new javax.swing.GroupLayout(EncabezadoPanel);
        EncabezadoPanel.setLayout(EncabezadoPanelLayout);
        EncabezadoPanelLayout.setHorizontalGroup(
            EncabezadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoPanelLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(tituloBotonera1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        EncabezadoPanelLayout.setVerticalGroup(
            EncabezadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloBotonera1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnConductor.setBackground(new java.awt.Color(29, 29, 29));
        btnConductor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnConductor.setForeground(new java.awt.Color(255, 255, 255));
        btnConductor.setText("Conductor");
        btnConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConductorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(btnConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EncabezadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addComponent(EncabezadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliente)
                    .addComponent(btnConductor))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed

    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConductorActionPerformed

    }//GEN-LAST:event_btnConductorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel EncabezadoPanel;
    private javax.swing.JPanel Panel;
    public javax.swing.JButton btnCliente;
    public javax.swing.JButton btnConductor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloBotonera1;
    private javax.swing.JLabel tituloEncabezado;
    // End of variables declaration//GEN-END:variables
}
