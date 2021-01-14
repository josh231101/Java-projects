/*
 Calculadora
 */
package Ejercicios2;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Ejercicio_10 {
    public static void main(String[] args){
        int suma,resta,multi,div;
        int num1,num2;
        char operacion;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        
        operacion = JOptionPane.showInputDialog("Digite que operacion quieres realizar").charAt(0);
        
        switch(operacion){
            case 'S':
            case 's': suma = num1 + num2;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                break;
            case 'r':
            case 'R': resta = num1-num2;
                      JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;
            case 'm':
            case 'M': multi = num1 * num2;
                      JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multi);
                break;
            case 'd':
            case 'D': div = num1/num2;
                      JOptionPane.showMessageDialog(null, "La division es: " + div);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
        
        
        
        
        
    }
    
}
