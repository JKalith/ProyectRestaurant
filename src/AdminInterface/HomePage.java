package AdminInterface;

import Waiter.WaiterInterface;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public HomePage() {
        initComponents();
        
        // Obtener la resolución de la pantalla
Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

// Establecer el tamaño máximo del frame al tamaño de la pantalla
this.setSize(pantalla.width, pantalla.height);

// Establecer la posición del frame en la esquina superior izquierda
this.setLocation(0, 0);

// Maximizar el frame para ocupar toda la pantalla
this.setExtendedState(this.MAXIMIZED_BOTH);
        

        this.setLocationRelativeTo(null);
        this.setTitle("Menu Admin");
//        setExtendedState(MAXIMIZED_BOTHED);
    }
                
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelBG = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        lblAdminName = new javax.swing.JLabel();
        btnBoxControl = new javax.swing.JButton();
        lblBoxControl = new javax.swing.JLabel();
        btnMenuCharge = new javax.swing.JButton();
        lblChargeMenu = new javax.swing.JLabel();
        btnTableControl = new javax.swing.JButton();
        lblTableControl = new javax.swing.JLabel();
        btnInventariControl = new javax.swing.JButton();
        lblInventaryControl = new javax.swing.JLabel();
        jDesktopPane_menu = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        PanelBG.setBackground(new java.awt.Color(51, 51, 51));
        PanelBG.setPreferredSize(new java.awt.Dimension(800, 700));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/salida.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblAdminName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(0, 153, 153));
        lblAdminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminName.setText("Bienvenido Administrador");
        lblAdminName.setOpaque(true);

        javax.swing.GroupLayout PanelBGLayout = new javax.swing.GroupLayout(PanelBG);
        PanelBG.setLayout(PanelBGLayout);
        PanelBGLayout.setHorizontalGroup(
            PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBGLayout.createSequentialGroup()
                .addGroup(PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBGLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(lblAdminName))
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBGLayout.setVerticalGroup(
            PanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnBoxControl.setForeground(new java.awt.Color(240, 240, 240));
        btnBoxControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/caja-registradora.png"))); // NOI18N
        btnBoxControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoxControlActionPerformed(evt);
            }
        });

        lblBoxControl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBoxControl.setText("Control de caja");

        btnMenuCharge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/menu.png"))); // NOI18N
        btnMenuCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuChargeActionPerformed(evt);
            }
        });

        lblChargeMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblChargeMenu.setText("Cargar menu");

        btnTableControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/mesa.png"))); // NOI18N
        btnTableControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableControlActionPerformed(evt);
            }
        });

        lblTableControl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTableControl.setText("Control de mesas");

        btnInventariControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminInterface/inventario.png"))); // NOI18N
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
            .addGap(0, 1776, Short.MAX_VALUE)
        );
        jDesktopPane_menuLayout.setVerticalGroup(
            jDesktopPane_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 904, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBoxControl)
                    .addComponent(btnBoxControl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblChargeMenu)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenuCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTableControl)
                    .addComponent(btnTableControl))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInventaryControl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnInventariControl)))
                .addContainerGap(1007, Short.MAX_VALUE))
            .addComponent(PanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, 1776, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jDesktopPane_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 1776, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTableControl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventariControl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoxControl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChargeMenu)
                    .addComponent(lblBoxControl)
                    .addComponent(lblTableControl)
                    .addComponent(lblInventaryControl))
                .addContainerGap(919, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 174, Short.MAX_VALUE)
                    .addComponent(jDesktopPane_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(0, 8, Short.MAX_VALUE))
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
        
        
        
        dispose();
         JOptionPane.showMessageDialog(null, "Sesión cerrada correctamente!");
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnTableControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableControlActionPerformed

        try {
            WaiterInterface waiter = new WaiterInterface();
            waiter.setVisible(true);
            
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }//GEN-LAST:event_btnTableControlActionPerformed

    private void btnInventariControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventariControlActionPerformed
        InterfaceInventaryControl inventaryControl = new InterfaceInventaryControl();
        jDesktopPane_menu.add(inventaryControl);
        inventaryControl.setVisible(true);
    }//GEN-LAST:event_btnInventariControlActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblBoxControl;
    private javax.swing.JLabel lblChargeMenu;
    private javax.swing.JLabel lblInventaryControl;
    private javax.swing.JLabel lblTableControl;
    // End of variables declaration//GEN-END:variables

}
