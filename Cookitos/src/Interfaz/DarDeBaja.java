package Interfaz;

import Pack_Jugador.Almacen_de_jugadores;
import Pack_Jugador.Jugador;
import java.io.Serializable;
import java.util.logging.*;


/**
 *
 * @author sohaib, laura, jose
 */
public class DarDeBaja extends javax.swing.JPanel implements Serializable {

     private String nombre;
    private Almacen_de_jugadores almacenjug;
    private Jugador j2;

    public DarDeBaja(Almacen_de_jugadores almacenj) {
        initComponents();
        this.almacenjug = almacenj;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDarDeBaja = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        PanelDarDeBaja.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Admin: Introduce el usuario que deseas dar de baja: ");

        jButton1.setText("Dar de baja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("NOMBRE DE USUARIO");

        javax.swing.GroupLayout PanelDarDeBajaLayout = new javax.swing.GroupLayout(PanelDarDeBaja);
        PanelDarDeBaja.setLayout(PanelDarDeBajaLayout);
        PanelDarDeBajaLayout.setHorizontalGroup(
            PanelDarDeBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDarDeBajaLayout.createSequentialGroup()
                .addGroup(PanelDarDeBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDarDeBajaLayout.createSequentialGroup()
                        .addGroup(PanelDarDeBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDarDeBajaLayout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jButton1))
                            .addGroup(PanelDarDeBajaLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(PanelDarDeBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelDarDeBajaLayout.createSequentialGroup()
                                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelDarDeBajaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDarDeBajaLayout.setVerticalGroup(
            PanelDarDeBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDarDeBajaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDarDeBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDarDeBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.nombre = String.valueOf(campoNombre.getText());

        //leer el fichero
        try {
            this.almacenjug.deserializar(); 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio_Sesion_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
        }

        //dar de baja al jugador
        try {
            if(almacenjug.baja(this.nombre)){
                javax.swing.JOptionPane.showMessageDialog(this, "Se ha borrado correctamente.");
            }
            else{
                    javax.swing.JOptionPane.showMessageDialog(this, "EL JUGADOR NO EXISTE");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DarDeBaja.class.getName()).log(Level.SEVERE, null, ex);
        }

        //escribir en el fichero
        try {
            almacenjug.serializar(); //escritura fichero
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DarDeAlta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDarDeBaja;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
