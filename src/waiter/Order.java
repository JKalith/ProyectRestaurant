package Waiter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * En este JInternal frame se van a llamar los distintos JInternal frames, los
 * cuales contienen los menús con los que cuenta el punto de venta.
 *
 * @author Jorshua Solórzano
 */
public class Order extends javax.swing.JInternalFrame {

    String tableName = "";
    String filepath = "";
    
    //Se instancia el JInternal frame AccompanimentsMenu para usarlo en el evento de btnAccompaniments
    AccompanimentsMenu accompaniments = new AccompanimentsMenu();
    //Se instancia el JInternal frame AlcoholicDrinksMenu para usarlo en el evento de btnAlcoholicDrinks
    AlcoholicDrinksMenu alcoholicDrinks = new AlcoholicDrinksMenu();
    //Se instancia el JInternal frame BreakFastMenu para usarlo en el evento de btnBreakFast
    BreakFastMenu breakFast = new BreakFastMenu(tableName);
    //Se instancia el JInternal frame MenuMainDishes para usarlo en el evento de btnMainDishes
    MenuMainDishes mainDishes = new MenuMainDishes();
    //Se instancia el JInternal frame ShakesMenu para usarlo en el evento de btnShakes
    ShakesMenu shakes = new ShakesMenu();
    //Se instancia el JInternal frame SoftDrinksMenu para usarlo en el evento de btnSoftDrinks
    SoftDrinksMenu softDrinks = new SoftDrinksMenu();

    public Order(String table, String path) {
        // Establecer el título de la ventana
        super("Pedidos");
        initComponents();
        this.tableName = table;
        this.filepath = path;
        lblTableName.setText("Mesa " + table);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnBreakFast = new javax.swing.JButton();
        btnMainDishes = new javax.swing.JButton();
        btnAccompaniments = new javax.swing.JButton();
        btnSoftDrinks = new javax.swing.JButton();
        btnAlcoholicDrinks = new javax.swing.JButton();
        btnShakes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jdpMenus = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        lblOrder = new javax.swing.JLabel();
        lblOrderInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOrder = new javax.swing.JTextArea();
        lblMenu = new javax.swing.JLabel();
        btnSendOrder = new javax.swing.JButton();
        btnCleanCommand = new javax.swing.JButton();
        btnUpdateInventary = new javax.swing.JButton();
        lblTableName = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setEnabled(false);
        setFocusable(false);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(1629, 828));

        jPanel1.setPreferredSize(new java.awt.Dimension(1684, 915));

        jSplitPane1.setDividerLocation(225);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1333, 671));

        btnBreakFast.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBreakFast.setText("Desayunos");
        btnBreakFast.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBreakFast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBreakFastActionPerformed(evt);
            }
        });

        btnMainDishes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMainDishes.setText("Platos fuertes");
        btnMainDishes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMainDishes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainDishesActionPerformed(evt);
            }
        });

        btnAccompaniments.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAccompaniments.setText("Acompañamientos");
        btnAccompaniments.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAccompaniments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccompanimentsActionPerformed(evt);
            }
        });

        btnSoftDrinks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSoftDrinks.setText("Refrescos");
        btnSoftDrinks.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSoftDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoftDrinksActionPerformed(evt);
            }
        });

        btnAlcoholicDrinks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAlcoholicDrinks.setText("Bebidas alcoholicas");
        btnAlcoholicDrinks.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlcoholicDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlcoholicDrinksActionPerformed(evt);
            }
        });

        btnShakes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShakes.setText("Batidos");
        btnShakes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnShakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShakesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBreakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccompaniments, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSoftDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlcoholicDrinks)
                    .addComponent(btnShakes, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnBreakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnAccompaniments, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnSoftDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnAlcoholicDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnShakes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jdpMenus.setPreferredSize(new java.awt.Dimension(455, 300));
        jdpMenus.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jdpMenusLayout = new javax.swing.GroupLayout(jdpMenus);
        jdpMenus.setLayout(jdpMenusLayout);
        jdpMenusLayout.setHorizontalGroup(
            jdpMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );
        jdpMenusLayout.setVerticalGroup(
            jdpMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jLabel2.setText("Pedido");

        lblOrder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrder.setText("Pedido");

        lblOrderInfo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblOrderInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrderInfo.setText("Estado de pedido || Codigo del producto || Nombre del platillo || Precio || Cantidad");

        txtOrder.setColumns(20);
        txtOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOrder.setRows(5);
        jScrollPane1.setViewportView(txtOrder);

        lblMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Menú");

        btnSendOrder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSendOrder.setText("Enviar pedido");
        btnSendOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendOrderActionPerformed(evt);
            }
        });

        btnCleanCommand.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCleanCommand.setText("Pagar");
        btnCleanCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanCommandActionPerformed(evt);
            }
        });

        btnUpdateInventary.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdateInventary.setText("Actualizar estado");
        btnUpdateInventary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateInventaryActionPerformed(evt);
            }
        });

        lblTableName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTableName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTableName.setText("Mesa #");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(lblTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addComponent(lblOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2097, 2097, 2097)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jdpMenus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOrderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(btnUpdateInventary))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnSendOrder)
                                .addGap(161, 161, 161)
                                .addComponent(btnCleanCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMenu))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTableName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblOrderInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSendOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCleanCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateInventary, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdpMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Se agrega el JInternal Frame MainDishes al JDesktopPane del JInternal Frame jdpMenus de Order y luego se hace visible.
    private void btnMainDishesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainDishesActionPerformed
        try {
            jdpMenus.add(mainDishes);
            mainDishes.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }//GEN-LAST:event_btnMainDishesActionPerformed
    //Se agrega el JInternal Frame BreakFast al JDesktopPane del JInternal Frame jdpMenus de Order y luego se hace visible.
    private void btnBreakFastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBreakFastActionPerformed
        breakFast = new BreakFastMenu(tableName);
        try {
            jdpMenus.add(breakFast);
            breakFast.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }

    }//GEN-LAST:event_btnBreakFastActionPerformed
    //Se agrega el JInternal Frame AlcoholicDrinks al JDesktopPane del JInternal Frame jdpMenus de Order y luego se hace visible.
    private void btnAlcoholicDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlcoholicDrinksActionPerformed
        try {
            jdpMenus.add(alcoholicDrinks);
            alcoholicDrinks.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }//GEN-LAST:event_btnAlcoholicDrinksActionPerformed
    //Se agrega el JInternal Frame Accompaniments al JDesktopPane del JInternal Frame jdpMenus de Order y luego se hace visible.
    private void btnAccompanimentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccompanimentsActionPerformed
        try {
            jdpMenus.add(accompaniments);
            accompaniments.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }//GEN-LAST:event_btnAccompanimentsActionPerformed
    //Se agrega el JInternal Frame SoftDrinks al JDesktopPane del JInternal Frame jdpMenus de Order y luego se hace visible.
    private void btnSoftDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoftDrinksActionPerformed
        try {
            jdpMenus.add(softDrinks);
            softDrinks.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }//GEN-LAST:event_btnSoftDrinksActionPerformed
    //Se agrega el JInternal Frame Shakes al JDesktopPane del JInternal Frame jdpMenus de Order y luego se hace visible.
    private void btnShakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShakesActionPerformed
        try {
            jdpMenus.add(shakes);
            shakes.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }//GEN-LAST:event_btnShakesActionPerformed
//Tiene la funcionabilidad de guardar el pedido.
    private void btnSendOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendOrderActionPerformed
        try {
            updateInventary();
        } catch (IOException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSendOrderActionPerformed
    //Tiene la función de limpiar el área de texto txtOrder.
    private void btnCleanCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanCommandActionPerformed
        txtOrder.setText("");
    }//GEN-LAST:event_btnCleanCommandActionPerformed

    private void btnUpdateInventaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateInventaryActionPerformed
        try {
            WaiterInterface waiter = new WaiterInterface();
            waiter.readTXT(filepath);
            waiter.filterForCode(tableName, txtOrder, filepath);
        } catch (IOException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateInventaryActionPerformed

    public void updateInventary() throws IOException {
        File file = new File(filepath);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(txtOrder.getText());

        bufferedWriter.close();
        JOptionPane.showMessageDialog(null, "Se actualizo el pedido correctamente");
    }

    public void readTXT(String filePath) {
        try {
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
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccompaniments;
    private javax.swing.JButton btnAlcoholicDrinks;
    private javax.swing.JButton btnBreakFast;
    private javax.swing.JButton btnCleanCommand;
    private javax.swing.JButton btnMainDishes;
    private javax.swing.JButton btnSendOrder;
    private javax.swing.JButton btnShakes;
    private javax.swing.JButton btnSoftDrinks;
    private javax.swing.JButton btnUpdateInventary;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JDesktopPane jdpMenus;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblOrderInfo;
    private javax.swing.JLabel lblTableName;
    public static javax.swing.JTextArea txtOrder;
    // End of variables declaration//GEN-END:variables
}
