/*
 Pedir un numero N ,introducir n sueldos y
saber el máximo
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_20 {
    public static void main(String[] args){
        int numeroSueldos;
        float sueldo,sueldo_max=0;
        
        numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de sueldos que quieres introducir"));
        
        for(int i= 1;i<=numeroSueldos;i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de sueldos que quieres introducir"));
            
            if(sueldo>sueldo_max){
                sueldo_max=sueldo;
            }
            
        }
        System.out.println("El sueldo máximo es de: " + sueldo_max);
        
    }
    
}
