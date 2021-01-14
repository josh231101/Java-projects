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
public class VehiculoFurgoneta extends Vehiculo{
    
   private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo,int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matricula " + matricula + "\nMarca: " + marca+
                "\nModelo: " + modelo + "\nCarga" + carga;
    }
    
   
   
    
}
