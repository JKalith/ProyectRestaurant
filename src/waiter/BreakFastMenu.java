package Waiter;

import static Waiter.Order.txtOrder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Jorshua Solorzano
 */
public class BreakFastMenu extends javax.swing.JInternalFrame {

    public BreakFastMenu() {
        super("Menú de desayunos");
        initComponents();
    }

    public void saveOrder(JTextArea txtOrder) {
        // Obtener el desayuno seleccionado y la cantidad del JComboBox y el JSpinner, respectivamente
        String selectedBreakFast = (String) cmbBreakFasts.getSelectedItem();
        int quantityBreakfasts = (int) spnBreakFasts.getValue();

        // Verificar si se ha seleccionado una opción válida en el JComboBox y el JSpinner
        if (selectedBreakFast.equals("Elegir...") || quantityBreakfasts == 0) {
            // Mostrar un mensaje de error 
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opción válida");
            return; // Salir del método sin guardar el pedido
        }

        // Construir el texto a guardar
        StringBuilder textBuilder = new StringBuilder("Pedido para mesa: ");

        if (!selectedBreakFast.equals("Elegir...")) {
            textBuilder.append(selectedBreakFast).append(", ");
        }

        if (quantityBreakfasts != 0) {
            textBuilder.append(quantityBreakfasts);
        }

        String text = textBuilder.toString() + "\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Order.txt", true))) {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Kitchen.txt", true))) {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
        }

        // Agregar la información al JTextArea de destino
        txtOrder.append(text);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Historial.txt", true))) {
            writer.write(text);
        } catch (IOException e) {
        }

        // Vaciar el contenido del archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Order.txt", false))) {
            writer.write(" ");
        } catch (IOException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbBreakFasts = new javax.swing.JComboBox<>();
        lblBreakFasts = new javax.swing.JLabel();
        spnBreakFasts = new javax.swing.JSpinner();
        btnAddBF = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(455, 657));

        cmbBreakFasts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Gallopinto especial ", "Sandwich de jamon y queso ", "Sandwich de pollo ", "Pupusa de queso y frijoles ", "Panqueques con miel y avena " }));

        lblBreakFasts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBreakFasts.setText("Desayunos");

        spnBreakFasts.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        btnAddBF.setText("Agregar al pedido");
        btnAddBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBFActionPerformed(evt);
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
                        .addComponent(btnAddBF)))
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
                .addComponent(btnAddBF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBFActionPerformed
        saveOrder(txtOrder);
    }//GEN-LAST:event_btnAddBFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddBF;
    private javax.swing.JComboBox<String> cmbBreakFasts;
    private javax.swing.JLabel lblBreakFasts;
    private javax.swing.JSpinner spnBreakFasts;
    // End of variables declaration//GEN-END:variables
}
