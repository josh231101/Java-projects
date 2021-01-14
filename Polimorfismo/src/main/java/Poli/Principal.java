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
public class Principal {
    public static void main(String[] args){
        //Reservamos una zona de memoria para 4 vehiculos
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("FG43", "Ferrar", "AF4");
        //Polimorfismo
        misVehiculos[1] = new VehiculoTurismo("78AHJ", "AUDI", "P14", 4);
        misVehiculos[2] = new VehiculoDeportivo("45GH", "Toyota", "kj8", 500);
        misVehiculos[3] = new VehiculoFurgoneta("JI8", "TOYOTA", "JJ9", 2000);
        
        
        
        for(Vehiculo x:misVehiculos){
            System.out.println(x.mostrarDatos());
            System.out.println("");
        }
    }
    
}
