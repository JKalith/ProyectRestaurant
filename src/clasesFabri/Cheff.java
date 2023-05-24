/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clasesFabri;

/**
 *
 * @author fcast
 */
public class Cheff extends javax.swing.JFrame {

    /**
     * Creates new form Cheff
     */
    public Cheff() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelcheff = new javax.swing.JPanel();
        buttonexitCheff = new javax.swing.JButton();
        BottunorderControl = new javax.swing.JButton();
        ButtonInventory = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPanecheff = new javax.swing.JDesktopPane();
        lblcheffName = new javax.swing.JLabel();
        lblBlackColor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelcheff.setBackground(new java.awt.Color(153, 153, 153));

        buttonexitCheff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clasesFabri/salir.png"))); // NOI18N

        BottunorderControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clasesFabri/6811571_cooking_cookware_frying pan_kitchen_kitchenware_icon (1).png"))); // NOI18N
        BottunorderControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottunorderControlActionPerformed(evt);
            }
        });

        ButtonInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clasesFabri/nhuh.png"))); // NOI18N
        ButtonInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInventoryActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ravie", 3, 16)); // NOI18N
        jLabel3.setText("Gestionar inventario");

        jLabel1.setFont(new java.awt.Font("Ravie", 3, 16)); // NOI18N
        jLabel1.setText("Control de Pedidos");

        jDesktopPanecheff.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jDesktopPanecheffLayout = new javax.swing.GroupLayout(jDesktopPanecheff);
        jDesktopPanecheff.setLayout(jDesktopPanecheffLayout);
        jDesktopPanecheffLayout.setHorizontalGroup(
            jDesktopPanecheffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jDesktopPanecheffLayout.setVerticalGroup(
            jDesktopPanecheffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        lblcheffName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblcheffName.setForeground(new java.awt.Color(0, 153, 153));
        lblcheffName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcheffName.setText("Bienvenido Cheff");
        lblcheffName.setOpaque(true);

        lblBlackColor.setBackground(new java.awt.Color(51, 51, 51));
        lblBlackColor.setOpaque(true);

        javax.swing.GroupLayout panelcheffLayout = new javax.swing.GroupLayout(panelcheff);
        panelcheff.setLayout(panelcheffLayout);
        panelcheffLayout.setHorizontalGroup(
            panelcheffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcheffLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelcheffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelcheffLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buttonexitCheff, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelcheffLayout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(lblcheffName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelcheffLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(BottunorderControl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBlackColor, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelcheffLayout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(ButtonInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(panelcheffLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addGap(108, 108, 108)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jDesktopPanecheff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelcheffLayout.setVerticalGroup(
            panelcheffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcheffLayout.createSequentialGroup()
                .addGroup(panelcheffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelcheffLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buttonexitCheff, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelcheffLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblcheffName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelcheffLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BottunorderControl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBlackColor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelcheffLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(ButtonInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(panelcheffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addComponent(jDesktopPanecheff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelcheff, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelcheff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottunorderControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottunorderControlActionPerformed

        OrderControll visible = new OrderControll ();
        jDesktopPanecheff.add(visible);
        visible.setVisible(true);
    }//GEN-LAST:event_BottunorderControlActionPerformed

    private void ButtonInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInventoryActionPerformed
        ManageInventory visible = new ManageInventory ();
        jDesktopPanecheff.add(visible);
        visible.setVisible(true);
    }//GEN-LAST:event_ButtonInventoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cheff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cheff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cheff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cheff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cheff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottunorderControl;
    private javax.swing.JButton ButtonInventory;
    private javax.swing.JButton buttonexitCheff;
    private javax.swing.JDesktopPane jDesktopPanecheff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBlackColor;
    private javax.swing.JLabel lblcheffName;
    private javax.swing.JPanel panelcheff;
    // End of variables declaration//GEN-END:variables
}
