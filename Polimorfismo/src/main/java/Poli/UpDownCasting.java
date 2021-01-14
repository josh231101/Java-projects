/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poli;

/**
 *
 * @author Miguel
 */
public class UpDownCasting {
    public static void main(String[] args){
        //Upcasting
        Vehiculo vehiculo = new VehiculoDeportivo("er34","Ford", "FOCUS", 500);
        
        
        //DownCasting
        VehiculoDeportivo vehiculoEvolucion = (VehiculoDeportivo) vehiculo;
        
        //--
        
        System.out.println(vehiculoEvolucion.mostrarDatos());
    }
    
}
