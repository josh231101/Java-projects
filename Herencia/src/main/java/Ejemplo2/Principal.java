/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

/**
 *
 * @author Miguel
 */
public class Principal {
    
    public static void main(String[] args){
        Planta planta = new Planta();
        planta.alimentarse();
        
        AnimalCarnivoro animalcarnivoro = new AnimalCarnivoro();
        animalcarnivoro.alimentarse();
        
        AnimalHerbivoro animalh = new AnimalHerbivoro();
        animalh.alimentarse();
    }
    
}
