/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_14 {
    public static void main(String[] args){
        int sueldo, suma_sueldos=0,may_cero=0;
        
        for(int i=1;i<=10;i++){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Digite los 10 sueldos"));
            
            if(sueldo>1000){
                may_cero++;
            }
            suma_sueldos+=sueldo;
        }
        System.out.println("El sueldo total de los 10 trabajadores fue de " + suma_sueldos);
        System.out.println(may_cero + " personas ganan mas de mil dolares");
    }
    
}
