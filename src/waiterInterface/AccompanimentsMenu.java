package waiterInterface;

import waiterInterface.Order;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jorshua Solorzano
 */

public class AccompanimentsMenu extends javax.swing.JInternalFrame {

    public AccompanimentsMenu() {
        super("Menú de acompañamientos");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbAccompaniaments = new javax.swing.JComboBox<>();
        spnAccompaniaments = new javax.swing.JSpinner();
        lblMainDishes = new javax.swing.JLabel();
        btnAddMD = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(455, 657));

        jPanel1.setPreferredSize(new java.awt.Dimension(389, 536));
        jPanel1.setRequestFocusEnabled(false);

        cmbAccompaniaments.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Pure de Papas", "Ensalada Cesar", "Ensalada Rusa", "Ensalada Verde", "Ceviche de pescado", "Ceviche de camarones", "Ceviche de platano verde", "Caracolitos con atún", "Verduras a la mantequilla", "Orden de papas fritas", "Frijoles fritos" }));
        cmbAccompaniaments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccompaniamentsActionPerformed(evt);
            }
        });

        spnAccompaniaments.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        lblMainDishes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMainDishes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainDishes.setText("Acompañamientos");

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
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbAccompaniaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnAccompaniaments, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddMD)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAccompaniaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAccompaniaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addComponent(btnAddMD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
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

    private void cmbAccompaniamentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccompaniamentsActionPerformed

    }//GEN-LAST:event_cmbAccompaniamentsActionPerformed

    private void btnAddMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMDActionPerformed
        saveOrder();
    }//GEN-LAST:event_btnAddMDActionPerformed
    public void saveOrder() {
        // Obtener el desayuno seleccionado y la cantidad del JComboBox y el JSpinner, respectivamente
        String selectedAccompaniments = (String) cmbAccompaniaments.getSelectedItem();
        int quantityAccompaniments = (int) spnAccompaniaments.getValue();

        // Construir el texto a guardar
        String text = "Pedido para mesa #: " + selectedAccompaniments +", "+ quantityAccompaniments + "\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orden.txt", true))) {
            writer.write(text);
            writer.newLine(); 
        } catch (IOException e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddMD;
    private javax.swing.JComboBox<String> cmbAccompaniaments;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMainDishes;
    private javax.swing.JSpinner spnAccompaniaments;
    // End of variables declaration//GEN-END:variables
}
