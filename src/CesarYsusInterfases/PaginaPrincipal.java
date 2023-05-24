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

        PanelBG.setBackground(new java.awt.Color(223, 223, 223));
        PanelBG.setPreferredSize(new java.awt.Dimension(800, 700));

        lblAdminName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(0, 153, 153));
        lblAdminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminName.setText("Bienvenido Administrador");
        lblAdminName.setOpaque(true);

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/salida.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblBlackColor.setBackground(new java.awt.Color(51, 51, 51));
        lblBlackColor.setOpaque(true);

        btnBoxControl.setForeground(new java.awt.Color(240, 240, 240));
        btnBoxControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/caja-registradora.png"))); // NOI18N
        btnBoxControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoxControlActionPerformed(evt);
            }
        });

        lblBoxControl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBoxControl.setText("Control de caja");

        btnMenuCharge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/menu.png"))); // NOI18N
        btnMenuCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuChargeActionPerformed(evt);
            }
        });

        lblChargeMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblChargeMenu.setText("Cargar menu");

        btnTableControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/mesa.png"))); // NOI18N
        btnTableControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableControlActionPerformed(evt);
            }
        });

        lblTableControl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTableControl.setText("Control de mesas");

        btnInventariControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CesarYsusInterfases/inventario.png"))); // NOI18N
        btnInventariControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventariControlActionPerformed(evt);
            }
        });

        lblInventaryControl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInventaryControl.setText("Control de inventario");

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

        javax.swing.GroupLayout PanelBGLayout = new javax.swing.GroupLayout(PanelBG);
        PanelBG.setLayout(PanelBGLayout);
        PanelBGLayout.setHorizontalGroup(
            PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBGLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(lblAdminName))
            .addComponent(lblBlackColor, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelBGLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnBoxControl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnMenuCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnTableControl)
                .addGap(90, 90, 90)
                .addComponent(btnInventariControl))
            .addGroup(PanelBGLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lblBoxControl)
                .addGap(74, 74, 74)
                .addComponent(lblChargeMenu)
                .addGap(56, 56, 56)
                .addComponent(lblTableControl)
                .addGap(38, 38, 38)
                .addComponent(lblInventaryControl))
            .addComponent(jDesktopPane_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelBGLayout.setVerticalGroup(
            PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBGLayout.createSequentialGroup()
                .addGroup(PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBlackColor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBoxControl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTableControl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventariControl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBoxControl)
                    .addComponent(lblChargeMenu)
                    .addComponent(lblTableControl)
                    .addComponent(lblInventaryControl))
                .addGap(23, 23, 23)
                .addComponent(jDesktopPane_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
