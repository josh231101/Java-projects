//Clase Math
package Operadores;


public class MathClass {
    public static void main(String[] args){
        //SACAR RAIZ
        
        //Debe ser double o sino debes castear
        int raiz = (int) Math.sqrt(9);
        System.out.println(raiz);
        
        //ELEVAR UN MUMERO
        double base = 5, exponente= 5;
          //Primero base y despues exponente
        double resultado = Math.pow(base, exponente);
        
        System.out.println(resultado);
        
        //REDONDEAR
        double y = 4.56;
        long redondeado = Math.round(y);
        System.out.println(redondeado);
        
        //SACAR UN NUMERO RANDOM
        double numero = Math.random();
        System.out.println(numero);
    }
}
