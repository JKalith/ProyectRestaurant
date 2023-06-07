/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Waiter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author cesar
 */
public class MealMap {

    public Map<String, ProductMeal> productosMapa;
    public JComboBox<String> comboBox = new JComboBox<>();
    public SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 20, 1);
    public JSpinner spinner = new JSpinner(model);

    public static Map<String, ProductMeal> readProduct(String nombreArchivo) throws FileNotFoundException {
        Map<String, ProductMeal> productosMapa = new HashMap<>();

        try (Scanner scanner = new Scanner(new File(nombreArchivo))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] campos = linea.split(",");

                if (campos.length == 4) {
                    String codigo = campos[0].trim();
                    String nombre = campos[1].trim();
                    int precio = Integer.parseInt(campos[2].trim());
                    int cantidad = Integer.parseInt(campos[3].trim());
                    ProductMeal producto = new ProductMeal(nombre, precio);
                    productosMapa.put(codigo, producto);
                }
            }

            return productosMapa;
        }
    }

    public void filtrarPorCodigo(String[] filtro, JComboBox<String> comboBox, JSpinner spinner) throws FileNotFoundException {
        String nombreArchivo = "Menu.txt";
        Map<String, ProductMeal> productosMapa = readProduct(nombreArchivo);
        readProduct(nombreArchivo);
        int quantity = (int) spinner.getValue();
        for (Map.Entry<String, ProductMeal> entry : productosMapa.entrySet()) {
            String codigo = entry.getKey();
            ProductMeal producto = entry.getValue();
            producto.setMealAmount(quantity);
            for (String filtros : filtro) {
                if (codigo.startsWith(filtros)) {
                    comboBox.addItem(codigo + ", " + producto.getMealName() + ", " + producto.getMealPrice());
                }
            }
        }
    }

}
