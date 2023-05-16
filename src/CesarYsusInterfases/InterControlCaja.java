/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CesarYsusInterfases;

/**
 *
 * @author Cesar
 */
public class InterControlCaja extends javax.swing.JInternalFrame {


    public InterControlCaja() {
        initComponents();
        this.setSize(820, 320);
        this.setTitle("Menu Control caja");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgPanel = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblAdminName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblBoxControl = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblBoxControl1 = new javax.swing.JLabel();
        lblBoxControl2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1600, 1050));

        BgPanel.setPreferredSize(new java.awt.Dimension(1920, 860));
        BgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1480, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        BgPanel.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/salida.png"))); // NOI18N
        BgPanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/dar-dinero.png"))); // NOI18N
        BgPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 90, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        lblAdminName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(0, 153, 153));
        lblAdminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminName.setText("Control de caja");
        lblAdminName.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1350, Short.MAX_VALUE)
                .addComponent(lblAdminName)
                .addGap(401, 401, 401))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        BgPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 50));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1900, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        BgPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 830, 1900, 30));

        lblBoxControl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBoxControl.setText("Ventas por mesa");
        BgPanel.add(lblBoxControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/contabilidad.png"))); // NOI18N
        BgPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 80));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/corte.png"))); // NOI18N
        BgPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 80, 80));

        lblBoxControl1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBoxControl1.setText("Cierre de caja");
        BgPanel.add(lblBoxControl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblBoxControl2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBoxControl2.setText("Apertura de caja");
        BgPanel.add(lblBoxControl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        getContentPane().add(BgPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblBoxControl;
    private javax.swing.JLabel lblBoxControl1;
    private javax.swing.JLabel lblBoxControl2;
    // End of variables declaration//GEN-END:variables

    void add(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
