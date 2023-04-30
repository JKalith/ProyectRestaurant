/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuctionClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import javax.swing.JFileChooser;


/**
 *
 * @author james
 */
public class ReaderData {
    Menu menu = new Menu();
 Set<Menu> menuHash = new HashSet<Menu>();


 LinkedList<Menu> list ;
 
 
 
 
       /**
         * Posee como funcion la seleccion del archivo txt a leer 
         * @return 
         * Retorna la ubicacion del archivo seleccionado
         */
        public String selectFile() {
        String ubicationFile = null;

        JFileChooser file = new JFileChooser();
        file.showOpenDialog(file);

        int checkInput = file.showOpenDialog(null);

        if (checkInput == JFileChooser.APPROVE_OPTION) {
            File openedFile = file.getSelectedFile();
            System.out.println("▄▄──▄▄──▄▄──▄▄──▄▄──▄▄─▄▄──▄▄──▄▄──▄▄");
            System.out.println("Nombre del archivo: " + openedFile.getName());
            System.out.println("Ubicacion del archivo: " + openedFile.getAbsolutePath());
            System.out.println("▄▄____▄▄____▄▄___▄▄___▄▄___▄▄__▄▄___▄▄___▄▄___▄▄");

            ubicationFile = openedFile.getAbsolutePath();
        } 
        return (ubicationFile);
    }
        
        
        
        
 
        
        
      /**
       * Lee los datos de un txt en base a la ubicacion proporcionada
       * @param ubicationFile 
       * recive una ubicacion de el escritorio para la lectura de txt o .doc
     * @param list
     * @return 
       */ 
     public LinkedList readerData(String ubicationFile,LinkedList<String> list){
      try (FileReader fr = new FileReader(ubicationFile);
             BufferedReader br = new BufferedReader(fr)) {

            String linea;
            // Leer cada línea del archivo de texto
            
            while ((linea = br.readLine()) != null) {
              
                
                
            String data[] = linea.split(",");
            String food = data[1];
            String price= data[0];
            menu=  new Menu(food, price);
            menuHash.add(menu);  
            }

         } catch (IOException e) {
             System.err.println("Error al leer el archivo: " + e.getMessage());
         }

         return list;

     }
        
        
        
        
      public LinkedList<Menu> changeDataType() {
         
         list = new LinkedList<>(menuHash);
        
       return list;
        
        
        
    }
 
    
        public void see() {

        for (Menu listStudent1 : list) {
            System.out.println(listStudent1);
          
        }
        
    }
         public LinkedList<Menu> orderData(LinkedList<Menu> lis) {

        Collections.sort(lis, (Menu o1, Menu o2) -> o1.getFood().compareTo(o2.getFood()));
        return list;

    }
}
