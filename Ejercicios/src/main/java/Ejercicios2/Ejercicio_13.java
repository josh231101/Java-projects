/*
 CAJERO
 */
package Ejercicios2;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Ejercicio_13 {
    public static void main(String[] args){
        final int saldo_inicial = 1000;
        int opcion,saldo_final;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO AL CAJERO VIRTUAL \n"
        + "1.Introducir dinero \n" + "2.Retirar dinero \n" + "3.Salir"));
        
        switch(opcion){
            case 1: 
               saldo_final = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero quieres meter: "));
               saldo_final+=saldo_inicial;
               JOptionPane.showMessageDialog(null, "Tienes un total de " + saldo_final);
                break;
            case 2:
                saldo_final = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero quieres sacar: "));
                saldo_final = saldo_inicial - saldo_final;
               JOptionPane.showMessageDialog(null, "Tienes un total de " + saldo_final);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "GRACIAS POR TU VISITA");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No ingresaste ningun numero válido");
        }
       
    }
}
