/*
 Dadas 6 notas, escribir la cantidad de alumnos aprobados,
condicionados,y suspensos
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ejercicio_19 {
    public static void main(String[] args){
        int aprobado=0,condicionados=0,suspensos=0;
        float calificacion;
        for(int i=1;i<=6;i++){
            do{
                calificacion = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion"));
            }while(calificacion<0||calificacion>10);
                    
           
            if(calificacion ==4){
                condicionados++;
                
            }else if(calificacion <4){
                suspensos++;
            }else{
                aprobado++;
            }
        }
        
        
        System.out.println("El numero de aprobados son " + aprobado);
        System.out.println("El numero de condicionados son " + condicionados);
        System.out.println("El numero de suspensos son " + suspensos);
    }
    
}
