/*
Ejercicio 8 : Una empresa de paquetes tiene varias sucursales en todo 
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
public class Sucursal {
    private int numSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numSucursal, String direccion, String ciudad) {
        this.numSucursal = numSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public String getDireccion() {
        return direccion;
    }
   

    public String getCiudad() {
        return ciudad;
    }
    
    public String mostrarDatosSucursal(){
        return "Numero sucursal: " + numSucursal +
                "\n Direccion: " + direccion
               + "\n ciudad" + ciudad;
    }
    
    public double calcular_precio(Paquete t){
        double precio;
        precio = t.getPeso()*1;
        
        if(t.getPrioridad() == 1){
            precio+=10;
        }
        
        if(t.getPrioridad() == 2){
            precio+=20;
        }
        return precio;
    }
     
     
    
    
    
}
