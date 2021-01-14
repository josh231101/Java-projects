/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios2;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Ejercicio_9 {
     public static void main(String[] args){
         int dia,mes,ano;
         
         dia = Integer.parseInt(JOptionPane.showInputDialog("Digita el dia"));
         mes = Integer.parseInt(JOptionPane.showInputDialog("Digita el mes"));
         ano = Integer.parseInt(JOptionPane.showInputDialog("Digita el año"));
         
         if(dia>=1 && dia<=30 || dia<=31 ){
             if(mes>=1 && mes<=12){
                 if(ano != 0 && ano<=2019){
                     JOptionPane.showMessageDialog(null,"La fecha es correcta el dia que escribisite fue \n"+dia+"/"+mes+"/"+ano);
                 }else{
                     JOptionPane.showMessageDialog(null,"El año es incorrecta");
                 }
                 
             }else{
                JOptionPane.showMessageDialog(null,"El mes es incorrecto"); 
             }
             
         
         }else{
             JOptionPane.showMessageDialog(null,"El dia es incorrecto");
         }
     }
    
}
