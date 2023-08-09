package vista;

import javax.swing.table.TableModel;

public class ClientFactura extends javax.swing.JFrame {

    Tabla t = new Tabla();

    public ClientFactura() {
        initComponents();
    }

    public void cambiarModeloTabla(TableModel nuevoModelo) {
        tabla.setModel(nuevoModelo);

        tabla.setRowSelectionAllowed(false);
        tabla.setRowHeight(25);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        iconoEncabezado = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        BtnMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        tituloBotonera10 = new javax.swing.JLabel();
        tituloBotonera11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccionDestinatario = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNombreDestinatario = new javax.swing.JTextArea();
        tituloBotonera12 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        EncabezadoPanel = new javax.swing.JPanel();
        txtCodEnvio = new javax.swing.JTextField();
        tituloBotonera8 = new javax.swing.JLabel();
        tituloBotonera9 = new javax.swing.JLabel();

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
                .addComponent(iconoEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        BtnMenu.setBackground(new java.awt.Color(29, 29, 29));
        BtnMenu.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnMenu.setForeground(new java.awt.Color(255, 255, 255));
        BtnMenu.setText("Menú");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Descripción", "Código", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        tituloBotonera10.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera10.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera10.setForeground(new java.awt.Color(255, 51, 51));
        tituloBotonera10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera10.setText("Destinatario:");

        tituloBotonera11.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera11.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera11.setForeground(new java.awt.Color(255, 51, 51));
        tituloBotonera11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera11.setText("Destino:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDireccionDestinatario.setEditable(false);
        txtDireccionDestinatario.setBackground(new java.awt.Color(176, 202, 232));
        txtDireccionDestinatario.setColumns(20);
        txtDireccionDestinatario.setRows(5);
        jScrollPane1.setViewportView(txtDireccionDestinatario);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtNombreDestinatario.setEditable(false);
        txtNombreDestinatario.setBackground(new java.awt.Color(176, 202, 232));
        txtNombreDestinatario.setColumns(20);
        txtNombreDestinatario.setRows(5);
        jScrollPane3.setViewportView(txtNombreDestinatario);

        tituloBotonera12.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera12.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera12.setForeground(new java.awt.Color(255, 51, 51));
        tituloBotonera12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera12.setText("Fecha:");

        txtFecha.setEditable(false);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera10))
                .addGap(40, 40, 40)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloBotonera11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera12))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(304, 304, 304))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(tituloBotonera11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloBotonera10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(tituloBotonera12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        EncabezadoPanel.setBackground(new java.awt.Color(98, 151, 170));

        txtCodEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodEnvioActionPerformed(evt);
            }
        });

        tituloBotonera8.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera8.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera8.setText("Código de pedido:");

        tituloBotonera9.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera9.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonera9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera9.setText("Generación de factura");

        javax.swing.GroupLayout EncabezadoPanelLayout = new javax.swing.GroupLayout(EncabezadoPanel);
        EncabezadoPanel.setLayout(EncabezadoPanelLayout);
        EncabezadoPanelLayout.setHorizontalGroup(
            EncabezadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloBotonera9)
                .addGap(77, 77, 77)
                .addComponent(tituloBotonera8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EncabezadoPanelLayout.setVerticalGroup(
            EncabezadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EncabezadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera8)
                    .addComponent(tituloBotonera9))
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

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void txtCodEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodEnvioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnMenu;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel EncabezadoPanel;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel iconoEncabezado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tabla;
    private javax.swing.JLabel tituloBotonera10;
    private javax.swing.JLabel tituloBotonera11;
    private javax.swing.JLabel tituloBotonera12;
    private javax.swing.JLabel tituloBotonera8;
    private javax.swing.JLabel tituloBotonera9;
    public javax.swing.JTextField txtCodEnvio;
    public javax.swing.JTextArea txtDireccionDestinatario;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextArea txtNombreDestinatario;
    // End of variables declaration//GEN-END:variables
}
