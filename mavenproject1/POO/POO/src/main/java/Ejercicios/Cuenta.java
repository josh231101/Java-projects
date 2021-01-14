/*
Ejercicio 7: Hacer un programa sencillo para realizar
gestiones en un banco para lo cula tendremos 2 calses (Cliente y Cuenta).
Considerar que un cliente se caracteriza por su nombre, apellido y DNI.
El cliente puede consultar saldo, así como ingresar y retirar dinero de sus 
cuentas. Además cada cuenta se caracteriza por un número de cuenta
y saldo.
 */
package Ejercicios;


public class Cuenta {
    //Atributos
    private int numeroCuenta;
    private double saldo;
    
    //METODOS
    
    //Constructor
    public Cuenta(int numeroCuenta,double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    //Metodo getter
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void ingresarDinero(double cantidad){
        saldo += cantidad;
    }
    
    public void retirarDinero(double cantidad){
        saldo-= cantidad;
    }
    
    
}
