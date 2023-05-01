package Restaurant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jorshua Solorzano
 */
public class POSGUI extends javax.swing.JFrame implements ActionListener {

    public POSGUI() {
        // establecer el título de la ventana
        super("POS para Restaurante");

        // configurar los elementos de la interfaz gráfica
        lblCustomerName = new JLabel("Nombre del Cliente: ");
        lblOrder = new JLabel("Pedido: ");
        txtCustomerName = new JTextField(20);
        txtOrder = new JTextArea(10, 20);
        jPanel1 = new JPanel();
        btnSendToKitchen = new JButton("Enviar a la Cocina");
        btnSendToBar = new JButton("Enviar al Bar");
        // crear un menú desplegable con los alimentos y bebidas disponibles
        String[] menuItems = {"Hamburguesa", "Pizza", "Ensalada", "Sopa", "Cerveza", "Vino", "Refresco", "Agua"};
        cmbMenu = new JComboBox<>(menuItems);

        // establecer el diseño de la interfaz gráfica
        jPanel1.add(lblCustomerName);
        jPanel1.add(txtCustomerName);
        jPanel1.add(lblOrder);
        jPanel1.add(txtOrder);
        jPanel1.add(btnSendToKitchen);
        jPanel1.add(btnSendToBar);
        jPanel1.add(cmbMenu);
        // agregar el panel a la ventana
        add(jPanel1);

        // Establece los manejadores de eventos para los botones
        btnSendToKitchen.addActionListener(this);
        btnSendToBar.addActionListener(this);
        cmbMenu.addActionListener(this);
        // Configura las propiedades de la ventana
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCustomerName = new javax.swing.JLabel();
        lblOrder = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        btnSendToKitchen = new javax.swing.JButton();
        btnSendToBar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOrder = new javax.swing.JTextArea();
        cmbMenu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(185, 214, 243));

        lblCustomerName.setText("Nombre del cliente:");

        lblOrder.setText("Pedido:");

        btnSendToKitchen.setText("Enviar a la cocina");

        btnSendToBar.setText("Enviar al bar");

        txtOrder.setColumns(20);
        txtOrder.setRows(5);
        jScrollPane1.setViewportView(txtOrder);

        cmbMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrder)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCustomerName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCustomerName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                                .addComponent(cmbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSendToBar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSendToKitchen))))
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerName)
                    .addComponent(cmbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSendToKitchen)
                .addGap(18, 18, 18)
                .addComponent(btnSendToBar)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        // Crea una instancia de la interfaz gráfica
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSGUI().setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        // Maneja los eventos del botón
        if (e.getSource() == btnSendToKitchen) {
            enviarPedido("cocina");
        } else if (e.getSource() == btnSendToBar) {
            enviarPedido("bar");
        } else if (e.getSource() == cmbMenu) {
            String selectedItem = cmbMenu.getSelectedItem().toString();
            txtOrder.append(selectedItem + "\n");
        }
    }

    private void enviarPedido(String destino) {
        // Obtener el nombre del cliente y el pedido
        String nombreCliente = txtCustomerName.getText();
        String pedido = txtOrder.getText();

        // Enviar el pedido al destino seleccionado
        if (destino.equals("cocina")) {
            System.out.println("Pedido para " + nombreCliente + " enviado a la cocina: " + pedido);
            guardarPedido("Cocina", nombreCliente, pedido);
        } else if (destino.equals("bar")) {
            System.out.println("Pedido para " + nombreCliente + " enviado al bar: " + pedido);
            guardarPedido("Bar", nombreCliente, pedido);
        }
    }

    private void guardarPedido(String destino, String nombreCliente, String pedido) {
        // Guardar el pedido en un archivo de texto para el historial
        try {
            FileWriter writer = new FileWriter("historial_pedidos.txt", true);
            writer.write(destino + "," + nombreCliente + "," + pedido );
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendToBar;
    private javax.swing.JButton btnSendToKitchen;
    private javax.swing.JComboBox<String> cmbMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextArea txtOrder;
    // End of variables declaration//GEN-END:variables
}
