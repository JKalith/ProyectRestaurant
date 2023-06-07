/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AdminInterface;

import ClassPackage.Inventary;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class InterfaceInventaryControl extends javax.swing.JInternalFrame {

    public DefaultTableModel tableModel = new DefaultTableModel();
    public ArrayList<Inventary> productList = new ArrayList();
    public ArrayList<String> completeTxt = new ArrayList();
    ArrayList< Inventary> parts = new ArrayList<>();
    public boolean accepted;

    public InterfaceInventaryControl() {
        initComponents();

        chargeInventary();
        createProductInfo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAShowInventary = new javax.swing.JTextArea();
        lblDeleteElection = new javax.swing.JLabel();
        btnUpdateInventay = new javax.swing.JButton();
        lblSaveInventary = new javax.swing.JLabel();
        btnChargeInventary = new javax.swing.JButton();
        lblChargeInventary = new javax.swing.JLabel();
        btnDeleteElection = new javax.swing.JButton();
        bgPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        BorderPanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        lblInventaryName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTInventaryList = new javax.swing.JTable();

        jTAShowInventary.setColumns(20);
        jTAShowInventary.setRows(5);
        jScrollPane1.setViewportView(jTAShowInventary);

        lblDeleteElection.setText("Borrar Inventario");

        btnUpdateInventay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/GuardarInventario.png"))); // NOI18N
        btnUpdateInventay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateInventayActionPerformed(evt);
            }
        });

        lblSaveInventary.setText("Actualizar inventario");

        btnChargeInventary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/cajas-de-carga-de-trabajador.png"))); // NOI18N
        btnChargeInventary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargeInventaryActionPerformed(evt);
            }
        });

        lblChargeInventary.setText("Añadir Producto");

        btnDeleteElection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/circulo-de-basura.png"))); // NOI18N
        btnDeleteElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteElectionActionPerformed(evt);
            }
        });

        bgPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout bgPanel2Layout = new javax.swing.GroupLayout(bgPanel2);
        bgPanel2.setLayout(bgPanel2Layout);
        bgPanel2Layout.setHorizontalGroup(
            bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        bgPanel2Layout.setVerticalGroup(
            bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        lblTitle.setText("                                   Inventario total");

        BorderPanel.setBackground(new java.awt.Color(51, 51, 51));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/salida.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblInventaryName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblInventaryName.setForeground(new java.awt.Color(0, 153, 153));
        lblInventaryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInventaryName.setText("Control Inventario");
        lblInventaryName.setOpaque(true);

        javax.swing.GroupLayout BorderPanelLayout = new javax.swing.GroupLayout(BorderPanel);
        BorderPanel.setLayout(BorderPanelLayout);
        BorderPanelLayout.setHorizontalGroup(
            BorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorderPanelLayout.createSequentialGroup()
                .addComponent(btnExit)
                .addGap(228, 228, 228)
                .addComponent(lblInventaryName)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        BorderPanelLayout.setVerticalGroup(
            BorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(BorderPanelLayout.createSequentialGroup()
                .addComponent(lblInventaryName)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTInventaryList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre del producto", "Cantidad existente", "Cantidad minima necesaria", "precio por unidad", "Cantidad sugerida", "Precio total producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTInventaryList);

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BorderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaveInventary)
                    .addComponent(btnUpdateInventay)
                    .addComponent(btnChargeInventary)
                    .addComponent(btnDeleteElection, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeleteElection)
                    .addComponent(lblChargeInventary))
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(842, 842, 842)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(BorderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblSaveInventary))
                            .addComponent(btnUpdateInventay))
                        .addGap(14, 14, 14)
                        .addComponent(btnChargeInventary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblChargeInventary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteElection, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblDeleteElection, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(379, 379, 379)
                .addComponent(bgPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     *
     * @param evt dispose the frame
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        dispose();

    }//GEN-LAST:event_btnExitActionPerformed
    /**
     *
     * @param evt This button deletes the selected row spaces
     *
     */
    private void btnDeleteElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteElectionActionPerformed

        DefaultTableModel tableModel = (DefaultTableModel) jTInventaryList.getModel();

        int selectedRow = jTInventaryList.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
        }

    }//GEN-LAST:event_btnDeleteElectionActionPerformed
    /**
     *
     * @param evt this button calls the addNewItem method to add new writing
     * spacesof objects
     *
     */
    private void btnChargeInventaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChargeInventaryActionPerformed
        addNewItem();


    }//GEN-LAST:event_btnChargeInventaryActionPerformed
    /**
     *
     * @param evt Write the data to the TXT
     */
    private void btnUpdateInventayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateInventayActionPerformed
        Inventary inventary = new Inventary();
        String fieldName = "Inventario.txt";
        File file = new File("Inventario.txt");

        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);

            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fieldName, false));

                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    String code = tableModel.getValueAt(i, 0).toString();

                    String product = tableModel.getValueAt(i, 1).toString();

                    String amount = tableModel.getValueAt(i, 2).toString();

                    String minAmount = (tableModel.getValueAt(i, 3).toString());
                    String suggestedPurchase = tableModel.getValueAt(i, 4).toString();
                    String unitPrice = (tableModel.getValueAt(i, 5).toString());

                    inventary = parseInfo(code, product, amount, minAmount, unitPrice, suggestedPurchase);
                    parts.add(inventary);

                }
                for (int i = 0; i < parts.size(); i++) {
                    bufferedWriter.write(parts.get(i).addDatta() + "\n");
                }

                parts.clear();

            }

        } catch (IOException ex) {
            Logger.getLogger(InterfaceInventaryControl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnUpdateInventayActionPerformed

    public static void main(String[] args) {

    }

    /**
     * generates a row to add data
     */
    public void addNewItem() {

        Object[] rowData = {"0", "nombre Aqui", "0", "0", "0", "0", "0"};
        tableModel.addRow(rowData);//va dentro del for con lo de los vectores con split

        jTInventaryList.setModel(tableModel);

    }

    /**
     * This function loads the data from the TXT
     */
    public void chargeInventary() {
        int count = 0;
        try {
            String filePath = "Inventario.txt";
            File file = new File(filePath);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;

                while ((line = reader.readLine()) != null) {
                    completeTxt.add(count, line);

                    count++;
                }
                reader.close();
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This function creates the columns
     */
    public void makeColumns() {

      

    }

    /**
     * Add the data to each row
     */
    public void createProductInfo() {
        int count = 0;
         tableModel.addColumn("Codigo");
        tableModel.addColumn("Nombre del producto");
        tableModel.addColumn("Cantidad existente");
        tableModel.addColumn("Cantidad minima necesaria");
        tableModel.addColumn("precio por unidad ");
        tableModel.addColumn("Cantidad sugerida");
        tableModel.addColumn("Precio total producto");

        for (String litextoCompletonea : completeTxt) {
            String[] item = litextoCompletonea.split(",");
            String code = item[0].trim();
            String product = (item[1]);
            String amount = (item[2].trim());
            String minAmount = (item[3].trim());
            String unitPrice = (item[4].trim());
            String suggestedPurchase = (item[5].trim());
            String totalProductPrice = (item[6].trim());

            Inventary inventary = new Inventary();
            inventary = parseInfo(code, product, amount, minAmount, suggestedPurchase, unitPrice);
            addProductInventary(inventary.getProductCode(), inventary.getProductName(), inventary.getAmount(), inventary.getMinAmount(), inventary.getSuggestedPurchase(), inventary.getUnitPrice(), inventary.getTotalProductPrice());

            Object[] rowData = {productList.get(count).getProductCode(), productList.get(count).getProductName(), productList.get(count).getAmount(), productList.get(count).getMinAmount(), productList.get(count).getSuggestedPurchase(), productList.get(count).getUnitPrice(), productList.get(count).getTotalProductPrice()};
            tableModel.addRow(rowData);

//          
            count++;
        }

        jTInventaryList.setModel(tableModel);
    }

    /**
     * Change the data type from string to int
     *
     * @param productCode this a productCode
     * @param productName this a product name
     * @param amount this a amount
     * @param minAmount this a minAmount
     * @param unitPrice this a unitPrice for de product
     * @param suggestedPurcharse this a suggested purcharse
     * @return
     */
    public Inventary parseInfo(String productCode, String productName, String amount, String minAmount, String unitPrice, String suggestedPurcharse) {
        int quantity = Integer.parseInt(amount);
        int minQuantity = Integer.parseInt(minAmount);
        int suggestedQuantity = Integer.parseInt(suggestedPurcharse);
        int unitCost = Integer.parseInt(unitPrice);
        int ProductPrice = quantity * unitCost;

        return new Inventary(productCode, productName, quantity, minQuantity, unitCost, suggestedQuantity, ProductPrice);

    }

    /**
     * performs the calculation of the data to verify if it meets the necessary
     * quantity and the value of the product
     *
     * @param productCode this a productCode
     * @param productName this a product name
     * @param amount this a amount
     * @param minAmount this a minAmount
     * @param unitPrice this a unitPrice for de product
     * @param suggestedPurcharse this a suggested purcharse
     * @param totalProductPrice this a total price
     *
     *
     *
     *
     *
     */
    public void addProductInventary(String productCode, String productName, int amount, int minAmount, int unitPrice, int suggestedPurcharse, int totalProductPrice) {

        totalProductPrice = amount * unitPrice;
        suggestedPurcharse = (minAmount - amount);

        if (suggestedPurcharse < 0) {

            suggestedPurcharse = 0;
        } else {
            System.out.println("debe comprar ");

        }

        Inventary product = new Inventary(productCode, productName, amount, minAmount, unitPrice, suggestedPurcharse, totalProductPrice);

        productList.add(product);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BorderPanel;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JPanel bgPanel2;
    private javax.swing.JButton btnChargeInventary;
    private javax.swing.JButton btnDeleteElection;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdateInventay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAShowInventary;
    private javax.swing.JTable jTInventaryList;
    private javax.swing.JLabel lblChargeInventary;
    private javax.swing.JLabel lblDeleteElection;
    private javax.swing.JLabel lblInventaryName;
    private javax.swing.JLabel lblSaveInventary;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
