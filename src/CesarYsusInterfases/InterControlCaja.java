/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CesarYsusInterfases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class InterControlCaja extends javax.swing.JInternalFrame {


    public InterControlCaja() {
        initComponents();
        this.setTitle("Menu Control caja");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgPanel = new javax.swing.JPanel();
        jDesktopPane_MenuBox = new javax.swing.JDesktopPane();
        lblSteticBG1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        lblBoxControl = new javax.swing.JLabel();
        lblSteticBG2 = new javax.swing.JPanel();
        btnBoxClose = new javax.swing.JButton();
        lblBoxClose = new javax.swing.JLabel();
        btnBoxOpen = new javax.swing.JButton();
        lblBoxOpen = new javax.swing.JLabel();
        bntTableSold = new javax.swing.JButton();
        lblTableSold = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BgPanel.setPreferredSize(new java.awt.Dimension(500, 400));
        BgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jDesktopPane_MenuBoxLayout = new javax.swing.GroupLayout(jDesktopPane_MenuBox);
        jDesktopPane_MenuBox.setLayout(jDesktopPane_MenuBoxLayout);
        jDesktopPane_MenuBoxLayout.setHorizontalGroup(
            jDesktopPane_MenuBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jDesktopPane_MenuBoxLayout.setVerticalGroup(
            jDesktopPane_MenuBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        BgPanel.add(jDesktopPane_MenuBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 510, 360));

        lblSteticBG1.setBackground(new java.awt.Color(51, 51, 51));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/salida.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblBoxControl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblBoxControl.setForeground(new java.awt.Color(0, 153, 153));
        lblBoxControl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBoxControl.setText("Control de caja");
        lblBoxControl.setOpaque(true);

        javax.swing.GroupLayout lblSteticBG1Layout = new javax.swing.GroupLayout(lblSteticBG1);
        lblSteticBG1.setLayout(lblSteticBG1Layout);
        lblSteticBG1Layout.setHorizontalGroup(
            lblSteticBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblSteticBG1Layout.createSequentialGroup()
                .addComponent(btnExit)
                .addGap(255, 255, 255)
                .addComponent(lblBoxControl)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        lblSteticBG1Layout.setVerticalGroup(
            lblSteticBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblSteticBG1Layout.createSequentialGroup()
                .addGroup(lblSteticBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBoxControl))
                .addContainerGap())
        );

        BgPanel.add(lblSteticBG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        lblSteticBG2.setBackground(new java.awt.Color(51, 51, 51));
        lblSteticBG2.setLayout(new java.awt.BorderLayout());
        BgPanel.add(lblSteticBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 800, 30));

        btnBoxClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/contabilidad.png"))); // NOI18N
        btnBoxClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoxCloseActionPerformed(evt);
            }
        });
        BgPanel.add(btnBoxClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 80));

        lblBoxClose.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBoxClose.setText("Cierre de caja");
        BgPanel.add(lblBoxClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        btnBoxOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/corte.png"))); // NOI18N
        BgPanel.add(btnBoxOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 80, 80));

        lblBoxOpen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBoxOpen.setText("Apertura de caja");
        BgPanel.add(lblBoxOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        bntTableSold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/dar-dinero.png"))); // NOI18N
        bntTableSold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTableSoldActionPerformed(evt);
            }
        });
        BgPanel.add(bntTableSold, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        lblTableSold.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTableSold.setText("Ventas por mesa");
        BgPanel.add(lblTableSold, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        getContentPane().add(BgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 805, 525));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBoxCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoxCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBoxCloseActionPerformed

    private void bntTableSoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTableSoldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntTableSoldActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
         ActionListener closeSystem = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose(); // Cierra la ventana actual
        }
    };
    // Asignar el detector de acción al botón
    btnExit.addActionListener(closeSystem);
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JButton bntTableSold;
    private javax.swing.JButton btnBoxClose;
    private javax.swing.JButton btnBoxOpen;
    private javax.swing.JButton btnExit;
    private javax.swing.JDesktopPane jDesktopPane_MenuBox;
    private javax.swing.JLabel lblBoxClose;
    private javax.swing.JLabel lblBoxControl;
    private javax.swing.JLabel lblBoxOpen;
    private javax.swing.JPanel lblSteticBG1;
    private javax.swing.JPanel lblSteticBG2;
    private javax.swing.JLabel lblTableSold;
    // End of variables declaration//GEN-END:variables

    void add(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
