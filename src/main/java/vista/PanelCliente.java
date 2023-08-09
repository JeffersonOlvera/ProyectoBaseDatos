
package vista;

public class PanelCliente extends javax.swing.JFrame {

    public PanelCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botonera = new javax.swing.JPanel();
        tituloBotonera = new javax.swing.JLabel();
        BtnEntregaPaquete = new javax.swing.JButton();
        BtnSeguimientoPaquete = new javax.swing.JButton();
        BtnHistorialEnvios = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Encabezado = new javax.swing.JPanel();
        textoEncabezado = new javax.swing.JLabel();
        BtnCerrarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel - Cliente");

        Botonera.setBackground(new java.awt.Color(98, 151, 170));

        tituloBotonera.setBackground(new java.awt.Color(0, 0, 0));
        tituloBotonera.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloBotonera.setForeground(new java.awt.Color(255, 255, 255));
        tituloBotonera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonera.setText("Elige la actividad que necesites");

        BtnEntregaPaquete.setBackground(new java.awt.Color(29, 29, 29));
        BtnEntregaPaquete.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnEntregaPaquete.setForeground(new java.awt.Color(255, 255, 255));
        BtnEntregaPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon1.png"))); // NOI18N
        BtnEntregaPaquete.setText("Entrega de paquete");
        BtnEntregaPaquete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnEntregaPaquete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        BtnSeguimientoPaquete.setBackground(new java.awt.Color(29, 29, 29));
        BtnSeguimientoPaquete.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnSeguimientoPaquete.setForeground(new java.awt.Color(255, 255, 255));
        BtnSeguimientoPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2.png"))); // NOI18N
        BtnSeguimientoPaquete.setText("Seguimiento de paquete");
        BtnSeguimientoPaquete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnSeguimientoPaquete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnSeguimientoPaquete.setIconTextGap(0);
        BtnSeguimientoPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeguimientoPaqueteActionPerformed(evt);
            }
        });

        BtnHistorialEnvios.setBackground(new java.awt.Color(29, 29, 29));
        BtnHistorialEnvios.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnHistorialEnvios.setForeground(new java.awt.Color(255, 255, 255));
        BtnHistorialEnvios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon3.png"))); // NOI18N
        BtnHistorialEnvios.setText("Historial de envios");
        BtnHistorialEnvios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnHistorialEnvios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout BotoneraLayout = new javax.swing.GroupLayout(Botonera);
        Botonera.setLayout(BotoneraLayout);
        BotoneraLayout.setHorizontalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BtnEntregaPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSeguimientoPaquete)
                    .addComponent(BtnHistorialEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotoneraLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnEntregaPaquete, BtnHistorialEnvios, BtnSeguimientoPaquete, tituloBotonera});

        BotoneraLayout.setVerticalGroup(
            BotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoneraLayout.createSequentialGroup()
                .addComponent(tituloBotonera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEntregaPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BtnSeguimientoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BtnHistorialEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        BotoneraLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnHistorialEnvios, tituloBotonera});

        jPanel1.setBackground(new java.awt.Color(234, 234, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondoPanelCliente.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Encabezado.setBackground(new java.awt.Color(47, 221, 217));

        textoEncabezado.setBackground(new java.awt.Color(29, 29, 29));
        textoEncabezado.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        textoEncabezado.setForeground(new java.awt.Color(29, 29, 29));
        textoEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen2 (100x100).png"))); // NOI18N
        textoEncabezado.setText("Bienvenido a Express");
        textoEncabezado.setAlignmentX(0.5F);
        textoEncabezado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        textoEncabezado.setIconTextGap(200);

        BtnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrarSesion.png"))); // NOI18N

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCerrarSesion)
                .addGap(20, 20, 20))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSeguimientoPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeguimientoPaqueteActionPerformed
 
    }//GEN-LAST:event_BtnSeguimientoPaqueteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botonera;
    public javax.swing.JLabel BtnCerrarSesion;
    public javax.swing.JButton BtnEntregaPaquete;
    public javax.swing.JButton BtnHistorialEnvios;
    public javax.swing.JButton BtnSeguimientoPaquete;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel textoEncabezado;
    private javax.swing.JLabel tituloBotonera;
    // End of variables declaration//GEN-END:variables
}
