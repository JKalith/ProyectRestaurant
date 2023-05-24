/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectRestaurant;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import ClassPackage.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import waiterInterface.POSGUI;
import AdminInterface.HomePage;

/**
 *
 * @author james
 */
public class Login extends javax.swing.JFrame {
public  static  ArrayList<User> listUser = new ArrayList<>();
public   POSGUI posgui = new POSGUI();
    public User user = new User();
    HomePage homePage = new HomePage();

    /**
     * Creates new form Login
     */
    public Login() throws IOException {
        initComponents();
      
loadUser();
        jpLogin.add(jpDataLogin, CENTER_ALIGNMENT);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jpLogin = new javax.swing.JPanel();
        jpDataLogin = new javax.swing.JPanel();
        btnLogin = new java.awt.Button();
        JpsPasswordL = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxUser = new javax.swing.JTextPane();
        lblWelcome = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        lbImgLogin = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jpLogin.setBackground(new java.awt.Color(154, 179, 150));
        jpLogin.setPreferredSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout jpLoginLayout = new javax.swing.GroupLayout(jpLogin);
        jpLogin.setLayout(jpLoginLayout);
        jpLoginLayout.setHorizontalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jpLoginLayout.setVerticalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        jpDataLogin.setBackground(new java.awt.Color(153, 153, 153));
        jpDataLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpDataLogin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jpDataLoginAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnLogin.setActionCommand("Ingresar");
        btnLogin.setLabel("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jtxUser);

        lblWelcome.setBackground(new java.awt.Color(0, 0, 0));
        lblWelcome.setFont(new java.awt.Font("Agency FB", 0, 55)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 0, 0));
        lblWelcome.setText("Bienvenido ");

        lbUserName.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(0, 0, 0));
        lbUserName.setText("Usuario");

        lbPassword.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(0, 0, 0));
        lbPassword.setText("Contraseña ");

        lbImgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectRestaurant/ImageLogin/user (2).png"))); // NOI18N

        javax.swing.GroupLayout jpDataLoginLayout = new javax.swing.GroupLayout(jpDataLogin);
        jpDataLogin.setLayout(jpDataLoginLayout);
        jpDataLoginLayout.setHorizontalGroup(
            jpDataLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDataLoginLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jpDataLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPassword)
                    .addGroup(jpDataLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDataLoginLayout.createSequentialGroup()
                            .addGroup(jpDataLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblWelcome)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDataLoginLayout.createSequentialGroup()
                                    .addComponent(lbImgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)))
                            .addGap(215, 215, 215))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDataLoginLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92)))
                    .addGroup(jpDataLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JpsPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpDataLoginLayout.setVerticalGroup(
            jpDataLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDataLoginLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lbImgLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWelcome)
                .addGap(91, 91, 91)
                .addComponent(lbUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(lbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JpsPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );

        btnLogin.getAccessibleContext().setAccessibleDescription("");
        lbUserName.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(601, 601, 601)
                .addComponent(jpDataLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(718, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpDataLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpLogin.getAccessibleContext().setAccessibleName("jpLogin");
        jpLogin.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("frmLogin");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpDataLoginAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jpDataLoginAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jpDataLoginAncestorAdded

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    try {
       verifyAccess();
    } catch (IOException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

       
        
        
        
        
        
        
        

        });

    }
    
    /**
     * Load users within a list is used
     * @param user
     * Person's User
     * @param password
     * User password
     * @param levelAccess
     * Permission level to enter
     * @param indexA
     * index to extract data from the correct memory position
     * @return 
     * 
     */
     public User addDataU(String user, String password,String levelAccess,int indexA){
               
         
     int levelA = Integer.parseInt(levelAccess);
  User userData = new User(user, password, levelA);

listUser.add(indexA, userData);
        
  

                return null;
        
        
        
        }
/**
 * Loads user data based on database into temporary memory
 * @throws FileNotFoundException
 * @throws IOException 
 */
            public void loadUser() throws FileNotFoundException, IOException {
               
                
                BufferedReader br = new BufferedReader(new FileReader("Usuarios.txt"));
                String line;
               
                int count=0;
                while ((line = br.readLine()) != null) {
 System.out.println(line);
                     String data[] = line.split(",");
                    String userN = data[0];
                    String password = data[1];
                    String levelAccess = data[2];
                    
                
                   
                    addDataU(userN, password, levelAccess, count);

                 
                }
             
        

            }
            
            
            /**
             * Its function is to compare the data in the database with those provided
             * @throws IOException 
             */
            public void verifyAccess() throws IOException{
        
               int count=0; 
               String userName = jtxUser.getText();
               String password= JpsPasswordL.getText();
               
                for (count = 0; count < listUser.size(); count++) {
                        if (userName.equals(listUser.get(count).getUserName())) {
                            if (password.equals(listUser.get(count).getUserPassword())) {
                                 runFrame(listUser.get(count).getAccessLevel()); 
                           
                                break;
                            }
                          
                }
         
               if (count>listUser.size()){
                   
               //Insertar un aviso contraseña incorrecta
               
               
               
               
               
               }
                       
                        
                        
                        
    
                }
           
         
            
            
            
            
            
            
            }
            
            
            
            
            /**
             * This method has the function of starting 
             * a frame according to the user's access level
             * @param levelAccess 
             * is the indicator of where the frame should start
             */
            public void runFrame (int levelAccess){
        switch(levelAccess){
        
            case 1:
              //mesero
             
               posgui.setVisible(rootPaneCheckingEnabled);
               
                dispose();
                break;
            case 2:
              //admin
                homePage.setVisible(rootPaneCheckingEnabled);
                 dispose();
                break;
            case 3:
           //aqui iria la interface de cosinero
                   posgui.setVisible(rootPaneCheckingEnabled);
                    dispose();
                   
                   
                break;
           
        
        
        
        
        
        
        
        }
    
    
    
    
    
    
            }
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JpsPasswordL;
    private java.awt.Button btnLogin;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpDataLogin;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JTextPane jtxUser;
    private javax.swing.JLabel lbImgLogin;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}