/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FuctionClass;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author james
 */
public class MainConsola {
    
    static  LinkedList<String> menu = new LinkedList<>();
    
    
        Set<Menu> listStudents = new HashSet<Menu>();
static ReaderData reader = new ReaderData();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        


       reader.readerData(reader.selectFile(), menu);
              reader.changeDataType(); 
                LinkedList<Menu> students = reader.changeDataType();
     reader.see();
    }
    
}
