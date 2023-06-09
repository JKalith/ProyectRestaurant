package Waiter;

import static Waiter.Order.txtOrder;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * Este JInternal frame se encarga de mostrar el menú de batidos, aquí se van a
 * gestionar los batidos escogidos y su cantidad.
 *
 * @author Jorshua Solórzano
 */
public class ShakesMenu extends javax.swing.JInternalFrame {

    public ShakesMenu() {
        // Establecer el título de la ventana
        super("Menú de batidos");
        initComponents();
//        atributes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbShakes = new javax.swing.JComboBox<>();
        spnShakes = new javax.swing.JSpinner();
        lblShakes = new javax.swing.JLabel();
        btnAddMD = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(455, 657));

        jPanel1.setPreferredSize(new java.awt.Dimension(389, 536));
        jPanel1.setRequestFocusEnabled(false);

        cmbShakes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir..." }));
        cmbShakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbShakesActionPerformed(evt);
            }
        });

        spnShakes.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        lblShakes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblShakes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShakes.setText("Batidos");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddMD)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(cmbShakes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnShakes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(lblShakes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblShakes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbShakes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnShakes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addComponent(btnAddMD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
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

    private void cmbShakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbShakesActionPerformed

    }//GEN-LAST:event_cmbShakesActionPerformed
    //Tiene la funcionabilidad de guardar el pedido
    private void btnAddMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMDActionPerformed
        saveOrder(txtOrder);
    }//GEN-LAST:event_btnAddMDActionPerformed

    public void saveOrder(JTextArea txtOrder) {
        // Obtener el desayuno seleccionado y la cantidad del JComboBox cmbShakes y el JSpinner spnShakes, respectivamente.
        String selectedShakes = (String) cmbShakes.getSelectedItem();
        int quantityShakes = (int) spnShakes.getValue();

        // Verificar si se ha seleccionado una opción válida en el JComboBox cmbShakes y el JSpinner spnShakes.
        if (selectedShakes.equals("Elegir...") || quantityShakes == 0) {
            // Mostrar un mensaje de error 
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opción válida");
            return; // Salir del método sin guardar el pedido
        }

        // Construir el texto a guardar
        StringBuilder textBuilder = new StringBuilder("Pedido para mesa: ");
        //Guardar las opciones de batidos seleccionados que sean validos.
        if (!selectedShakes.equals("Elegir...")) {
            textBuilder.append(selectedShakes).append(", ");
        }
        //Guardar las cantidades de batidos seleccionados que sean validos.
        if (quantityShakes != 0) {
            textBuilder.append(quantityShakes);
        }

        String text = textBuilder.toString() + "\n";

        // Agregar la información al txtOrder del JInternal frame Order
        txtOrder.append(text);

        //Guardar como nuevo pedido
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Order.txt", true))) {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
        }
        
        //Guardar en los pedidos que van para la bar
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Bar.txt", true))) {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
        }

        //Guardar los datos en el historial del punto de venta
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Historial.txt", true))) {
            writer.write(text);
        } catch (IOException e) {
        }

        // Vaciar el contenido del archivo para darle campo al siguiente pedido
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Order.txt", false))) {
            writer.write(" ");
        } catch (IOException e) {
        }
    }
    
//           public void atributes() {
//        MealMap mealmap = new MealMap();
//        String filter = "S";
//        try {
//            mealmap.filtrarPorCodigo(filter, cmbShakes, spnShakes);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(BreakFastMenu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddMD;
    private javax.swing.JComboBox<String> cmbShakes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblShakes;
    private javax.swing.JSpinner spnShakes;
    // End of variables declaration//GEN-END:variables
}
