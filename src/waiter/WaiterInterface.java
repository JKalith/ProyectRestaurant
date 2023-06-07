package Waiter;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import static Waiter.Order.txtOrder;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 * Este es el frame principal del módulo del mesero, desde acá van a ir
 * surgiendo las distintas funcionabilidades del módulo.
 *
 * @author Cesar Perez
 */
public class WaiterInterface extends javax.swing.JFrame {

    //Se instancia la clase Order para poder hacera visible al momento de seleccionar una mesa dada.
    Order order = new Order("", "");
    int filas = 5;
    int columnas = 2;
    public Map<String, ProductMeal> mapProduct;

    public WaiterInterface() throws IOException {
        // Establecer el título de la ventana
        super("Punto de venta restaurante Macakos");

        initComponents();
        createJButtonMatrix(filas, columnas);
        // Obtener la resolución de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        // Establecer el tamaño máximo del frame al tamaño de la pantalla
        setSize(pantalla.width, pantalla.height);

        // Establecer la posición del frame en la esquina superior izquierda
        setLocation(0, 0);

        // Maximizar el frame para ocupar toda la pantalla
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblTables = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jdpOrders.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jdpOrdersLayout = new javax.swing.GroupLayout(jdpOrders);
        jdpOrders.setLayout(jdpOrdersLayout);
        jdpOrdersLayout.setHorizontalGroup(
            jdpOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1244, Short.MAX_VALUE)
        );
        jdpOrdersLayout.setVerticalGroup(
            jdpOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
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
                .addGap(282, 282, 282))
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
                .addGap(656, 656, 656)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1455, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTables, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

//Método para cerrar el frame WaiterInterface.
        dispose();
        //Se muestra una ventana emergente que notifica que se cerró sesión de manera correcta
        JOptionPane.showMessageDialog(null, "Sesión cerrada correctamente");
    }//GEN-LAST:event_btnExitActionPerformed

    public static void main(String args[]) throws IOException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WaiterInterface().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(WaiterInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    int largoboton = 70;
    int anchoboton = 70;
    int ejeX = 20;
    int ejeY = 20;

    public JButton[][] JButton;

    public void createJButtonMatrix(int rows, int columns) throws IOException {
        JButton = new JButton[rows][columns];
        int g = 1;

        String filePath = generateTxt();
        readTXT(filePath);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                JButton[i][j] = new JButton();
                JButton[i][j].setBounds(ejeX, ejeY, largoboton, anchoboton);
                JButton[i][j].setName("Mesa" + g);
                JButton[i][j].setText("" + g);
                String tableName = JButton[i][j].getText();
                colorChange(JButton[i][j], tableName, filePath);
                JButton[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        order = new Order(tableName, filePath);
                        //Se agrega el JInternal Frame Order al JDesktopPane del Frame WaiterInterface.
                        jdpOrders.add(order);
                        //Se hace visible el JInternal Frame Order.
                        order.setVisible(true);
                        try {
                            filterForCode(tableName, txtOrder, filePath);

                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(WaiterInterface.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                jPanel1.add(JButton[i][j]);
                ejeX += 100;
                g++;
            }
            ejeX = 20; // Reiniciar el valor de ejeX al comienzo de cada fila
            ejeY += 80;
        }
    }

    public String generateTxt() throws IOException {
        String folderPath = "C:\\Users\\james\\Documents\\AA  Ucr 2023\\Progra 2\\Carpeta de codigos\\Proyecto restaurante cesarrrrrrrr\\Restaurante\\Res2\\ProyectRestaurant";
        String fileName = "ControlPedidos.txt";

        File folder = new File(folderPath);
        File file = new File(folder, fileName);

        try {
            if (!folder.exists()) {
                folder.mkdirs();
            }
            // Crear el archivo
            if (file.createNewFile()) {
//                System.out.println("El archivo se creó correctamente en: " + file.getAbsolutePath());
            } else {
//                System.out.println("El archivo ya existe en: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        return file.getAbsolutePath();
    }

    public void readTXT(String filePath) {
        try {
            // Verificar si el archivo existe
            File file = new File(filePath);
            if (file.exists()) {
                // Leer el archivo y almacenar su contenido en un StringBuilder
                StringBuilder content = new StringBuilder();
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                reader.close();
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, ProductMeal> mapOrder(String filePath) throws FileNotFoundException {
        Map<String, ProductMeal> productosMapa = new HashMap<>();

        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] campos = linea.split(",");
            if (campos.length == 6) {
                String tableNumber = campos[0].trim();
                String state = campos[1].trim();
                String code = campos[2].trim();
                String name = campos[3].trim();
                int price = Integer.parseInt(campos[4].trim());
                int quantity = Integer.parseInt(campos[5].trim());
                ProductMeal producto = new ProductMeal(state, code, name, price, quantity);
                productosMapa.put(tableNumber, producto);
            }
        }

        return productosMapa;
    }

    public void filterForCode(String filter, JTextArea textArea, String filePath) throws FileNotFoundException {
        Map<String, ProductMeal> productosMapa = mapOrder(filePath);
        StringBuilder content = new StringBuilder();
        for (Map.Entry<String, ProductMeal> entry : productosMapa.entrySet()) {
            String tableNumber = entry.getKey();
            ProductMeal producto = entry.getValue();
            if (tableNumber.startsWith(filter)) {
                content.append(tableNumber + ", " + producto.getState() + ", " + producto.getCode() + ", " + producto.getMealName() + ", " + producto.getMealPrice() + ", " + producto.getMealAmount() + "\n"); // Añadir '\n' al final para un formato de línea por línea
            }
            textArea.setText(content.toString());
        }
    }

    public void colorChange(JButton button, String tableName, String filePath) throws FileNotFoundException {
        Map<String, ProductMeal> productosMapa = mapOrder(filePath);
        ProductMeal producto = productosMapa.get(tableName);
        if (producto != null) {
            button.setBackground(Color.RED);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JDesktopPane jdpOrders;
    private javax.swing.JLabel lblTables;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables

}
