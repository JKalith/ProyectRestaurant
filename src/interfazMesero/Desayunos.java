package interfazMesero;

public class Desayunos extends javax.swing.JInternalFrame {

    public Desayunos() {
        initComponents();
    }

    public void cantidadD() {

        String spinnerD = spnDesayuno.getValue().toString();
        txtPedido.append("\nCantidad de desayunos: " + spinnerD);
    }

    public void cantidadP() {
        String spinnerP = spnPlatillo.getValue().toString();
        txtPedido.append("\nCantidad de platillos fuertes: " + spinnerP);
    }

    public void cantidadR() {
        String spinnerR = spnRefresco.getValue().toString();
        txtPedido.append("\nCantidad de refrescos: " + spinnerR);
    }

    public void cantidadA() {
        String spinnerA = spnAlcoholica.getValue().toString();
        txtPedido.append("\nCantidad de bebidas alcoholicas: " + spinnerA);
    }

    public void pedidosD() {

        String seleccionD = (String) cmbDesayuno.getSelectedItem();

        if (seleccionD.equals("Pinto con huevo picado y queso")) {
            txtPedido.append("\nDesayuno: Pinto con huevo picado y queso");
        } else if (seleccionD.equals("Tortillas con queso")) {
            txtPedido.append("\nDesayuno: Tortillas con queso");
        }
    }

    public void pedidosP() {

        String seleccionP = (String) cmbPlatillo.getSelectedItem();

        if (seleccionP.equals("Arroz con pollo")) {
            txtPedido.append("\nPlato fuerte: Arroz con pollo");
        } else if (seleccionP.equals("Arroz con camarones")) {
            txtPedido.append("\nPlato fuerte: Arroz con camarones");
        } else if (seleccionP.equals("Casado de carne en salsa")) {
            txtPedido.append("\nPlato fuerte: Casado de carne en salsa");
        }
    }

    public void pedidosR() {

        String seleccionR = (String) cmbRefresco.getSelectedItem();

        if (seleccionR.equals("Coca cola")) {
            txtPedido.append("\nRefresco: Coca cola");
        } else if (seleccionR.equals("Ginger ale")) {
            txtPedido.append("\nRefresco: Ginger ale");
        }
    }

    public void pedidosA() {

        String seleccionA = (String) cmbAlcoholic.getSelectedItem();

        if (seleccionA.equals("Ron")) {
            txtPedido.append("\nBebida alcoholica: Ron");
        } else if (seleccionA.equals("Tequilla")) {
            txtPedido.append("\nBebida alcoholica: Tequilla");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbDesayuno = new javax.swing.JComboBox<>();
        spnDesayuno = new javax.swing.JSpinner();
        lblDesayuno = new javax.swing.JLabel();
        cmbPlatillo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPedido = new javax.swing.JTextArea();
        spnPlatillo = new javax.swing.JSpinner();
        lblPlatillo = new javax.swing.JLabel();
        lblRefresco = new javax.swing.JLabel();
        cmbAlcoholic = new javax.swing.JComboBox<>();
        spnRefresco = new javax.swing.JSpinner();
        lblAlcoholica = new javax.swing.JLabel();
        cmbRefresco = new javax.swing.JComboBox<>();
        spnAlcoholica = new javax.swing.JSpinner();
        btnImprimir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1684, 1058));

        cmbDesayuno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pinto con huevo picado y queso", "Tortillas con queso", " " }));

        spnDesayuno.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        lblDesayuno.setText("Desayunos");

        cmbPlatillo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arroz con pollo", "Arroz con camarones", "Casado de carne en salsa", " " }));

        txtPedido.setColumns(20);
        txtPedido.setRows(5);
        jScrollPane1.setViewportView(txtPedido);

        spnPlatillo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        lblPlatillo.setText("Platillos fuertes");

        lblRefresco.setText("Refrescos");

        cmbAlcoholic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ron", "Tequilla", " " }));

        spnRefresco.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        lblAlcoholica.setText("Bebidas alcoholicas");

        cmbRefresco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coca cola", "Ginger ale", " " }));

        spnAlcoholica.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        btnImprimir.setText("Imprimir pedido");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPlatillo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDesayuno, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnPlatillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbRefresco, 0, 241, Short.MAX_VALUE)
                            .addComponent(cmbAlcoholic, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnAlcoholica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblDesayuno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRefresco)
                        .addGap(246, 246, 246))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblPlatillo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAlcoholica)
                        .addGap(204, 204, 204))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnImprimir)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDesayuno)
                            .addComponent(lblRefresco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlatillo)
                            .addComponent(lblAlcoholica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAlcoholic, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnAlcoholica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        pedidosD(); 
        cantidadD();
        pedidosP();
        cantidadP();
       pedidosR();
        cantidadR();
        pedidosA();
        cantidadA();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
txtPedido.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> cmbAlcoholic;
    private javax.swing.JComboBox<String> cmbDesayuno;
    private javax.swing.JComboBox<String> cmbPlatillo;
    private javax.swing.JComboBox<String> cmbRefresco;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlcoholica;
    private javax.swing.JLabel lblDesayuno;
    private javax.swing.JLabel lblPlatillo;
    private javax.swing.JLabel lblRefresco;
    private javax.swing.JSpinner spnAlcoholica;
    private javax.swing.JSpinner spnDesayuno;
    private javax.swing.JSpinner spnPlatillo;
    private javax.swing.JSpinner spnRefresco;
    private javax.swing.JTextArea txtPedido;
    // End of variables declaration//GEN-END:variables
}
