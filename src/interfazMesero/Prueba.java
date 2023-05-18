/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfazMesero;

/**
 *
 * @author Jorshua Solorzano
 */
public class Prueba extends javax.swing.JInternalFrame {

    private String desayunoSeleccionado;
    private int cantidadDesayunos;
    private Pedido Pedido;
    public Prueba() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbDesayuno = new javax.swing.JComboBox<>();
        spnDesayuno = new javax.swing.JSpinner();
        lblDesayuno = new javax.swing.JLabel();
        btnImprimirDesayuno = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(1369, 536));
        jPanel1.setRequestFocusEnabled(false);

        cmbDesayuno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Pinto con huevo picado y queso", "Tortillas con queso", " " }));
        cmbDesayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDesayunoActionPerformed(evt);
            }
        });

        spnDesayuno.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        lblDesayuno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDesayuno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesayuno.setText("Desayunos");

        btnImprimirDesayuno.setText("Imprimir");
        btnImprimirDesayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirDesayunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnImprimirDesayuno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(spnDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(btnImprimirDesayuno)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDesayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDesayunoActionPerformed

    }//GEN-LAST:event_cmbDesayunoActionPerformed

    private void btnImprimirDesayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirDesayunoActionPerformed
        // Obtener el desayuno seleccionado y la cantidad del JComboBox y el JSpinner, respectivamente
        desayunoSeleccionado = (String) cmbDesayuno.getSelectedItem();
        cantidadDesayunos = (int) spnDesayuno.getValue();

        // Verificar si el JFrame InterPedido ya está creado
        if (Pedido != null) {
            // Construir el texto a agregar
            String texto = "Desayuno seleccionado: " + desayunoSeleccionado + "\n";
            texto += "Cantidad de desayunos: " + cantidadDesayunos + "\n";

            // Agregar el texto al JTextArea txtPedido en el JFrame InterPedido
            Pedido.agregarTexto(texto);
        }
    }//GEN-LAST:event_btnImprimirDesayunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirDesayuno;
    private javax.swing.JComboBox<String> cmbDesayuno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDesayuno;
    private javax.swing.JSpinner spnDesayuno;
    // End of variables declaration//GEN-END:variables
}
