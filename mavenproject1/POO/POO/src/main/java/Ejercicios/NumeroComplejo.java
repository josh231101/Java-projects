/*
 Ejercicio 6: Construir un programa para trabajar con 2 numeros complejos, implementar el siguiente menú:
1. Sumar 2 números complejos.
2.Multiplicar 2 numeros complejos.
3. Comparar 2 números complejos(iguales o no)
4. Multiplicar un número complejo por un entero.
 */
package Ejercicios;


public class NumeroComplejo {
    //Ejemplo: 3+ 4i;
    
    private double a;//Parte real
    private double b;//Parte imaginaria

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    
    /*
    numer1 = 3 + 4i;
    numero2 = 2 + 5i;
    suma = 5 + 9i;
    NumeroComplejo numer1 = new NumeroComplejo(3,4);
    numero1.calculaSuma(numero2);
   
    */
    
    public NumeroComplejo calcularSuma(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a+c.getA(), b+c.getB());
        return suma;
    }
    
    /*
    numero1 = 3+4i;
    numero2 = 2+5i;
    multi = (3*2 - 4*5) + (3*5 + 4*2);
    */
    
    public NumeroComplejo calcularProducto(NumeroComplejo c){
        NumeroComplejo multi = new NumeroComplejo((a*c.getA() - b*c.getB()), (a*c.getB() + b*c.getA()));
        return multi;
    }
    /*
    numero1 = 3+4i;
    numero2 = 3+4i;
    */
    public boolean comprobarIgualdad(NumeroComplejo c){
        boolean igualdad = false;
        if((a==c.getA()) && (b==c.getB())){
            igualdad = true;
        }
        return igualdad;
    }
    /*
    numeroComplejo = 3+4i;
    entero = 2;
    multi = 6 + 8i;
    */
    public NumeroComplejo multiplicarPorEnter(int x){
        NumeroComplejo multi = new NumeroComplejo(a*x,b*x);
        return multi;
    }
    
    
}
