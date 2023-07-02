
package vista;

public class EntregaPaquete extends javax.swing.JFrame {

    public EntregaPaquete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        tituloEncabezado = new javax.swing.JLabel();
        iconoEncabezado = new javax.swing.JLabel();
        Botonera = new javax.swing.JPanel();
        tituloBotonera = new javax.swing.JLabel();
        entregaPaqueteBtn = new javax.swing.JButton();
        seguimientoPaqueteBtn = new javax.swing.JButton();
        historialEnvios = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        tituloBotonera3 = new javax.swing.JLabel();
        tituloBotonera4 = new javax.swing.JLabel();
        tituloBotonera5 = new javax.swing.JLabel();
        tituloBotonera6 = new javax.swing.JLabel();
        tituloBotonera7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        tituloBotonera8 = new javax.swing.JLabel();
        tituloBotonera9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        historialEnvios1 = new javax.swing.JButton();
        historialEnvios2 = new javax.swing.JButton();
        EncabezadoPanel = new javax.swing.JPanel();
        tituloBotonera1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel - Cliente");

        jPanel1.setBackground(new java.awt.Color(176, 202, 233));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 580));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));

        Encabezado.setBackground(new java.awt.Color(47, 221, 217));

        tituloEncabezado.setBackground(javax.swing.UIManager.getDefaults().getColor("TextField.darkShadow"));
        tituloEncabezado.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        tituloEncabezado.setForeground(javax.swing.UIManager.getDefaults().getColor("TextField.darkShadow"));
        tituloEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEncabezado.setText("Bienvenido a Express");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Botonera.setBackground(new java.awt.Color(98, 151, 170));

        tituloBotonera.setBackground(new java.awt.Color(255, 255, 255));
        tituloBotonera.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera.setForeground(new java.awt.Color(255, 255, 255));
        tituloBotonera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera.setText("Elige la actividad que necesites");

        entregaPaqueteBtn.setBackground(new java.awt.Color(29, 29, 29));
        entregaPaqueteBtn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        entregaPaqueteBtn.setForeground(new java.awt.Color(255, 255, 255));
        entregaPaqueteBtn.setText("Entrega de paquete");
        entregaPaqueteBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        seguimientoPaqueteBtn.setBackground(new java.awt.Color(29, 29, 29));
        seguimientoPaqueteBtn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        seguimientoPaqueteBtn.setForeground(new java.awt.Color(255, 255, 255));
        seguimientoPaqueteBtn.setText("Seguimiento de paquete");
        seguimientoPaqueteBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seguimientoPaqueteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguimientoPaqueteBtnActionPerformed(evt);
            }
        });

        historialEnvios.setBackground(new java.awt.Color(29, 29, 29));
        historialEnvios.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        historialEnvios.setForeground(new java.awt.Color(255, 255, 255));
        historialEnvios.setText("Historial de envios");
        historialEnvios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(entregaPaqueteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seguimientoPaqueteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historialEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotoneraLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {historialEnvios, tituloBotonera});

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

        tituloBotonera3.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera3.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera3.setText("Nombres y apellidos:");

        tituloBotonera4.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera4.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera4.setText("Código pedido:");

        tituloBotonera5.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera5.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera5.setText("Dirección secundaria:");

        tituloBotonera6.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera6.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera6.setText("Teléfono:");

        tituloBotonera7.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera7.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera7.setText("Dirección principal:");

        tituloBotonera8.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera8.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera8.setText("Email:");

        tituloBotonera9.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera9.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera9.setText("Descripción:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        historialEnvios1.setBackground(new java.awt.Color(29, 29, 29));
        historialEnvios1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        historialEnvios1.setForeground(new java.awt.Color(255, 255, 255));
        historialEnvios1.setText("Siguiente");
        historialEnvios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialEnvios1ActionPerformed(evt);
            }
        });

        historialEnvios2.setBackground(new java.awt.Color(29, 29, 29));
        historialEnvios2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        historialEnvios2.setForeground(new java.awt.Color(255, 255, 255));
        historialEnvios2.setText("Cancelar");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                        .addComponent(tituloBotonera7)
                                        .addGap(4, 4, 4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                        .addComponent(tituloBotonera4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(tituloBotonera6))
                                            .addComponent(tituloBotonera8, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(tituloBotonera5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(tituloBotonera9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(5, 5, 5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloBotonera3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addComponent(historialEnvios2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(historialEnvios1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloBotonera9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(historialEnvios2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historialEnvios1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        EncabezadoPanel.setBackground(new java.awt.Color(0, 102, 255));

        tituloBotonera1.setBackground(new java.awt.Color(255, 255, 255));
        tituloBotonera1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera1.setForeground(new java.awt.Color(255, 255, 255));
        tituloBotonera1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera1.setText("Ingrese sus datos");

        javax.swing.GroupLayout EncabezadoPanelLayout = new javax.swing.GroupLayout(EncabezadoPanel);
        EncabezadoPanel.setLayout(EncabezadoPanelLayout);
        EncabezadoPanelLayout.setHorizontalGroup(
            EncabezadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(tituloBotonera1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        EncabezadoPanelLayout.setVerticalGroup(
            EncabezadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloBotonera1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EncabezadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EncabezadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void seguimientoPaqueteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguimientoPaqueteBtnActionPerformed
 
    }//GEN-LAST:event_seguimientoPaqueteBtnActionPerformed

    private void historialEnvios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialEnvios1ActionPerformed

    }//GEN-LAST:event_historialEnvios1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EntregaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntregaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntregaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntregaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntregaPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botonera;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel EncabezadoPanel;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton entregaPaqueteBtn;
    private javax.swing.JButton historialEnvios;
    private javax.swing.JButton historialEnvios1;
    private javax.swing.JButton historialEnvios2;
    private javax.swing.JLabel iconoEncabezado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton seguimientoPaqueteBtn;
    private javax.swing.JLabel tituloBotonera;
    private javax.swing.JLabel tituloBotonera1;
    private javax.swing.JLabel tituloBotonera3;
    private javax.swing.JLabel tituloBotonera4;
    private javax.swing.JLabel tituloBotonera5;
    private javax.swing.JLabel tituloBotonera6;
    private javax.swing.JLabel tituloBotonera7;
    private javax.swing.JLabel tituloBotonera8;
    private javax.swing.JLabel tituloBotonera9;
    private javax.swing.JLabel tituloEncabezado;
    // End of variables declaration//GEN-END:variables
}
