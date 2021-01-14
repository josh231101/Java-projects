/*
 El operador ternario
 */
package Condicionales;

import javax.swing.JOptionPane;


public class Operador_Ternario {
    public static void main(String[] args){
      int numero;
      String mensaje;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
      mensaje = (numero%2 == 0) ? "Es par" : "Es impar";
      
      JOptionPane.showMessageDialog(null, mensaje);
        
    }
}
