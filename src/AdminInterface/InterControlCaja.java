/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AdminInterface;

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

        BgPanel.setPreferredSize(new java.awt.Dimension(500, 400));

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

        lblSteticBG1.setBackground(new java.awt.Color(51, 51, 51));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/salida.png"))); // NOI18N
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
                .addContainerGap(348, Short.MAX_VALUE))
        );
        lblSteticBG1Layout.setVerticalGroup(
            lblSteticBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblSteticBG1Layout.createSequentialGroup()
                .addGroup(lblSteticBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBoxControl))
                .addContainerGap())
        );

        lblSteticBG2.setBackground(new java.awt.Color(51, 51, 51));
        lblSteticBG2.setLayout(new java.awt.BorderLayout());

        btnBoxClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/contabilidad.png"))); // NOI18N
        btnBoxClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoxCloseActionPerformed(evt);
            }
        });

        lblBoxClose.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBoxClose.setText("Cierre de caja");

        btnBoxOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/corte.png"))); // NOI18N

        lblBoxOpen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBoxOpen.setText("Apertura de caja");

        bntTableSold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/dar-dinero.png"))); // NOI18N
        bntTableSold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTableSoldActionPerformed(evt);
            }
        });

        lblTableSold.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTableSold.setText("Ventas por mesa");

        javax.swing.GroupLayout BgPanelLayout = new javax.swing.GroupLayout(BgPanel);
        BgPanel.setLayout(BgPanelLayout);
        BgPanelLayout.setHorizontalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSteticBG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnBoxClose, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnBoxOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addComponent(lblBoxClose)
                        .addGap(31, 31, 31)
                        .addComponent(lblBoxOpen))
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(bntTableSold))
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblTableSold)))
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane_MenuBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblSteticBG2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BgPanelLayout.setVerticalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addComponent(lblSteticBG1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBoxClose, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBoxOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBoxClose)
                            .addComponent(lblBoxOpen))
                        .addGap(33, 33, 33)
                        .addComponent(bntTableSold)
                        .addGap(0, 0, 0)
                        .addComponent(lblTableSold))
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDesktopPane_MenuBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(lblSteticBG2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBoxCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoxCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBoxCloseActionPerformed

    private void bntTableSoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTableSoldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntTableSoldActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
            dispose();
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
