
package vista;

public class PanelConductor extends javax.swing.JFrame {

    public PanelConductor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        textoEncabezado = new javax.swing.JLabel();
        Botonera = new javax.swing.JPanel();
        tituloBotonera = new javax.swing.JLabel();
        BtnEntregaAsignada = new javax.swing.JButton();
        BtnDevolucionPendiente = new javax.swing.JButton();
        BtnHistorialEntregas = new javax.swing.JButton();
        BtnEditarPerfil = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel - Cliente");

        Encabezado.setBackground(new java.awt.Color(47, 221, 217));

        textoEncabezado.setBackground(new java.awt.Color(29, 29, 29));
        textoEncabezado.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        textoEncabezado.setForeground(new java.awt.Color(29, 29, 29));
        textoEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen2 (100x100).png"))); // NOI18N
        textoEncabezado.setText("Bienvenido a Express");
        textoEncabezado.setAlignmentX(0.5F);
        textoEncabezado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        textoEncabezado.setIconTextGap(200);

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                .addContainerGap())
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Botonera.setBackground(new java.awt.Color(98, 151, 170));

        tituloBotonera.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera.setForeground(new java.awt.Color(255, 255, 255));
        tituloBotonera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera.setText("Elige la actividad que necesites");

        BtnEntregaAsignada.setBackground(new java.awt.Color(29, 29, 29));
        BtnEntregaAsignada.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnEntregaAsignada.setForeground(new java.awt.Color(255, 255, 255));
        BtnEntregaAsignada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon6.png"))); // NOI18N
        BtnEntregaAsignada.setText("Entregas asignadas");
        BtnEntregaAsignada.setFocusPainted(false);
        BtnEntregaAsignada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnEntregaAsignada.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        BtnDevolucionPendiente.setBackground(new java.awt.Color(29, 29, 29));
        BtnDevolucionPendiente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnDevolucionPendiente.setForeground(new java.awt.Color(255, 255, 255));
        BtnDevolucionPendiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon4.png"))); // NOI18N
        BtnDevolucionPendiente.setText("Devoluciones pendientes");
        BtnDevolucionPendiente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnDevolucionPendiente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnDevolucionPendiente.setIconTextGap(0);
        BtnDevolucionPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDevolucionPendienteActionPerformed(evt);
            }
        });

        BtnHistorialEntregas.setBackground(new java.awt.Color(29, 29, 29));
        BtnHistorialEntregas.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnHistorialEntregas.setForeground(new java.awt.Color(255, 255, 255));
        BtnHistorialEntregas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon5.png"))); // NOI18N
        BtnHistorialEntregas.setText("Historial de entregas");
        BtnHistorialEntregas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BtnEditarPerfil.setBackground(new java.awt.Color(29, 29, 29));
        BtnEditarPerfil.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnEditarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconEditarPerfil.png"))); // NOI18N
        BtnEditarPerfil.setText("Editar perfil");
        BtnEditarPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnEditarPerfil.setIconTextGap(6);

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(BtnEntregaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnDevolucionPendiente)
                        .addComponent(BtnHistorialEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tituloBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        BotoneraLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnDevolucionPendiente, BtnEditarPerfil, BtnEntregaAsignada, BtnHistorialEntregas, tituloBotonera});

        BotoneraLayout.setVerticalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEntregaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BtnDevolucionPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BtnHistorialEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BtnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(234, 234, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondoPanelConductor.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDevolucionPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDevolucionPendienteActionPerformed
 
    }//GEN-LAST:event_BtnDevolucionPendienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botonera;
    public javax.swing.JButton BtnDevolucionPendiente;
    public javax.swing.JButton BtnEditarPerfil;
    public javax.swing.JButton BtnEntregaAsignada;
    public javax.swing.JButton BtnHistorialEntregas;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel textoEncabezado;
    private javax.swing.JLabel tituloBotonera;
    // End of variables declaration//GEN-END:variables
}
