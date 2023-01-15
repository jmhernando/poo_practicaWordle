/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Pack_Jugador.Almacen_de_jugadores;
import Pack_Jugador.Jugador;
import Pack_Partida.Marcador;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sohaib
 */
public class VerPerfil extends javax.swing.JPanel {

    private Almacen_de_jugadores almacenJugador = new Almacen_de_jugadores();
    DefaultTableModel tablaEstadistica;

    private Object[] elemFila;
 
    private Jugador j;
   

    public VerPerfil(Jugador perfilJugador) {
        initComponents();

        this.j = perfilJugador;
        tablaEstadistica = new DefaultTableModel();
        tablaEstadistica.addColumn("GANADAS"); //CREO LA COLUMNA DE GANADAS
        tablaEstadistica.addColumn("EMPATADAS");//CREO LA COLUMNA DE EMPTADAS
        tablaEstadistica.addColumn("PERDIDAS");//CREO LA COLUMNA DE PERDIDAS
        tablaEstadistica.addColumn("PTOS. TOTALES");//CREO LA COLUMNA DE PUNTOS TOTALES
        this.TablaStats.setModel(tablaEstadistica); //AÑADO ESTAS COLUMNAS A LA TABLA

        elemFila = new Object[4];
        elemFila[0] = perfilJugador.getPartidasGanadas();
        elemFila[1] = perfilJugador.getPartidasEmpatadas();
        elemFila[2] = perfilJugador.getPartidasPerdidas();
        elemFila[3] = perfilJugador.getPuntos();
        this.tablaEstadistica.addRow(elemFila); //mete el array en fila dentro de la tabla

      

        //EJEMPLO DE COMO SE VERIA UN PERFIL DE JUGADOR 
        NomJugador.setText(perfilJugador.getNombre().toUpperCase()); //SOLO MOSTRAR SI EL JUGADOR INTRODUCE SU NOMBRE Y USUARIO CORRECTAMENTE
    }

    public void MostrarPanel(JPanel p) {
        p.setSize(650, 380);
        p.setLocation(0, 0);
        this.removeAll();
        this.add(p, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
        p.setFocusable(true);
        p.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PerfilPanel = new javax.swing.JPanel();
        TitPerfil = new javax.swing.JLabel();
        NomJugador = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaStats = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        PerfilPanel.setBackground(new java.awt.Color(255, 255, 255));
        PerfilPanel.setPreferredSize(new java.awt.Dimension(650, 454));

        TitPerfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TitPerfil.setText("PERFIL DEL JUGADOR : ");

        NomJugador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TablaStats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaStats);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ESTADÍSTICA");

        javax.swing.GroupLayout PerfilPanelLayout = new javax.swing.GroupLayout(PerfilPanel);
        PerfilPanel.setLayout(PerfilPanelLayout);
        PerfilPanelLayout.setHorizontalGroup(
            PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(PerfilPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PerfilPanelLayout.createSequentialGroup()
                        .addComponent(TitPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(NomJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PerfilPanelLayout.setVerticalGroup(
            PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerfilPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitPerfil)
                    .addComponent(NomJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(407, 407, 407))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PerfilPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PerfilPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomJugador;
    private javax.swing.JPanel PerfilPanel;
    private javax.swing.JTable TablaStats;
    private javax.swing.JLabel TitPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
