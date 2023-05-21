package interfazMesero;

import Mesero.Order;

/**
 *
 * @author Jorshua Solorzano
 */
public class BreakFastMenu extends javax.swing.JInternalFrame {
private String selectedBreakFast;
private int quantityBreakfasts;
private Order Order;

    public BreakFastMenu() {
         super("Menú de desayunos");
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbBreakFasts = new javax.swing.JComboBox<>();
        lblBreakFasts = new javax.swing.JLabel();
        spnBreakFasts = new javax.swing.JSpinner();
        btnPrint = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(455, 657));

        cmbBreakFasts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Gallopinto especial ", "Sandwich de jamon y queso ", "Sandwich de pollo ", "Pupusa de queso y frijoles ", "Panqueques con miel y avena " }));

        lblBreakFasts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBreakFasts.setText("Desayunos");

        spnBreakFasts.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        btnPrint.setText("Imprimir pedido");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPrint)
                            .addComponent(cmbBreakFasts, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(spnBreakFasts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addComponent(btnPrint)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // Obtener el desayuno seleccionado y la cantidad del JComboBox y el JSpinner, respectivamente
         selectedBreakFast = (String) cmbBreakFasts.getSelectedItem();
        quantityBreakfasts = (int) spnBreakFasts.getValue();

        // Verificar si el JInternalFrame Order ya está creado
        if (Order != null) {
            // Construir el text a agregar
            String text = "Desayuno seleccionado: " + selectedBreakFast + "\n";
            text += "Cantidad de desayunos: " + quantityBreakfasts + "\n";

            // Agregar el text al JTextArea txtPedido en el JInternalFrame Order
            Order.addText(text);
        }
    }//GEN-LAST:event_btnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox<String> cmbBreakFasts;
    private javax.swing.JLabel lblBreakFasts;
    private javax.swing.JSpinner spnBreakFasts;
    // End of variables declaration//GEN-END:variables
}
