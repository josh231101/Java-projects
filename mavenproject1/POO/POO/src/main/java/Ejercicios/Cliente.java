/*
Ejercicio 7: Hacer un programa sencillo para realizar
gestiones en un banco para lo cula tendremos 2 calses (Cliente y Cuenta).
Considerar que un cliente se caracteriza por su nombre, apellido y DNI.
El cliente puede consultar saldo, así como ingresar y retirar dinero de sus 
cuentas. Además cada cuenta se caracteriza por un número de cuenta
y saldo.
 */
package Ejercicios;


public class Cliente {
    //Atrbutos(Caracteristicas)
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    
    public double consultar_saldo(int n){
        return cuentas[n].getSaldo();
    }
    
    public void ingresar_dinero(int n,double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }
    public void retirar_dinero(int n,double cantidad){
        cuentas[n].retirarDinero(cantidad);
    }
    
    
    
    
    
}
