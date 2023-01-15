package Interfaz;

import Pack_Jugador.Jugador;
import Pack_Palabra.Palabra;
import Pack_Partida.Marcador;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jose Manuel
 */
public class Eleccion_num_Entrenamiento extends javax.swing.JPanel {

    private Palabra clase_palabra;
    private final Marcador marcador_jugadores = new Marcador();
//    private Jugador jugador_1;
//    private Jugador jugador_2;
    public Eleccion_num_Entrenamiento() {
        initComponents();
        this.setSize(650,380);
        
        grupo_letras.add(cinco);
        grupo_letras.add(seis);
//        this.jugador_1 = jugador1;
//        this.jugador_2 = jugador2;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_letras = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cinco = new javax.swing.JRadioButton();
        seis = new javax.swing.JRadioButton();
        botonIniPartida = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cinco.setBackground(new java.awt.Color(255, 255, 255));
        cinco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cinco.setForeground(new java.awt.Color(0, 0, 0));
        cinco.setText("Jugar con cinco letras");

        seis.setBackground(new java.awt.Color(255, 255, 255));
        seis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seis.setForeground(new java.awt.Color(0, 0, 0));
        seis.setText("Jugar con seis letras");

        botonIniPartida.setText("Iniciar");
        botonIniPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniPartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonIniPartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cinco))
                        .addGap(8, 8, 8)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(cinco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seis)
                .addGap(99, 99, 99)
                .addComponent(botonIniPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniPartidaActionPerformed
        this.clase_palabra = new Palabra(); // en el propio constructor se añade una palabra aleatoria


        if (cinco.isSelected()) {
            this.clase_palabra.setPalabra(1,0);
            this.clase_palabra = new Palabra();
        this.clase_palabra.setPalabra(1, 0);
        PartidaCincoEntrenamiento p5e = new PartidaCincoEntrenamiento(clase_palabra, 0, marcador_jugadores); // CREO UN OBEJTO PANEL DE PARTIDA_CINCO
        this.MostrarPanel(p5e);
        } else if (seis.isSelected()) {
        this.clase_palabra = new Palabra();
        this.clase_palabra.setPalabra(2, 0);
        PartidaSeisEntrenamiento p6e = new PartidaSeisEntrenamiento(clase_palabra, 0, marcador_jugadores); // CREO UN OBEJTO PANEL DE PARTIDA_seis
        this.MostrarPanel(p6e);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "NO SE HA SELECCIONADO NÚMERO DE LETRAS"); //si los datos incorrectos salta pestaña de error
        }
    }//GEN-LAST:event_botonIniPartidaActionPerformed
    public void MostrarPanel(JPanel p) {
        p.setSize(650, 380);
        p.setLocation(0, 0);
        jPanel1.removeAll();
        jPanel1.add(p, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
        p.setFocusable(true);
        p.grabFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniPartida;
    private javax.swing.JRadioButton cinco;
    private javax.swing.ButtonGroup grupo_letras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton seis;
    // End of variables declaration//GEN-END:variables
}
