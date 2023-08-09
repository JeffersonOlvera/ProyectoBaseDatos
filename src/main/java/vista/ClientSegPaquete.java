
package vista;

public class ClientSegPaquete extends javax.swing.JFrame {

    public ClientSegPaquete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        iconoEncabezado = new javax.swing.JLabel();
        Botonera = new javax.swing.JPanel();
        tituloBotonera = new javax.swing.JLabel();
        entregaPaqueteBtn = new javax.swing.JButton();
        seguimientoPaqueteBtn = new javax.swing.JButton();
        historialEnvios = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtChofer = new javax.swing.JTextField();
        tituloBotonera3 = new javax.swing.JLabel();
        tituloBotonera5 = new javax.swing.JLabel();
        tituloBotonera7 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        BtnMenu = new javax.swing.JButton();
        BtnDevolucion = new javax.swing.JButton();
        tituloBotonera9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        tituloBotonera6 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        BtnCalificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtCodEnvio = new javax.swing.JTextField();
        tituloBotonera8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel - Cliente");

        Encabezado.setBackground(new java.awt.Color(47, 221, 217));

        iconoEncabezado.setBackground(new java.awt.Color(29, 29, 29));
        iconoEncabezado.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        iconoEncabezado.setForeground(new java.awt.Color(29, 29, 29));
        iconoEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen2 (100x100).png"))); // NOI18N
        iconoEncabezado.setText("Bienvenido a Express");
        iconoEncabezado.setAlignmentX(0.5F);
        iconoEncabezado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        iconoEncabezado.setIconTextGap(200);

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Botonera.setBackground(new java.awt.Color(98, 151, 170));

        tituloBotonera.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera.setForeground(new java.awt.Color(255, 255, 255));
        tituloBotonera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera.setText("Elige la actividad que necesites");

        entregaPaqueteBtn.setBackground(new java.awt.Color(29, 29, 29));
        entregaPaqueteBtn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        entregaPaqueteBtn.setForeground(new java.awt.Color(255, 255, 255));
        entregaPaqueteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon1.png"))); // NOI18N
        entregaPaqueteBtn.setText("Entrega de paquete");
        entregaPaqueteBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        entregaPaqueteBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        seguimientoPaqueteBtn.setBackground(new java.awt.Color(29, 29, 29));
        seguimientoPaqueteBtn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        seguimientoPaqueteBtn.setForeground(new java.awt.Color(255, 255, 255));
        seguimientoPaqueteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2.png"))); // NOI18N
        seguimientoPaqueteBtn.setText("Seguimiento de paquete");
        seguimientoPaqueteBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seguimientoPaqueteBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        seguimientoPaqueteBtn.setIconTextGap(0);
        seguimientoPaqueteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguimientoPaqueteBtnActionPerformed(evt);
            }
        });

        historialEnvios.setBackground(new java.awt.Color(29, 29, 29));
        historialEnvios.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        historialEnvios.setForeground(new java.awt.Color(255, 255, 255));
        historialEnvios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon3.png"))); // NOI18N
        historialEnvios.setText("Historial de envios");
        historialEnvios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        historialEnvios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(entregaPaqueteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seguimientoPaqueteBtn)
                    .addComponent(historialEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotoneraLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {entregaPaqueteBtn, historialEnvios, seguimientoPaqueteBtn, tituloBotonera});

        BotoneraLayout.setVerticalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addComponent(tituloBotonera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entregaPaqueteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(seguimientoPaqueteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(historialEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        BotoneraLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {historialEnvios, tituloBotonera});

        Panel.setBackground(new java.awt.Color(176, 202, 232));
        Panel.setForeground(new java.awt.Color(255, 255, 255));

        txtNombre.setEditable(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtChofer.setEditable(false);

        tituloBotonera3.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera3.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera3.setText("Datos del receptor:");

        tituloBotonera5.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera5.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera5.setText("Placa:");

        tituloBotonera7.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera7.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera7.setText("Chofer:");

        txtPlaca.setEditable(false);

        BtnMenu.setBackground(new java.awt.Color(29, 29, 29));
        BtnMenu.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnMenu.setForeground(new java.awt.Color(255, 255, 255));
        BtnMenu.setText("Menú");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        BtnDevolucion.setBackground(new java.awt.Color(29, 29, 29));
        BtnDevolucion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnDevolucion.setForeground(new java.awt.Color(255, 255, 255));
        BtnDevolucion.setText("Devolución");
        BtnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDevolucionActionPerformed(evt);
            }
        });

        tituloBotonera9.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera9.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera9.setText("Descripción del paquete:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        tituloBotonera6.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera6.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera6.setText("Estado:");

        txtEstado.setEditable(false);

        BtnCalificar.setBackground(new java.awt.Color(29, 29, 29));
        BtnCalificar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnCalificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCalificar.setText("Calificar");
        BtnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloBotonera9)
                    .addComponent(tituloBotonera7)
                    .addComponent(tituloBotonera5)
                    .addComponent(tituloBotonera6)
                    .addComponent(tituloBotonera3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChofer)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 33, Short.MAX_VALUE)))
                        .addGap(195, 195, 195))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnDevolucion)
                .addGap(18, 18, 18)
                .addComponent(BtnCalificar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloBotonera9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera6))
                .addGap(31, 31, 31)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCalificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(98, 151, 170));

        txtCodEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodEnvioActionPerformed(evt);
            }
        });

        tituloBotonera8.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera8.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera8.setText("Código de envio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(tituloBotonera8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seguimientoPaqueteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguimientoPaqueteBtnActionPerformed
 
    }//GEN-LAST:event_seguimientoPaqueteBtnActionPerformed

    private void BtnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDevolucionActionPerformed

    }//GEN-LAST:event_BtnDevolucionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void txtCodEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodEnvioActionPerformed

    private void BtnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCalificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botonera;
    public javax.swing.JButton BtnCalificar;
    public javax.swing.JButton BtnDevolucion;
    public javax.swing.JButton BtnMenu;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton entregaPaqueteBtn;
    private javax.swing.JButton historialEnvios;
    private javax.swing.JLabel iconoEncabezado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton seguimientoPaqueteBtn;
    private javax.swing.JLabel tituloBotonera;
    private javax.swing.JLabel tituloBotonera3;
    private javax.swing.JLabel tituloBotonera5;
    private javax.swing.JLabel tituloBotonera6;
    private javax.swing.JLabel tituloBotonera7;
    private javax.swing.JLabel tituloBotonera8;
    private javax.swing.JLabel tituloBotonera9;
    public javax.swing.JTextField txtChofer;
    public javax.swing.JTextField txtCodEnvio;
    public javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
