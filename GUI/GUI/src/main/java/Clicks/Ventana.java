/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clicks;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Miguel
 */
public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int i=0;
    
    public Ventana(){
        setSize(400, 400);
        setTitle("Clicks");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
        
    }

    private void iniciarComponentes() {
        crearPanel();
        etiqueta();
        boton();
    }

    private void crearPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }

    private void etiqueta() {
        etiqueta = new JLabel();
        etiqueta.setBounds(120, 50, 160, 60);
        etiqueta.setText("Pulsa el boton");
        etiqueta.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta);
        
    }
    private void boton(){
        boton = new JButton("Pulsa aqui");
        boton.setBounds(120, 140, 160, 40);
        boton.setBackground(Color.WHITE);
        boton.setFont(new Font("cooper black", Font.PLAIN, 18));
        panel.add(boton);
        eventoClick();
    }
    private void eventoClick(){
        ActionListener clicked = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                if(i == 1){
                    etiqueta.setText("Pulsado 1 vez");
                    
                }else{
                  etiqueta.setText("Pulsado " + i + " veces");
                
                }
                
            }
        };
        boton.addActionListener(clicked);
    }
    public static void main(String[] args) {
        Ventana v2 = new Ventana();
        v2.setVisible(true);
    }
    
}
