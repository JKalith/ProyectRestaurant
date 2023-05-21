package Mesero;

import interfazMesero.AccompanimentsMenu;
import interfazMesero.AlcoholicDrinksMenu;
import interfazMesero.BreakFastMenu;
import interfazMesero.MenuMainDishes;
import interfazMesero.ShakesMenu;
import interfazMesero.SoftDrinksMenu;

/**
 *
 * @author Jorshua Solorzano
 */
public class Order extends javax.swing.JInternalFrame {

    private Order order;

    public void addText(String text) {
        txtPedidos.append(text);
    }

    public Order() {

        super("Pedidos mesa #");
        initComponents();
    }

    public void setOrder(Order order) {
        this.order = order;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPedidos = new javax.swing.JTextArea();
        lblMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setEnabled(false);
        setFocusable(false);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(1615, 854));

        jPanel1.setPreferredSize(new java.awt.Dimension(1684, 915));

        jSplitPane1.setDividerLocation(225);

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
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnBreakFast, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnMainDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnAccompaniments, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btnSoftDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnAlcoholicDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnShakes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("Pedido");

        lblOrder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrder.setText("Pedido");

        txtPedidos.setColumns(20);
        txtPedidos.setRows(5);
        jScrollPane1.setViewportView(txtPedidos);

        lblMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Menú");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(613, 613, 613)
                        .addComponent(lblOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1952, 1952, 1952)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jdpMenus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32627, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenu)
                            .addComponent(lblOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdpMenus, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel3);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1684, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainDishesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainDishesActionPerformed
        try {
            MenuMainDishes mainDishes = new MenuMainDishes();
            jdpMenus.add(mainDishes);
            mainDishes.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }//GEN-LAST:event_btnMainDishesActionPerformed

    private void btnBreakFastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBreakFastActionPerformed
        try {
            BreakFastMenu breakFast = new BreakFastMenu();
            jdpMenus.add(breakFast);
            breakFast.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }

    }//GEN-LAST:event_btnBreakFastActionPerformed

    private void btnAlcoholicDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlcoholicDrinksActionPerformed
        try {
            AlcoholicDrinksMenu alcoholicDrinks = new AlcoholicDrinksMenu();
            jdpMenus.add(alcoholicDrinks);
            alcoholicDrinks.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }//GEN-LAST:event_btnAlcoholicDrinksActionPerformed

    private void btnAccompanimentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccompanimentsActionPerformed
        try {
            AccompanimentsMenu accompaniments = new AccompanimentsMenu();
            jdpMenus.add(accompaniments);
            accompaniments.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }//GEN-LAST:event_btnAccompanimentsActionPerformed

    private void btnSoftDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoftDrinksActionPerformed
        try {
            SoftDrinksMenu softDrinks = new SoftDrinksMenu();
            jdpMenus.add(softDrinks);
            softDrinks.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }//GEN-LAST:event_btnSoftDrinksActionPerformed

    private void btnShakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShakesActionPerformed
        try {
            ShakesMenu shakes = new ShakesMenu();
            jdpMenus.add(shakes);
            shakes.setVisible(true);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }//GEN-LAST:event_btnShakesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccompaniments;
    private javax.swing.JButton btnAlcoholicDrinks;
    private javax.swing.JButton btnBreakFast;
    private javax.swing.JButton btnMainDishes;
    private javax.swing.JButton btnShakes;
    private javax.swing.JButton btnSoftDrinks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JDesktopPane jdpMenus;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JTextArea txtPedidos;
    // End of variables declaration//GEN-END:variables
}
