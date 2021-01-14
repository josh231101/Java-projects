/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaPersona;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ControladorPersona implements ActionListener{
    private VistaPersona vista;
    private Persona persona;
    private ConsultasPersona modelo;

    public ControladorPersona(VistaPersona vista, Persona persona, ConsultasPersona modelo) {
        this.vista = vista;
        this.persona = persona;
        this.modelo = modelo;
        vista.botonInsertar.addActionListener(this);
        vista.botonLimpiar.addActionListener(this);
        vista.botonBuscar.addActionListener(this);
        vista.botonModificar.addActionListener(this);
        vista.botonEliminar.addActionListener(this);
    }
    public void iniciar(){
        vista.setTitle("CRUD CON MVC");
        vista.setLocationRelativeTo(null);
        vista.cajaID.setVisible(false);
    }
        
    public void limpiarCajas(){
        vista.cajaID.setText(null);
        vista.cajaBuscarClave.setText(null);
        vista.cajaClave.setText(null);
        vista.cajaNombre.setText(null);
        vista.cajaDomicilio.setText(null);
        vista.cajaCorreo.setText(null);
        vista.cajaCelular.setText(null);
        vista.cajaFechaNacimiento.setText(null);
        vista.comboBoxGenero.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.botonInsertar){
            persona.setClave(vista.cajaClave.getText());
            persona.setNombre(vista.cajaNombre.getText());
            persona.setDomicilio(vista.cajaDomicilio.getText());
            persona.setCelular(vista.cajaCelular.getText());
            persona.setCorreo_electronico(vista.cajaCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.cajaFechaNacimiento.getText()));
            persona.setGenero(vista.comboBoxGenero.getSelectedItem().toString());
            if(modelo.insertar(persona)){
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar registro");
                limpiarCajas();
            }
            
        
        }
        if(e.getSource() == vista.botonLimpiar){
            limpiarCajas();
        }
        if(e.getSource() == vista.botonBuscar){
            persona.setClave(vista.cajaBuscarClave.getText());
            //Si encontramos a la persona
            if(modelo.buscar(persona)){
                vista.cajaID.setText(String.valueOf(persona.getIdPersona()));
                vista.cajaNombre.setText(persona.getNombre());
                vista.cajaClave.setText(persona.getClave());
                vista.cajaDomicilio.setText(persona.getDomicilio());
                vista.cajaCelular.setText(persona.getCelular());
                vista.cajaCorreo.setText(persona.getCorreo_electronico());
                vista.cajaFechaNacimiento.setText(String.valueOf(persona.getFecha_nacimiento()));
                vista.comboBoxGenero.setSelectedItem(persona.getGenero());
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
                limpiarCajas();
            }
        }
        if(e.getSource() == vista.botonModificar){
            persona.setIdPersona(Integer.parseInt(vista.cajaID.getText()));
            persona.setClave(vista.cajaClave.getText());
            persona.setNombre(vista.cajaNombre.getText());
            persona.setDomicilio(vista.cajaDomicilio.getText());
            persona.setCelular(vista.cajaCelular.getText());
            persona.setCorreo_electronico(vista.cajaCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.cajaFechaNacimiento.getText()));
            persona.setGenero(vista.comboBoxGenero.getSelectedItem().toString());
            
            if(modelo.modificar(persona)){
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "Registro no modificado");
                limpiarCajas();
               
            }
        
        }
        if(e.getSource() == vista.botonEliminar){
            persona.setIdPersona(Integer.parseInt(vista.cajaID.getText()));
            if(modelo.eliminar(persona)){
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                limpiarCajas();
            }else{                
                JOptionPane.showMessageDialog(null, "Registro no eliminado");
               
            }
                
        }
        
            
    }
    

    
}
