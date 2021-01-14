/*
 Ejercicio 8 : Una empresa de paquetes tiene varias sucursales en todo e
el pais. Cada sucursal esta definida por su número de sucursal,direcion y pais.
Para calcular el precio que cuesta enviar cadad paquete y la prioridad, sabiendo que se cobra
un dolar por kilo, 10 dolares más si la prioridad es alta y 20 si es express.
Cada paquete enviado tendrá un numero de referencia y el DNI de la persona
que lo envía.
 */
package Ejercicio8;

/**
 *
 * @author Miguel
 */
public class Paquete {
    //Atributos
    private double peso;
    private String dni;
    private int numPaquete;
    
    private int prioridad;

    public Paquete(double peso,String dni, int numPaquete,int prioridad) {
        this.peso = peso;
        this.dni = dni;
        this.numPaquete = numPaquete;
        this.prioridad = prioridad;
    }

    public double getPeso() {
        return peso;
    }

    public String getDni() {
        return dni;
    }

    public int getNumPaquete() {
        return numPaquete;
    }

    

    public int getPrioridad() {
        return prioridad;
    }

    
    
    
    
    public String mostrarDatosPaquete(){
        return "\nNumero paquete: " + numPaquete + 
                "\nDNI: " + dni + "\nPeso " +peso
                + "\n Prioridad: " + prioridad;
    }
    
    
    
    
}
