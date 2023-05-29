package Waiter;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorshua Solorzano
 */
public class WaiterInterface extends javax.swing.JFrame {

    Order order = new Order();
    BreakFastMenu breakFast = new BreakFastMenu();


    public WaiterInterface() {
        // Establecer el título de la ventana
        super("Punto de venta restaurante Macakos");

        initComponents();

        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMesa9 = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        lblTables = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnTable1 = new javax.swing.JButton();
        btnTable2 = new javax.swing.JButton();
        btnTable3 = new javax.swing.JButton();
        btnTable4 = new javax.swing.JButton();
        btnTable5 = new javax.swing.JButton();
        btnTable6 = new javax.swing.JButton();
        btnTable7 = new javax.swing.JButton();
        btnTable8 = new javax.swing.JButton();
        btnTable12 = new javax.swing.JButton();
        btnTable13 = new javax.swing.JButton();
        btnTable14 = new javax.swing.JButton();
        btnTable15 = new javax.swing.JButton();
        btnTable16 = new javax.swing.JButton();
        btnTable17 = new javax.swing.JButton();
        lblTable1 = new javax.swing.JLabel();
        lblTable2 = new javax.swing.JLabel();
        lblTable3 = new javax.swing.JLabel();
        lblTable4 = new javax.swing.JLabel();
        lblTable5 = new javax.swing.JLabel();
        lblTable6 = new javax.swing.JLabel();
        lblTable7 = new javax.swing.JLabel();
        lblTable8 = new javax.swing.JLabel();
        lblTable9 = new javax.swing.JLabel();
        lblTable10 = new javax.swing.JLabel();
        lblTable11 = new javax.swing.JLabel();
        lblTable12 = new javax.swing.JLabel();
        lblTable13 = new javax.swing.JLabel();
        lblTable14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jdpOrders = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));

        lblTables.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTables.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTables.setText("Mesas");

        jSplitPane1.setDividerLocation(200);

        btnTable1.setBackground(new java.awt.Color(153, 153, 153));
        btnTable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable1ActionPerformed(evt);
            }
        });

        btnTable2.setBackground(new java.awt.Color(153, 153, 153));
        btnTable2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable2ActionPerformed(evt);
            }
        });

        btnTable3.setBackground(new java.awt.Color(153, 153, 153));
        btnTable3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable3ActionPerformed(evt);
            }
        });

        btnTable4.setBackground(new java.awt.Color(153, 153, 153));
        btnTable4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable4ActionPerformed(evt);
            }
        });

        btnTable5.setBackground(new java.awt.Color(153, 153, 153));
        btnTable5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable5ActionPerformed(evt);
            }
        });

        btnTable6.setBackground(new java.awt.Color(153, 153, 153));
        btnTable6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable6ActionPerformed(evt);
            }
        });

        btnTable7.setBackground(new java.awt.Color(153, 153, 153));
        btnTable7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable7ActionPerformed(evt);
            }
        });

        btnTable8.setBackground(new java.awt.Color(153, 153, 153));
        btnTable8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable8ActionPerformed(evt);
            }
        });

        btnTable12.setBackground(new java.awt.Color(153, 153, 153));
        btnTable12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable12ActionPerformed(evt);
            }
        });

        btnTable13.setBackground(new java.awt.Color(153, 153, 153));
        btnTable13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable13ActionPerformed(evt);
            }
        });

        btnTable14.setBackground(new java.awt.Color(153, 153, 153));
        btnTable14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable14ActionPerformed(evt);
            }
        });

        btnTable15.setBackground(new java.awt.Color(153, 153, 153));
        btnTable15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable15ActionPerformed(evt);
            }
        });

        btnTable16.setBackground(new java.awt.Color(153, 153, 153));
        btnTable16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable16ActionPerformed(evt);
            }
        });

        btnTable17.setBackground(new java.awt.Color(153, 153, 153));
        btnTable17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/mesa-de-cena.png"))); // NOI18N
        btnTable17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable17ActionPerformed(evt);
            }
        });

        lblTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable1.setText("#1");

        lblTable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable2.setText("#2");

        lblTable3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable3.setText("#3");

        lblTable4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable4.setText("#4");

        lblTable5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable5.setText("#5");

        lblTable6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable6.setText("#6");

        lblTable7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable7.setText("#7");

        lblTable8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable8.setText("#8");

        lblTable9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable9.setText("#9");

        lblTable10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable10.setText("#10");

        lblTable11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable11.setText("#11");

        lblTable12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable12.setText("#12");

        lblTable13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable13.setText("#13");

        lblTable14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTable14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTable14.setText("#14");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTable6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTable16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnTable12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnTable14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTable13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnTable15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTable7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTable8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTable6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTable7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTable8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTable9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTable10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTable11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTable12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTable13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTable17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTable14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTable1)
                            .addComponent(lblTable2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTable3)
                    .addComponent(lblTable4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTable3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTable5)
                    .addComponent(lblTable6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTable5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTable7)
                    .addComponent(lblTable8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTable7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTable9)
                    .addComponent(lblTable10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTable13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTable11)
                    .addComponent(lblTable12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTable14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTable13)
                    .addComponent(lblTable14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTable17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jdpOrders.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jdpOrdersLayout = new javax.swing.GroupLayout(jdpOrders);
        jdpOrders.setLayout(jdpOrdersLayout);
        jdpOrdersLayout.setHorizontalGroup(
            jdpOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1629, Short.MAX_VALUE)
        );
        jdpOrdersLayout.setVerticalGroup(
            jdpOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpOrders)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdpOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jSplitPane1.setRightComponent(jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Pedidos");

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Waiter/salida.png"))); // NOI18N
        btnExit.setHideActionText(true);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1880, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblTables, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(868, 868, 868)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1865, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTables, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable1ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable1ActionPerformed

    private void btnTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable2ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable2ActionPerformed

    private void btnTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable3ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable3ActionPerformed

    private void btnTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable4ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable4ActionPerformed

    private void btnTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable5ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable5ActionPerformed

    private void btnTable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable6ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable6ActionPerformed

    private void btnTable7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable7ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable7ActionPerformed

    private void btnTable8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable8ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable8ActionPerformed

    private void btnTable12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable12ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable12ActionPerformed

    private void btnTable13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable13ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable13ActionPerformed

    private void btnTable14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable14ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable14ActionPerformed

    private void btnTable15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable15ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable15ActionPerformed

    private void btnTable16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable16ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable16ActionPerformed

    private void btnTable17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable17ActionPerformed
        jdpOrders.add(order);
        order.setVisible(true);
    }//GEN-LAST:event_btnTable17ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
        JOptionPane.showMessageDialog(null, "Sesión Cerrada correctamente");
    }//GEN-LAST:event_btnExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaiterInterface().setVisible(true);
            }
        });
    }
//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMesa9;
    private javax.swing.JButton btnTable1;
    private javax.swing.JButton btnTable12;
    private javax.swing.JButton btnTable13;
    private javax.swing.JButton btnTable14;
    private javax.swing.JButton btnTable15;
    private javax.swing.JButton btnTable16;
    private javax.swing.JButton btnTable17;
    private javax.swing.JButton btnTable2;
    private javax.swing.JButton btnTable3;
    private javax.swing.JButton btnTable4;
    private javax.swing.JButton btnTable5;
    private javax.swing.JButton btnTable6;
    private javax.swing.JButton btnTable7;
    private javax.swing.JButton btnTable8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JDesktopPane jdpOrders;
    private javax.swing.JLabel lblTable1;
    private javax.swing.JLabel lblTable10;
    private javax.swing.JLabel lblTable11;
    private javax.swing.JLabel lblTable12;
    private javax.swing.JLabel lblTable13;
    private javax.swing.JLabel lblTable14;
    private javax.swing.JLabel lblTable2;
    private javax.swing.JLabel lblTable3;
    private javax.swing.JLabel lblTable4;
    private javax.swing.JLabel lblTable5;
    private javax.swing.JLabel lblTable6;
    private javax.swing.JLabel lblTable7;
    private javax.swing.JLabel lblTable8;
    private javax.swing.JLabel lblTable9;
    private javax.swing.JLabel lblTables;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables

}
