/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosbinario;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Miguel
 */

public class AñadirContenido extends ObjectOutputStream{

    public AñadirContenido(OutputStream out) throws IOException {
        super(out);
    }

    public AñadirContenido() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader() throws IOException{
        reset();//Eliminar las cabeceras 
    }
    
}
