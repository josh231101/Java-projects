/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;

/**
 *
 * @author Miguel
 */
public class Main2 {
    public static void main(String[] args){
        
        Retorno ret = new Retorno();
        //Primera forma
        System.out.println("La suma es " + ret.sumar(7,5));
        
        //Segunda forma
        int resta = ret.restar(10, 5);
        System.out.println("La resta es " + resta);
        //Tercera forma
        int num1=10,num2=5;
        int multi = ret.multiplicacion(num1, num2);
        System.out.println("La multiplicacion es" + multi);
        
        
    }
    
}
