/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Conexion;

/**
 *
 * @author Miguel
 */
public class Calendario extends javax.swing.JFrame {

    /**
     * Creates new form Calendario
     */
    public Calendario() {
        initComponents();
        grupoBotones
                .add(radioMujer); 
        grupoBotones.add(radioHombre);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        seleccionarFecha = new com.toedter.calendar.JDateChooser();
        botonMostrarFecha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radioMujer = new javax.swing.JRadioButton();
        radioHombre = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        casillaFutbol = new javax.swing.JCheckBox();
        casillaBasquetbol = new javax.swing.JCheckBox();
        casillaVoleibol = new javax.swing.JCheckBox();
        casillaTenis = new javax.swing.JCheckBox();
        botonInsertar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        integer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonMostrarFecha.setText("Mostrar Fecha");
        botonMostrarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarFechaActionPerformed(evt);
            }
        });

        jLabel1.setText("FORMULARIO");

        jLabel2.setText("Seleccione Género:");

        radioMujer.setText("Mujer");

        radioHombre.setText("Hombre");

        jLabel3.setText("¿Cuál es tu edad?");

        jLabel4.setText("Selecciona tus deportes favoritos");

        casillaFutbol.setText("Futbol");

        casillaBasquetbol.setText("Basquetbol");

        casillaVoleibol.setText("Voleibol");

        casillaTenis.setText("Tenis");

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioMujer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioHombre)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(casillaFutbol)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(casillaVoleibol))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(casillaBasquetbol)
                                .addGap(44, 44, 44)
                                .addComponent(casillaTenis))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonInsertar)
                                    .addComponent(seleccionarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(botonMostrarFecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(integer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addComponent(radioHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioMujer)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casillaFutbol)
                    .addComponent(casillaVoleibol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casillaBasquetbol)
                    .addComponent(casillaTenis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMostrarFecha)
                    .addComponent(seleccionarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonBuscar)
                    .addComponent(integer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMostrarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarFechaActionPerformed
        // TODO add your handling code here:
        
        //Utilizamos la clase util
        Date date = seleccionarFecha.getDate();
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);
        JOptionPane.showMessageDialog(null, String.valueOf(d));
        
        JOptionPane.showMessageDialog(null, fecha);
        
        
        
    }//GEN-LAST:event_botonMostrarFechaActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        
        String genero = "";
        int edad;
        boolean futbol=false,basquetbol=false,voleibol=false,tenis=false;
        
        //RADIOBUTTON
        if(radioHombre.isSelected() == true){
            genero = "Hombre";
        }
        else if(radioMujer.isSelected()==true){
            genero = "Mujer";
        }else{
            genero = "No especifiado";
        }
        
        //Numero de edad
        edad = (int) jSpinner1.getValue();
        
        //Casilla de verificacion
        if(casillaFutbol.isSelected() == true){
            futbol = true;
            
        }
        if(casillaBasquetbol.isSelected() == true){
            basquetbol = true;
        }
        if(casillaTenis.isSelected() == true){
            tenis = true;
        }
        if(casillaVoleibol.isSelected() == true){
           voleibol = true;
        }
        
        try{
            Connection conexion = con.getConnection();
            ps = (PreparedStatement) conexion.prepareStatement("insert into gustospersona (genero,edad,futbol,basquet,voleibol,tenis) values (?,?,?,?,?,?)");
            ps.setString(1, genero);
            ps.setInt(2, edad);
            ps.setBoolean(3, futbol);
            ps.setBoolean(4, basquetbol);
            ps.setBoolean(5, voleibol);
            ps.setBoolean(6, tenis);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Exito en el envío");
            conexion.close();
            
        }catch(Exception e){
            System.err.println("ERROR: " + e);
        }
               
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        int numero = Integer.parseInt(integer.getText());
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Connection conexion = con.getConnection();
            ps = (PreparedStatement) conexion.prepareStatement("select genero,edad,futbol,basquet,voleibol,tenis from gustospersona where id=?");
            ps.setInt(1,numero);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                if(rs.getString("genero").equals("Hombre")){
                    radioHombre.setSelected(true);
                }
                else if(rs.getString("genero").equals("Mujer")){
                    radioMujer.setSelected(true);
                }
                jSpinner1.setValue(rs.getInt("edad"));
                
                if(rs.getBoolean("futbol") == true){
                    casillaFutbol.setSelected(true);
                }
                if(rs.getBoolean("basquet")==true){
                    casillaBasquetbol.setSelected(true);
                }
                if(rs.getBoolean("voleibol" )== true){
                    casillaVoleibol.setSelected(true);
                }
                if(rs.getBoolean("tenis") == true){
                    casillaTenis.setSelected(true);
                }
            }
            
            
            
        }catch(Exception e){
            System.err.println("ERROR: " + e);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonMostrarFecha;
    private javax.swing.JCheckBox casillaBasquetbol;
    private javax.swing.JCheckBox casillaFutbol;
    private javax.swing.JCheckBox casillaTenis;
    private javax.swing.JCheckBox casillaVoleibol;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JTextField integer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JRadioButton radioHombre;
    private javax.swing.JRadioButton radioMujer;
    private com.toedter.calendar.JDateChooser seleccionarFecha;
    // End of variables declaration//GEN-END:variables
}
