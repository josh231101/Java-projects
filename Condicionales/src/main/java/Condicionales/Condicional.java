/*
 if y else.
 */
package Condicionales;

import javax.swing.JOptionPane;


public class Condicional {
    public static void main(String[] args){
        int numero, dato = 5;
        
        /* 
        == : igualda
        != : Diferencia
        >  : Mayor
        >= : Mayor o igual
        <  : Menor
        <= : Menor o igual
        */
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if(numero != dato){
            JOptionPane.showMessageDialog(null,"El numero es diferente de 5");  
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero es 5"); 
        }
    }
    
}
