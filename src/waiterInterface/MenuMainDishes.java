package waiterInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import waiterInterface.Order;

/**
 *
 * @author Jorshua Solorzano
 */
public class MenuMainDishes extends javax.swing.JInternalFrame {

    public MenuMainDishes() {
        super("Menú de platos fuertes");
        initComponents();
        saveOrder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbMainDishes = new javax.swing.JComboBox<>();
        spnMainDishes = new javax.swing.JSpinner();
        lblMainDishes = new javax.swing.JLabel();
        btnAddMD = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setAutoscrolls(true);
        setEnabled(false);
        setFocusCycleRoot(false);
        setFocusTraversalPolicyProvider(true);
        setFocusable(false);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(455, 657));

        jPanel1.setPreferredSize(new java.awt.Dimension(389, 536));
        jPanel1.setRequestFocusEnabled(false);

        cmbMainDishes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Arroz con pollo", "Arroz con camarones", "Casado de carne en salsa", "Casado de chuleta de cerdo", "Filete de pollo a la plancha", "Bistec de res encebollado", "Filete de pescado con papas", "Costilla de Cerdo con salsa BBQ", "Alitas de Pollo con salsa BBQ", "Hamburguesa sencilla", "Hamburguesa con papas ", "Macarrones con salsa y bolitas de carne", "Macarrones en salsa blanca con pollo" }));
        cmbMainDishes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbMainDishesMousePressed(evt);
            }
        });
        cmbMainDishes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMainDishesActionPerformed(evt);
            }
        });

        spnMainDishes.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        lblMainDishes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMainDishes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainDishes.setText("Platos fuertes");

        btnAddMD.setText("Agregar al pedido");
        btnAddMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spnMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnAddMD)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(btnAddMD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMainDishesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMainDishesActionPerformed

    }//GEN-LAST:event_cmbMainDishesActionPerformed
    private void btnAddMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMDActionPerformed
        saveOrder();
    }//GEN-LAST:event_btnAddMDActionPerformed

    private void cmbMainDishesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMainDishesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMainDishesMousePressed

    public void saveOrder() {
        // Obtener el desayuno seleccionado y la cantidad del JComboBox y el JSpinner, respectivamente
        String selectedMainDishes = (String) cmbMainDishes.getSelectedItem();
        int quantityMainDishes = (int) spnMainDishes.getValue();

        // Construir el texto a guardar
        String text = "Pedido para mesa #: " + selectedMainDishes +", "+ quantityMainDishes + "\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orden.txt", true))) {
            writer.write(text);
            writer.newLine(); 
        } catch (IOException e) {
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddMD;
    private javax.swing.JComboBox<String> cmbMainDishes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMainDishes;
    private javax.swing.JSpinner spnMainDishes;
    // End of variables declaration//GEN-END:variables
}
