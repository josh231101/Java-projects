/*
 
 */
package Ejercicios2;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Ejercicio_5 {
    public static void main(String[] args){
        int horasTrabajadas;
        float salarioTotal;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas trabajaste"));
        
        if(horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas * 16;
            JOptionPane.showMessageDialog(null, "Tu salario final es de " + salarioTotal);
        }
        else{
            salarioTotal = (40 * 16) + ((horasTrabajadas - 40)*20);
            JOptionPane.showMessageDialog(null, "Tu salario final es de " + salarioTotal);
            
        }
    }
    
}
