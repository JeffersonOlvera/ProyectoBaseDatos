
package vista;

public class ViewEntregaPaquete2 extends javax.swing.JFrame {

    public ViewEntregaPaquete2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        iconoEncabezado = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        tituloBotonera3 = new javax.swing.JLabel();
        tituloBotonera5 = new javax.swing.JLabel();
        tituloBotonera6 = new javax.swing.JLabel();
        tituloBotonera7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        tituloBotonera8 = new javax.swing.JLabel();
        tituloBotonera9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BtnCancelar = new javax.swing.JButton();
        BtnSiguiente = new javax.swing.JButton();
        EncabezadoPanel = new javax.swing.JPanel();
        tituloBotonera1 = new javax.swing.JLabel();

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
                .addComponent(iconoEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                .addContainerGap())
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

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
        tituloBotonera3.setText("Nombres y apellidos:");

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
        tituloBotonera9.setText("Descripción del paquete:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        BtnCancelar.setBackground(new java.awt.Color(29, 29, 29));
        BtnCancelar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnSiguiente.setBackground(new java.awt.Color(29, 29, 29));
        BtnSiguiente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(tituloBotonera9)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloBotonera6)
                            .addComponent(tituloBotonera3)
                            .addComponent(tituloBotonera7)
                            .addComponent(tituloBotonera5)
                            .addComponent(tituloBotonera8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
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
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloBotonera9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        EncabezadoPanel.setBackground(new java.awt.Color(0, 102, 255));

        tituloBotonera1.setBackground(new java.awt.Color(255, 255, 255));
        tituloBotonera1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera1.setForeground(new java.awt.Color(255, 255, 255));
        tituloBotonera1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera1.setText("Ingrese los datos de la persona a la que entregará el paquete ");

        javax.swing.GroupLayout EncabezadoPanelLayout = new javax.swing.GroupLayout(EncabezadoPanel);
        EncabezadoPanel.setLayout(EncabezadoPanelLayout);
        EncabezadoPanelLayout.setHorizontalGroup(
            EncabezadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloBotonera1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EncabezadoPanelLayout.setVerticalGroup(
            EncabezadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloBotonera1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Encabezado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EncabezadoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(EncabezadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed

    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnCancelar;
    public javax.swing.JButton BtnSiguiente;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel EncabezadoPanel;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel iconoEncabezado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel tituloBotonera1;
    private javax.swing.JLabel tituloBotonera3;
    private javax.swing.JLabel tituloBotonera5;
    private javax.swing.JLabel tituloBotonera6;
    private javax.swing.JLabel tituloBotonera7;
    private javax.swing.JLabel tituloBotonera8;
    private javax.swing.JLabel tituloBotonera9;
    // End of variables declaration//GEN-END:variables
}
