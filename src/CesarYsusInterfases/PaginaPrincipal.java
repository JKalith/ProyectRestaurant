/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package CesarYsusInterfases;

/**
 *
 * @author Cesar
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /** Creates new form PaginaPrincipal */
    public PaginaPrincipal() {
        initComponents();
        this.setSize(600, 500);
        this.setLocation(null);
        this.setTitle("Menu Admin");
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBoxControl = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDesktopPane_menuAdmin = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBoxControl.setText("Control Caja");
        btnBoxControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoxControlActionPerformed(evt);
            }
        });
        getContentPane().add(btnBoxControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jButton2.setText("Hola");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        javax.swing.GroupLayout jDesktopPane_menuAdminLayout = new javax.swing.GroupLayout(jDesktopPane_menuAdmin);
        jDesktopPane_menuAdmin.setLayout(jDesktopPane_menuAdminLayout);
        jDesktopPane_menuAdminLayout.setHorizontalGroup(
            jDesktopPane_menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jDesktopPane_menuAdminLayout.setVerticalGroup(
            jDesktopPane_menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane_menuAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 530, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBoxControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoxControlActionPerformed
        // TODO add your handling code here:
        InterControlCaja contCaja = new InterControlCaja();
        jDesktopPane_menuAdmin.add(contCaja);
        contCaja.setVisible(true);
    }//GEN-LAST:event_btnBoxControlActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoxControl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane_menuAdmin;
    // End of variables declaration//GEN-END:variables

}
