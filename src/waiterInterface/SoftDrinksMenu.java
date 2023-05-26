package waiterInterface;

import waiterInterface.Order;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jorshua Solorzano
 */
public class SoftDrinksMenu extends javax.swing.JInternalFrame {

    public SoftDrinksMenu() {
        super("Menú de refrescos");
        initComponents();
    }

        public void saveOrder() {
        // Obtener el desayuno seleccionado y la cantidad del JComboBox y el JSpinner, respectivamente
        String selectedSoftDrinks = (String) cmbSoftDrinks.getSelectedItem();
        int quantitySoftDrinks = (int) spnSoftDrinks.getValue();

        // Construir el texto a guardar
        String text = "Pedido para mesa #: " + selectedSoftDrinks +", "+ quantitySoftDrinks + "\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orden.txt", true))) {
            writer.write(text);
            writer.newLine(); 
        } catch (IOException e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbSoftDrinks = new javax.swing.JComboBox<>();
        spnSoftDrinks = new javax.swing.JSpinner();
        lblMainDishes = new javax.swing.JLabel();
        btnAddMD = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(455, 657));

        jPanel1.setPreferredSize(new java.awt.Dimension(389, 536));
        jPanel1.setRequestFocusEnabled(false);

        cmbSoftDrinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Fresco de Limón", "Fresco de Cas", "Fresco de Tamarindo", "Fresco Horchata", "Coca Cola", "Pepsi", "Fanta Colita", "Fanta Naranja", "Fanta Uva", "Ginger ale", "Te frio de melocotón", "Te frio de Limón" }));
        cmbSoftDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSoftDrinksActionPerformed(evt);
            }
        });

        spnSoftDrinks.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        lblMainDishes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMainDishes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainDishes.setText("Refrescos");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbSoftDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnSoftDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnAddMD)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSoftDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnSoftDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(btnAddMD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
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

    private void cmbSoftDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSoftDrinksActionPerformed

    }//GEN-LAST:event_cmbSoftDrinksActionPerformed

    private void btnAddMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMDActionPerformed
        saveOrder();
    }//GEN-LAST:event_btnAddMDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddMD;
    private javax.swing.JComboBox<String> cmbSoftDrinks;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMainDishes;
    private javax.swing.JSpinner spnSoftDrinks;
    // End of variables declaration//GEN-END:variables
}
