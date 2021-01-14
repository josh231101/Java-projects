/*
 Ordenar 3 numeros de mayor a menor
 */
package Ejercicios2;

import javax.swing.JOptionPane;

public class Ejercicio_7 {
    public static void main(String[] args){
        int n1,n2,n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero. "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero. "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero. "));
        
        if(n1>n2 && n2>n3){
           JOptionPane.showMessageDialog(null, n1+" , "+n2+" , "+n3);
        }else if(n1>n3 && n3>n2){
            JOptionPane.showMessageDialog(null, n1+" , "+n3+" , "+n2);
        }else if(n2>n1 && n1>n3){
             JOptionPane.showMessageDialog(null, n2+" , "+n1+" , "+n3);
        }else if(n2>n3 && n3>n1){
            JOptionPane.showMessageDialog(null, n2+" , "+n3+" , "+n1);
        }else if(n3>n1 && n1>n2){
            JOptionPane.showMessageDialog(null, n3+" , "+n1+" , "+n2);
        }else if(n3>n2 && n2>n1){
            JOptionPane.showMessageDialog(null, n3+" , "+n2+" , "+n1);
        }
    }
}
