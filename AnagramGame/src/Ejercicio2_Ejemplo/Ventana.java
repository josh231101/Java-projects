/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2_Ejemplo;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


/**
 *
 * @author Miguel
 */
public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private JLabel imagenDeporte;
    private JRadioButton futbol;
    private JRadioButton atletismo;
    private JRadioButton basquetbol;
    private JRadioButton natacion;
    private ButtonGroup grupoRadioBotones;
    
   
    public Ventana(){
        setSize(600, 400);
        setTitle("DEPORTES");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        iniciarPanel();
        iniciarTitulo();
        iniciarOpciones();
        
    }

    private void iniciarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }

    private void iniciarTitulo() {
        etiqueta = new JLabel("Escoge tu deporte favorito: ");
        etiqueta.setBounds(20, 20, 300, 30);
        etiqueta.setFont(new Font("Calibri", Font.BOLD, 20));
        panel.add(etiqueta);
        
        
    }

    private void iniciarOpciones() {
        
        Font font = new Font("Calibri", Font.PLAIN, 16);
        futbol = new JRadioButton("Fútbol");
        futbol.setFont(font);
        futbol.setBounds(20, 100, 100, 50);
        atletismo = new JRadioButton("Atletismo");
        atletismo.setFont(font);
        atletismo.setBounds(20, 150, 100, 50);
        natacion = new JRadioButton("Natación");
        natacion.setFont(font);
        natacion.setBounds(20, 200, 100, 50);
        basquetbol = new JRadioButton("Basquetbol");
        basquetbol.setFont(font);
        basquetbol.setBounds(20, 250, 100, 50);
        
        panel.add(futbol);
        panel.add(atletismo);
        panel.add(basquetbol);
        panel.add(natacion);
        
        
        //Los hacemos un conjunto
        grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(futbol);
        grupoRadioBotones.add(atletismo);
        grupoRadioBotones.add(natacion);
        grupoRadioBotones.add(basquetbol);
        
        
            
        eventoDeAccion();
    }
    
    private void eventoDeAccion(){
        imagenDeporte = new JLabel();
        imagenDeporte.setBounds(160, 80, 400, 220);
        panel.add(imagenDeporte);
        
        final ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
        final ImageIcon imagenBasquetbol = new ImageIcon(getClass().getResource("/Imagenes/basquetbol.jpg"));
        final ImageIcon imagenNatacion = new ImageIcon(getClass().getResource("/Imagenes/natacion.jpg"));
        final ImageIcon imagenAtletismo = new ImageIcon(getClass().getResource("/Imagenes/atletismo.jpg"));
        
                
        
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagenDeporte.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(400, 220, Image.SCALE_SMOOTH)));
                
                
            }
        };
        ActionListener evento2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagenDeporte.setIcon(new ImageIcon(imagenBasquetbol.getImage().getScaledInstance(400, 220, Image.SCALE_SMOOTH)));
                
                
            }
        };
        ActionListener evento3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagenDeporte.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(400, 220, Image.SCALE_SMOOTH)));
                
                
            }
        };
        ActionListener evento4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagenDeporte.setIcon(new ImageIcon(imagenAtletismo.getImage().getScaledInstance(400, 220, Image.SCALE_SMOOTH)));
                
                
            }
        };
        futbol.addActionListener(evento);
        basquetbol.addActionListener(evento2);
        natacion.addActionListener(evento3);
        atletismo.addActionListener(evento4);
        
    }
    
    
}
