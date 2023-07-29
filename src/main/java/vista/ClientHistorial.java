
package vista;

public class ClientHistorial extends javax.swing.JFrame {

    public ClientHistorial() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        tituloBotonera3 = new javax.swing.JLabel();
        tituloBotonera5 = new javax.swing.JLabel();
        tituloBotonera7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnGenerarFactura = new javax.swing.JButton();
        tituloBotonera9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        tituloBotonera3.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera3.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera3.setText("Código:");

        tituloBotonera5.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera5.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera5.setText("Dirección secundaria:");

        tituloBotonera7.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera7.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera7.setText("Dirección principal:");

        BtnCancelar.setBackground(new java.awt.Color(29, 29, 29));
        BtnCancelar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnGenerarFactura.setBackground(new java.awt.Color(29, 29, 29));
        BtnGenerarFactura.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnGenerarFactura.setForeground(new java.awt.Color(255, 255, 255));
        BtnGenerarFactura.setText("Generar Factura");
        BtnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarFacturaActionPerformed(evt);
            }
        });

        tituloBotonera9.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera9.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera9.setText("Descripción:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 102, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Dirección P.", "Dirección S.", "Estado", "Num. Placa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(BtnGenerarFactura)
                .addGap(75, 75, 75))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloBotonera9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloBotonera3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloBotonera7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloBotonera5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jTextField3)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloBotonera9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera5))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Botonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seguimientoPaqueteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguimientoPaqueteBtnActionPerformed
 
    }//GEN-LAST:event_seguimientoPaqueteBtnActionPerformed

    private void BtnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarFacturaActionPerformed

    }//GEN-LAST:event_BtnGenerarFacturaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botonera;
    public javax.swing.JButton BtnCancelar;
    public javax.swing.JButton BtnGenerarFactura;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton entregaPaqueteBtn;
    private javax.swing.JButton historialEnvios;
    private javax.swing.JLabel iconoEncabezado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton seguimientoPaqueteBtn;
    private javax.swing.JLabel tituloBotonera;
    private javax.swing.JLabel tituloBotonera3;
    private javax.swing.JLabel tituloBotonera5;
    private javax.swing.JLabel tituloBotonera7;
    private javax.swing.JLabel tituloBotonera9;
    // End of variables declaration//GEN-END:variables
}
