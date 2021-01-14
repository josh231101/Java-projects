/*
 MOstar rendimiento de una nota
 */
package Ejercicios2;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Ejercicio_11 {
     public static void main(String[] args){
         int nota;
         nota = Integer.parseInt(JOptionPane.showInputDialog("Digita tu nota"));
         
         
         switch(nota){
             case 1:
             case 2:
             case 3:    
             case 4:  JOptionPane.showMessageDialog(null, "Tu" + nota + " es insuficiente"); break;
             case 5:  JOptionPane.showMessageDialog(null, "Casi Apruebas!"); break;  
             case 6:  JOptionPane.showMessageDialog(null, "Aprobaste"); break;  
             case 7:  JOptionPane.showMessageDialog(null, "Puedes mejorar"); break;  
             case 8:  JOptionPane.showMessageDialog(null, "Que buena nota"); break;    
             case 9:    
             case 10: JOptionPane.showMessageDialog(null, "wOW SOBRESALIENTE"); break;    
             default:
                 JOptionPane.showMessageDialog(null, "payaso pon una nota de 1 a 10"); break;    
                 
         }
     }
    
}
