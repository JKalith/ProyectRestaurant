package Waiter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static Waiter.Order.txtOrder;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *Este JInternal frame se encarga de mostrar el menú de platos fuertes, aquí se van a gestionar los platos fuertes escogidos 
 *y su cantidad.
 * @author Jorshua Solórzano
 */
public class MenuMainDishes extends javax.swing.JInternalFrame {

    public MenuMainDishes() {
        // Establecer el título de la ventana
        super("Menú de platos fuertes");
        initComponents();
//        atributes();
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

        cmbMainDishes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir..." }));
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
                        .addGap(140, 140, 140)
                        .addComponent(btnAddMD))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(spnMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
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

    //Tiene la funcionabilidad de guardar el pedido
    private void btnAddMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMDActionPerformed
        saveOrder(txtOrder);
    }//GEN-LAST:event_btnAddMDActionPerformed

    private void cmbMainDishesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMainDishesMousePressed
        
    }//GEN-LAST:event_cmbMainDishesMousePressed

    public void saveOrder(JTextArea txtOrder) {
        // Obtener el desayuno seleccionado y la cantidad del JComboBox cmbMainDishes y el JSpinner spnMainDishes, respectivamente.
        String selectedMainDishes = (String) cmbMainDishes.getSelectedItem();
        int quantityMainDishes = (int) spnMainDishes.getValue();

        // Verificar si se ha seleccionado una opción válida en el JComboBox cmbMainDishes y el JSpinner spnMainDishes.
        if (selectedMainDishes.equals("Elegir...") || quantityMainDishes == 0) {
            // Mostrar un mensaje de error 
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opción válida");
            return; // Salir del método sin guardar el pedido
        }

        // Construir el texto a guardar
        StringBuilder textBuilder = new StringBuilder("Pedido para mesa: ");
        //Guardar las opciones de platos fuertes seleccionadas que sean validas.
        if (!selectedMainDishes.equals("Elegir...")) {
            textBuilder.append(selectedMainDishes).append(", ");
        }
        //Guardar las cantidades de platos fuertes seleccionadas que sean validas.
        if (quantityMainDishes != 0) {
            textBuilder.append(quantityMainDishes);
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
        //Guardar en los pedidos que van para la cocina
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Kitchen.txt", true))) {
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

//        public void atributes(){
//    MealMap mealmap = new MealMap();
//        String filter = "MD";
//        try {
//            mealmap.filtrarPorCodigo(filter, cmbMainDishes, spnMainDishes);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(BreakFastMenu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddMD;
    private javax.swing.JComboBox<String> cmbMainDishes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMainDishes;
    private javax.swing.JSpinner spnMainDishes;
    // End of variables declaration//GEN-END:variables
}
