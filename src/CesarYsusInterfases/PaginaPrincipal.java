package CesarYsusInterfases;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menu Admin");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        PanelBG = new javax.swing.JPanel();
        lblAdminName = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblBlackColor = new javax.swing.JLabel();
        btnBoxControl = new javax.swing.JButton();
        lblBoxControl = new javax.swing.JLabel();
        btnMenuCharge = new javax.swing.JButton();
        lblChargeMenu = new javax.swing.JLabel();
        btnTableControl = new javax.swing.JButton();
        lblTableControl = new javax.swing.JLabel();
        btnInventariControl = new javax.swing.JButton();
        lblInventaryControl = new javax.swing.JLabel();
        jDesktopPane_menu = new javax.swing.JDesktopPane();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBG.setBackground(new java.awt.Color(223, 223, 223));
        PanelBG.setPreferredSize(new java.awt.Dimension(800, 700));
        PanelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdminName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(0, 153, 153));
        lblAdminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminName.setText("Bienvenido Administrador");
        lblAdminName.setOpaque(true);
        PanelBG.add(lblAdminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 30));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/salida.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        PanelBG.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        lblBlackColor.setBackground(new java.awt.Color(51, 51, 51));
        lblBlackColor.setOpaque(true);
        PanelBG.add(lblBlackColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 50));

        btnBoxControl.setForeground(new java.awt.Color(240, 240, 240));
        btnBoxControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/caja-registradora.png"))); // NOI18N
        btnBoxControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoxControlActionPerformed(evt);
            }
        });
        PanelBG.add(btnBoxControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 80, 80));

        lblBoxControl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBoxControl.setText("Control de caja");
        PanelBG.add(lblBoxControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        btnMenuCharge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/menu.png"))); // NOI18N
        btnMenuCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuChargeActionPerformed(evt);
            }
        });
        PanelBG.add(btnMenuCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 80, 80));

        lblChargeMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblChargeMenu.setText("Cargar menu");
        PanelBG.add(lblChargeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        btnTableControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/mesa.png"))); // NOI18N
        btnTableControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableControlActionPerformed(evt);
            }
        });
        PanelBG.add(btnTableControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, 80));

        lblTableControl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTableControl.setText("Control de mesas");
        PanelBG.add(lblTableControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        btnInventariControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/inventario.png"))); // NOI18N
        btnInventariControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventariControlActionPerformed(evt);
            }
        });
        PanelBG.add(btnInventariControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, 80));

        lblInventaryControl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInventaryControl.setText("Control de inventario");
        PanelBG.add(lblInventaryControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        jDesktopPane_menu.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jDesktopPane_menuLayout = new javax.swing.GroupLayout(jDesktopPane_menu);
        jDesktopPane_menu.setLayout(jDesktopPane_menuLayout);
        jDesktopPane_menuLayout.setHorizontalGroup(
            jDesktopPane_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jDesktopPane_menuLayout.setVerticalGroup(
            jDesktopPane_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        PanelBG.add(jDesktopPane_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 820, 520));

        getContentPane().add(PanelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBoxControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoxControlActionPerformed
        InterControlCaja boxControl = new InterControlCaja();
        jDesktopPane_menu.add(boxControl);
        boxControl.setVisible(true);
    }//GEN-LAST:event_btnBoxControlActionPerformed

    private void btnMenuChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuChargeActionPerformed
       InterfaceChargeMenu chargeMenu = new InterfaceChargeMenu();
        jDesktopPane_menu.add(chargeMenu);
        chargeMenu.setVisible(true);
    }//GEN-LAST:event_btnMenuChargeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        ActionListener closeSystem = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción que se ejecutará al presionar el botón
                JOptionPane.showMessageDialog(null, "Sesion Cerrada correctamente");
                // Cerrar la ventana y finalizar la aplicación
                dispose(); // Cierra la ventana actual
                
            }
        };
        // Asignar el detector de acción al botón
        btnExit.addActionListener(closeSystem);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnTableControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableControlActionPerformed
        Desayunos desayunos = new Desayunos();
        jDesktopPane_menu.add(desayunos);
        desayunos.setVisible(true);
    }//GEN-LAST:event_btnTableControlActionPerformed

    private void btnInventariControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventariControlActionPerformed
        InterfaceInventaryControl inventaryControl = new InterfaceInventaryControl();
        jDesktopPane_menu.add(inventaryControl);
        inventaryControl.setVisible(true);
    }//GEN-LAST:event_btnInventariControlActionPerformed

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
    private javax.swing.JPanel PanelBG;
    private javax.swing.JButton btnBoxControl;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInventariControl;
    private javax.swing.JButton btnMenuCharge;
    private javax.swing.JButton btnTableControl;
    private javax.swing.JDesktopPane jDesktopPane_menu;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblBlackColor;
    private javax.swing.JLabel lblBoxControl;
    private javax.swing.JLabel lblChargeMenu;
    private javax.swing.JLabel lblInventaryControl;
    private javax.swing.JLabel lblTableControl;
    // End of variables declaration//GEN-END:variables

}
