/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AdminInterface;

import ClassPackage.ProductMeal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class InterfaceChargeMenu extends javax.swing.JInternalFrame {

//    public HashMap<String, ProductMeal> productosMap = new HashMap<>();

    public InterfaceChargeMenu() {
        initComponents();
        chargeKitchenMenu();
        chargeBarMenu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BgPanel = new javax.swing.JPanel();
        BorderPanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        lblMenuCharge = new javax.swing.JLabel();
        btnUpdateMenu = new javax.swing.JButton();
        lblUpdatetxt = new javax.swing.JLabel();
        btnDeleteElection = new javax.swing.JButton();
        lblDeleteElecction = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTbWachMenus = new javax.swing.JTabbedPane();
        jspScrollMenuKitchen = new javax.swing.JScrollPane();
        taShowKintchenMenu = new javax.swing.JTextArea();
        jspScrollBarMenu = new javax.swing.JScrollPane();
        taShowBarMenu = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        BorderPanel.setBackground(new java.awt.Color(51, 51, 51));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/salida.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblMenuCharge.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblMenuCharge.setForeground(new java.awt.Color(0, 153, 153));
        lblMenuCharge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuCharge.setText("Cargar Menu");
        lblMenuCharge.setOpaque(true);

        javax.swing.GroupLayout BorderPanelLayout = new javax.swing.GroupLayout(BorderPanel);
        BorderPanel.setLayout(BorderPanelLayout);
        BorderPanelLayout.setHorizontalGroup(
            BorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorderPanelLayout.createSequentialGroup()
                .addComponent(btnExit)
                .addGap(269, 269, 269)
                .addComponent(lblMenuCharge)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BorderPanelLayout.setVerticalGroup(
            BorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(BorderPanelLayout.createSequentialGroup()
                .addComponent(lblMenuCharge)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnUpdateMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/flecha-de-circulo-de-disquete-a-la-derecha.png"))); // NOI18N
        btnUpdateMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMenuActionPerformed(evt);
            }
        });

        lblUpdatetxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUpdatetxt.setText("Actualizar menu");

        btnDeleteElection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/circulo-de-basura.png"))); // NOI18N
        btnDeleteElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteElectionActionPerformed(evt);
            }
        });

        lblDeleteElecction.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDeleteElecction.setText("Borrar eleccion ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Menu del Dia");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("| Codigo | Nombre del plato | Precio(Dolares) | ");

        taShowKintchenMenu.setColumns(20);
        taShowKintchenMenu.setRows(5);
        jspScrollMenuKitchen.setViewportView(taShowKintchenMenu);

        jTbWachMenus.addTab("Menu de platillos", jspScrollMenuKitchen);

        taShowBarMenu.setColumns(20);
        taShowBarMenu.setRows(5);
        jspScrollBarMenu.setViewportView(taShowBarMenu);

        jTbWachMenus.addTab("Menu del Bar", jspScrollBarMenu);

        javax.swing.GroupLayout BgPanelLayout = new javax.swing.GroupLayout(BgPanel);
        BgPanel.setLayout(BgPanelLayout);
        BgPanelLayout.setHorizontalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BorderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnUpdateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteElection, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUpdatetxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDeleteElecction, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)))
                .addComponent(jTbWachMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(256, 256, 256))))
        );
        BgPanelLayout.setVerticalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addComponent(BorderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnUpdateMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUpdatetxt)
                        .addGap(11, 11, 11)
                        .addComponent(btnDeleteElection, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDeleteElecction)
                        .addGap(132, 132, 132))
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTbWachMenus)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteElectionActionPerformed
        taShowKintchenMenu.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteElectionActionPerformed

    private void btnUpdateMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMenuActionPerformed
        try {
            updateKitchenMenu();
        } catch (IOException ex) {
            Logger.getLogger(InterfaceChargeMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateMenuActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JPanel BorderPanel;
    private javax.swing.JButton btnDeleteElection;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdateMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTbWachMenus;
    private javax.swing.JScrollPane jspScrollBarMenu;
    private javax.swing.JScrollPane jspScrollMenuKitchen;
    private javax.swing.JLabel lblDeleteElecction;
    private javax.swing.JLabel lblMenuCharge;
    private javax.swing.JLabel lblUpdatetxt;
    private javax.swing.JTextArea taShowBarMenu;
    private javax.swing.JTextArea taShowKintchenMenu;
    // End of variables declaration//GEN-END:variables

    public void chargeKitchenMenu() {
        try {
            // Ruta del archivo de texto
            String filePath = "C:\\Users\\Cesar\\OneDrive\\Escritorio\\Primer semestre 2023\\Progra II\\txt necesarios\\Menu.txt";

            // Verificar si el archivo existe
            File file = new File(filePath);
            if (file.exists()) {
                // Leer el archivo y almacenar su contenido en un StringBuilder
                StringBuilder content = new StringBuilder();
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                reader.close();
                taShowKintchenMenu.setText(content.toString());
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void chargeBarMenu() {
        try {
            // Ruta del archivo de texto
            String filePath = "C:\\Users\\Cesar\\OneDrive\\Escritorio\\Primer semestre 2023\\Progra II\\txt necesarios\\MenuBar.txt";

            // Verificar si el archivo existe
            File file = new File(filePath);
            if (file.exists()) {
                // Leer el archivo y almacenar su contenido en un StringBuilder
                StringBuilder content = new StringBuilder();
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                reader.close();
                taShowBarMenu.setText(content.toString());
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateKitchenMenu() throws IOException {
        File file = new File("C:\\Users\\Cesar\\OneDrive\\Escritorio\\Primer semestre 2023\\Progra II\\txt necesarios\\Menu.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(taShowKintchenMenu.getText());

        bufferedWriter.close();
        JOptionPane.showMessageDialog(null, "Se actualizaron el menu correctamente");
    }

     public void updateBarMenu() throws IOException {
        File file = new File("C:\\Users\\Cesar\\OneDrive\\Escritorio\\Primer semestre 2023\\Progra II\\txt necesarios\\MenuBar.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(taShowBarMenu.getText());

        bufferedWriter.close();
         JOptionPane.showMessageDialog(null, "Se actualizaron el menu correctamente");
    }
     
//    public void createProductInfo() {
//        String textoCompleto = taShowKintchenMenu.getText();
//        String[] line = textoCompleto.split(" >");
//        String category = ":";
//
//        for (String completeLine : line) {
//            if (completeLine.endsWith(":")) {
//                // La línea es una categoría
//                category = category.substring(0, category.length() - 1);
//            } else if (!completeLine.endsWith(" >")) {
//                String[] parts = completeLine.split(",");
//                String code = parts[0].trim();
//                String mealName = parts[1].trim();
//                double price = Double.parseDouble(parts[2].trim());
//                int amount = Integer.parseInt(parts[3].trim());
//                createMealMap(code, mealName, price, amount);
//            }
//        }
//    }
//    public void createMealMap(String code, String mealName, double price, int amount) {
//        ProductMeal productMeal = new ProductMeal(code, mealName, price, amount);
//        productosMap.put(productMeal.getMealCode(), productMeal);
//            createProductInfo();
//        taShowKintchenMenu.setText("");
//        for (Map.Entry<String, ProductMeal> entry : productosMap.entrySet()) {
//            String codigo = entry.getKey();
//            ProductMeal producto = entry.getValue();
//            String nombre = producto.getMealName();
//            double precio = producto.getMealPrice();
//            int cantidad = producto.getMealAmount();
//
//            // Concatenar la información del producto en el TextArea
//            String productoInfo = String.format("Código: %s\nNombre: %s\nPrecio: %.2f\nCantidad: %d\n\n",
//                codigo, nombre, precio, cantidad);
//            taShowKintchenMenu.append(productoInfo);
//        }
//
//    }
}
