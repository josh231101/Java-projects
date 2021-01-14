/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class llenar_arreglo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos elementos quiere"));
       
        char[] letras  = new char[nElementos];
        
        
        for(int i = 0; i<nElementos ;i++){
            System.out.println((i+1) + ". CARACTER: ");
            letras[i] = entrada.next().charAt(0);
            
        }
        System.out.println("\n Los caracteres del arreglo son: ");
        for(int i = 0;i<nElementos;i++){
            System.out.print(letras[i] + " , ");
        }
        
        
    }
    
}
