package waiterInterface;

import waiterInterface.Order;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jorshua Solorzano
 */
public class BreakFastMenu extends javax.swing.JInternalFrame {

    public BreakFastMenu() {
        super("Menú de desayunos");
        initComponents();
    }

    public void saveOrder() {
        // Obtener el desayuno seleccionado y la cantidad del JComboBox y el JSpinner, respectivamente
        String selectedBreakFast = (String) cmbBreakFasts.getSelectedItem();
        int quantityBreakfasts = (int) spnBreakFasts.getValue();

        // Construir el texto a guardar
        String text = "Pedido para mesa #: " + selectedBreakFast +", "+ quantityBreakfasts + "\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orden.txt", true))) {
            writer.write(text);
            writer.newLine(); 
        } catch (IOException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbBreakFasts = new javax.swing.JComboBox<>();
        lblBreakFasts = new javax.swing.JLabel();
        spnBreakFasts = new javax.swing.JSpinner();
        btnAddMD = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(455, 657));

        cmbBreakFasts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Gallopinto especial ", "Sandwich de jamon y queso ", "Sandwich de pollo ", "Pupusa de queso y frijoles ", "Panqueques con miel y avena " }));

        lblBreakFasts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBreakFasts.setText("Desayunos");

        spnBreakFasts.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        btnAddMD.setText("Agregar al pedido");
        btnAddMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lblBreakFasts))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(cmbBreakFasts, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(spnBreakFasts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnAddMD)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblBreakFasts)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBreakFasts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBreakFasts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addComponent(btnAddMD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMDActionPerformed
        saveOrder();
    }//GEN-LAST:event_btnAddMDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddMD;
    private javax.swing.JComboBox<String> cmbBreakFasts;
    private javax.swing.JLabel lblBreakFasts;
    private javax.swing.JSpinner spnBreakFasts;
    // End of variables declaration//GEN-END:variables
}
