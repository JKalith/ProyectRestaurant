package ProyectRestaurant;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * * @author Yorle
 */
public class Orders {

    public static void main(String[] args) throws IOException {
        String customerName = null;
        String menuOption;
        String order;
        String historyFile = "Historial_pedidos.txt";
        String menuFile = "Menú.txt";
        // Ask for customer name        customerName = JOptionPane.showInputDialog(null, "¿Cual es su nombre?: ");
        // Read the menu from the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(menuFile));
            String line = reader.readLine();
            int optionNumber = 1;
            while (line != null) {
                JOptionPane.showMessageDialog(null, "Menú\n" + optionNumber + ". " + line);
                optionNumber++;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el menú.");
            return;
        }
        
        
        
        
        
        
        // Ask for customer's order
        menuOption = JOptionPane.showInputDialog(null, "Selecione una opción del menú: ");
        // Validate menu option        try {
        int optionNumber = Integer.parseInt(menuOption);
        BufferedReader reader = new BufferedReader(new FileReader(menuFile));
        String line = reader.readLine();
        int lineNumber = 1;
        while (line != null) {
            if (lineNumber == optionNumber) {
                order = line;                    // Write order to history file
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(historyFile, true));
                    writer.write("Cliente: " + customerName + " - Pedido: " + order + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Pedido registrado con éxito.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error al registrar el pedido.");
                }
                return;
            }
            lineNumber++;
            line = reader.readLine();
        }
        reader.close();
    }}
 