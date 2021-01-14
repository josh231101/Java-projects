/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Miguel
 */
public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private JButton btn1,btn2,btn3;
    private int pulsado = 0;
    private int contadorRojo=0,contadorVerde=0,contadorAzul=0;
    
    public Ventana(){
        setSize(450, 450);
        setTitle("JUGAR RGB");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        crearPanel();
        crearEtiqueta();
        crearBotontes();
        
    }

    private void crearPanel() {
        panel= new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        eventoDeRuedaDeRaton();
    }

    private void crearEtiqueta() {
        etiqueta = new JLabel("COLOR(ROJO,VERDE,AZUL)");
        etiqueta.setBounds(80, 40, 500, 40);
        etiqueta.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        panel.add(etiqueta);
    }
    
    
    

    private void crearBotontes() {
        /*
        pulsado = 1 ->botonRojo
        pulsado = 2 -> botonVerde
        pulsado = 3 -> botonAzul
        */
        btn1 = new JButton("ROJO");
        btn1.setBounds(20, 250, 100, 40);
        btn1.setForeground(Color.red);
        btn1.setFont(new Font("arial rounde mt bold", Font.BOLD, 16));
        panel.add(btn1);
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 1;
            }
        });
        
        btn2 = new JButton("VERDE");
        btn2.setBounds(170, 250, 100, 40);
        btn2.setForeground(Color.green);
        btn2.setFont(new Font("arial rounde mt bold", Font.BOLD, 16));
        panel.add(btn2);
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 2;
            }
        });
        
        btn3 = new JButton("AZUL");
        btn3.setBounds(320, 250, 100, 40);
        btn3.setForeground(Color.blue);
        btn3.setFont(new Font("arial rounde mt bold", Font.BOLD, 16));
        panel.add(btn3);
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 3;
            }
        });
        
        
        
        
    }
    
    
    private void eventoDeRuedaDeRaton() {
        MouseWheelListener eventoRueda = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(pulsado != 0 ){//Si se pulso un boton
                    if(pulsado == 1){//Boton rojo
                        contadorRojo += e.getWheelRotation();
                        if(contadorRojo<0){
                            contadorRojo = 0;
                            
                        }
                        if(contadorRojo >255){
                            contadorRojo = 255;
                        }
                    }
                    else if(pulsado == 2){//Boton verde
                        contadorVerde += e.getWheelRotation();
                        if(contadorVerde<0){
                            contadorVerde = 0;
                            
                        }
                        if(contadorVerde >255){
                            contadorVerde = 255;
                        }
                    }
                    else{//Boton azul
                        contadorAzul += e.getWheelRotation();
                        if(contadorAzul<0){
                            contadorAzul = 0;
                            
                        }
                        if(contadorAzul >255){
                            contadorAzul = 255;
                        }
                    }
                }
                etiqueta.setText("Color(Rojo= " + contadorRojo + ",Verde " + contadorVerde+" ,Azul " + contadorAzul + ")");
                panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul));
            }
        };
        panel.addMouseWheelListener(eventoRueda);
    }
    
    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        v1.setVisible(true);
                
    }

    
    
}
