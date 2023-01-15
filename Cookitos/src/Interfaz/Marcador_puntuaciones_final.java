package Interfaz;

import Pack_Jugador.Almacen_de_jugadores;
import Pack_Partida.Marcador;
import java.awt.Color;
import java.util.ArrayList;
import java.lang.StringBuilder;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Manuel
 */
public class Marcador_puntuaciones_final extends javax.swing.JPanel {

    private PartidaCinco partida_cinco;
    private Partida_seis partida_seis;
    //AQUÍ SE GUARDAN LOS PUNTOS (ESTO SE GUARDA EN EL HISTORIAL)
    private ArrayList<Integer> puntos_palabra1 = new ArrayList<Integer>(); // Create an ArrayList object
    private ArrayList<Integer> puntos_palabra2 = new ArrayList<Integer>();

    //TODAS LAS PALABRAS QUE SALGAN EN EL JUEGO SE VAN A GUARDAR EN ESTE ARRAY
    private ArrayList<String> palabras_marcador1 = new ArrayList<String>();
    private ArrayList<String> palabras_marcador2 = new ArrayList<String>();

    //AQUÍ SE ALMACENAN LAS PISTAS QUE SE USARON
    private ArrayList<Integer> restar_puntos_palabra1 = new ArrayList<Integer>(); // Create an ArrayList object
    private ArrayList<Integer> restar_puntos_palabra2 = new ArrayList<Integer>();

    private ArrayList<String> palabra_pista1 = new ArrayList<String>();
    private ArrayList<String> palabra_pista2 = new ArrayList<String>();

    private int puntosTotales1;
    private int puntosTotales2;
//    private int puntosFinalesJ1;
//    private int puntosFinalesJ2;
    private StringBuilder texto1 = new StringBuilder();
    private StringBuilder texto2 = new StringBuilder();
    private Almacen_de_jugadores almacenjug;
//CONSTRUCTOR CINCO

    public Marcador_puntuaciones_final(PartidaCinco partida_cinco) throws ClassNotFoundException {
        initComponents();
        this.partida_cinco = partida_cinco;
        this.puntos_palabra1 = this.partida_cinco.getMarcador_jugadores().getArray_puntos1();
        this.puntos_palabra2 = this.partida_cinco.getMarcador_jugadores().getArray_puntos2();
        this.palabras_marcador1 = this.partida_cinco.getMarcador_jugadores().getArray_palabras1();
        this.palabras_marcador2 = this.partida_cinco.getMarcador_jugadores().getArray_palabras2();

        this.restar_puntos_palabra1 = this.partida_cinco.getMarcador_jugadores().getArray_restar_puntos1();
        this.restar_puntos_palabra2 = this.partida_cinco.getMarcador_jugadores().getArray_restar_puntos2();
        this.palabra_pista1 = this.partida_cinco.getMarcador_jugadores().getArray_palabrasPistas1();
        this.palabra_pista2 = this.partida_cinco.getMarcador_jugadores().getArray_palabrasPistas2();

        this.puntosTotales1 = this.partida_cinco.getMarcador_jugadores().getPuntosJ1();
        this.puntosTotales2 = this.partida_cinco.getMarcador_jugadores().getPuntosJ2();

        this.almacenjug = this.partida_cinco.getMarcador_jugadores().getAlmacen();

        nombreJ1.setText(this.partida_cinco.getMarcador_jugadores().get_nombre_j1());
        nombreJ2.setText(this.partida_cinco.getMarcador_jugadores().get_nombre_j2());

//        this.puntosFinalesJ1= this.partida_cinco.getMarcador_jugadores().getPuntosJ1();
//        this.puntosFinalesJ2= this.partida_cinco.getMarcador_jugadores().getPuntosJ2();
        this.partida_cinco.getMarcador_jugadores().ganadorJuego();
        if (this.partida_cinco.getMarcador_jugadores().getGanaJ1()) {
            texto1 = texto1.append("HA GANADO LA PARTIDA!!!\n");
            texto2 = texto2.append("HA PERDIDO LA PARTIDA :(\n");
            Palabras_puntos_J1.setBackground(Color.decode("#008f39"));
            Palabras_puntos_J2.setBackground(Color.decode("#cb3234"));
        } else if (this.partida_cinco.getMarcador_jugadores().getGanaJ2()) {
            texto1 = texto1.append("HA PERDIDO LA PARTIDA :(\n");
            texto2 = texto2.append("HA GANADO LA PARTIDA!!!\n");
            Palabras_puntos_J1.setBackground(Color.decode("#cb3234"));
            Palabras_puntos_J2.setBackground(Color.decode("#008f39"));
        } else {
            texto1 = texto1.append("EMPATE!\n");
            texto2 = texto2.append("EMPATE!\n");
            Palabras_puntos_J1.setBackground(Color.decode("#ff8000"));
            Palabras_puntos_J2.setBackground(Color.decode("#ff8000"));
        }

        for (int i = 0; i < this.palabras_marcador1.size(); i++) {
            texto1 = texto1.append(this.palabras_marcador1.get(i)).append("                         ").append(this.puntos_palabra1.get(i).toString()).append("  PUNTOS\n");
        }
        for (int i = 0; i < this.palabras_marcador2.size(); i++) {
            texto2 = texto2.append(this.palabras_marcador2.get(i)).append("                         ").append(this.puntos_palabra2.get(i).toString()).append(" PUNTOS\n");
        }

        texto1 = texto1.append("\n ******************************\nSe restan:\n ");
        texto2 = texto2.append("\n ******************************\nSe restan:\n ");

        for (int i = 0; i < this.palabra_pista1.size(); i++) {
            texto1 = texto1.append(this.restar_puntos_palabra1.get(i)).append(" Puntos en la palabra: ").append(this.palabra_pista1.get(i)).append("\n");
        }

        for (int i = 0; i < this.palabra_pista2.size(); i++) {
            texto2 = texto2.append(this.restar_puntos_palabra2.get(i)).append(" Puntos en la palabra: ").append(this.palabra_pista2.get(i)).append("\n");
        }

        texto1 = texto1.append("\n ******************************\nPuntuacion final:\n ").append(this.puntosTotales1);
        texto2 = texto2.append("\n ******************************\nPuntuacion final:\n ").append(this.puntosTotales2);

         //JUGADOR 2*/
        
        this.partida_cinco.getMarcador_jugadores().guardarResultados();
        this.partida_cinco.getMarcador_jugadores().getAlmacen().modificar_array(this.partida_cinco.getMarcador_jugadores().getJugador1(), this.partida_cinco.getMarcador_jugadores().getJugador2());

//        this.partida_cinco.getMarcador_jugadores().getJugador1().setNombreRivales(partida_cinco.getMarcador_jugadores()); //JUGADOR 1
//        this.partida_cinco.getMarcador_jugadores().getJugador2().setNombreRivales(partida_cinco.getMarcador_jugadores());
        
//        this.partida_cinco.getMarcador_jugadores().getAlmacen().modificar_array(this.partida_cinco.getMarcador_jugadores().getJugador1(), this.partida_cinco.getMarcador_jugadores().getJugador2());
        Palabras_puntos_J1.setText(texto1.toString());
        Palabras_puntos_J2.setText(texto2.toString());

        //SACAR UN MARCADOR DE PARTIDA 5 , DONDE EN UN MARCADOR TIENE LOS JUGADORES CON EL CONTENIDO DE LOS JUGADORES
    }

    public Marcador_puntuaciones_final(Partida_seis partida_seis) {

        initComponents();
        this.partida_seis = partida_seis;
        this.puntos_palabra1 = this.partida_seis.getMarcador_jugadores().getArray_puntos1();
        this.puntos_palabra2 = this.partida_seis.getMarcador_jugadores().getArray_puntos2();
        this.palabras_marcador1 = this.partida_seis.getMarcador_jugadores().getArray_palabras1();
        this.palabras_marcador2 = this.partida_seis.getMarcador_jugadores().getArray_palabras2();

        this.restar_puntos_palabra1 = this.partida_seis.getMarcador_jugadores().getArray_restar_puntos1();
        this.restar_puntos_palabra2 = this.partida_seis.getMarcador_jugadores().getArray_restar_puntos2();
        this.palabra_pista1 = this.partida_seis.getMarcador_jugadores().getArray_palabrasPistas1();
        this.palabra_pista2 = this.partida_seis.getMarcador_jugadores().getArray_palabrasPistas2();

        this.puntosTotales1 = this.partida_seis.getMarcador_jugadores().getPuntosJ1();
        this.puntosTotales2 = this.partida_seis.getMarcador_jugadores().getPuntosJ2();

        this.almacenjug = this.partida_seis.getMarcador_jugadores().getAlmacen();

        nombreJ1.setText(this.partida_seis.getMarcador_jugadores().get_nombre_j1());
        nombreJ2.setText(this.partida_seis.getMarcador_jugadores().get_nombre_j2());

        this.partida_seis.getMarcador_jugadores().ganadorJuego();
        if (this.partida_seis.getMarcador_jugadores().getGanaJ1()) {
            texto1 = texto1.append("HA GANADO LA PARTIDA!!!\n");
            texto2 = texto2.append("HA PERDIDO LA PARTIDA :(\n");
            Palabras_puntos_J1.setBackground(Color.decode("#008f39"));
            Palabras_puntos_J2.setBackground(Color.decode("#cb3234"));
        } else if (this.partida_seis.getMarcador_jugadores().getGanaJ2()) {
            texto1 = texto1.append("HA PERDIDO LA PARTIDA :(\n");
            texto2 = texto2.append("HA GANADO LA PARTIDA!!!\n");
            Palabras_puntos_J1.setBackground(Color.decode("#cb3234"));
            Palabras_puntos_J2.setBackground(Color.decode("#008f39"));
        } else {
            texto1 = texto1.append("EMPATE!\n");
            texto2 = texto2.append("EMPATE!\n");
            Palabras_puntos_J1.setBackground(Color.decode("#ff8000"));
            Palabras_puntos_J2.setBackground(Color.decode("#ff8000"));
        }

        for (int i = 0; i < this.palabras_marcador1.size(); i++) {
            texto1 = texto1.append(this.palabras_marcador1.get(i)).append("                         ").append(this.puntos_palabra1.get(i).toString()).append("  PUNTOS\n");
        }
        for (int i = 0; i < this.palabras_marcador2.size(); i++) {
            texto2 = texto2.append(this.palabras_marcador2.get(i)).append("                         ").append(this.puntos_palabra2.get(i).toString()).append(" PUNTOS\n");
        }

        texto1 = texto1.append("\n ******************************\nSe restan:\n ");
        texto2 = texto2.append("\n ******************************\nSe restan:\n ");

        for (int i = 0; i < this.palabra_pista1.size(); i++) {
            texto1 = texto1.append(this.restar_puntos_palabra1.get(i)).append(" Puntos en la palabra: ").append(this.palabra_pista1.get(i)).append("\n");
        }

        for (int i = 0; i < this.palabra_pista2.size(); i++) {
            texto2 = texto2.append(this.restar_puntos_palabra2.get(i)).append(" Puntos en la palabra: ").append(this.palabra_pista2.get(i)).append("\n");
        }

        texto1 = texto1.append("\n ******************************\nPuntuacion final:\n ").append(this.puntosTotales1);
        texto2 = texto2.append("\n ******************************\nPuntuacion final:\n ").append(this.puntosTotales2);

        this.partida_seis.getMarcador_jugadores().guardarResultados();
        try {
            this.partida_seis.getMarcador_jugadores().getAlmacen().modificar_array(this.partida_seis.getMarcador_jugadores().getJugador1(), this.partida_seis.getMarcador_jugadores().getJugador2());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Marcador_puntuaciones_final.class.getName()).log(Level.SEVERE, null, ex);
        }

        Palabras_puntos_J1.setText(texto1.toString());
        Palabras_puntos_J2.setText(texto2.toString());

        //SACAR UN MARCADOR DE PARTIDA 5 , DONDE EN UN MARCADOR TIENE LOS JUGADORES CON EL CONTENIDO DE LOS JUGADORES
        this.partida_seis.getMarcador_jugadores().getJugador1().setNombreRivales(this.partida_seis.getMarcador_jugadores()); //JUGADOR 1
        this.partida_seis.getMarcador_jugadores().getJugador2().setNombreRivales(this.partida_seis.getMarcador_jugadores()); //JUGADOR 2

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreJ1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreJ2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Palabras_puntos_J1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Palabras_puntos_J2 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FINAL DE LA PARTIDA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Tabla de puntuaciones:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");

        nombreJ1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombreJ1.setForeground(new java.awt.Color(0, 0, 0));
        nombreJ1.setText("Aquí ira el nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");

        nombreJ2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombreJ2.setForeground(new java.awt.Color(0, 0, 0));
        nombreJ2.setText("Aquí ira el nombre");

        Palabras_puntos_J1.setColumns(20);
        Palabras_puntos_J1.setRows(5);
        jScrollPane1.setViewportView(Palabras_puntos_J1);

        Palabras_puntos_J2.setColumns(20);
        Palabras_puntos_J2.setRows(5);
        jScrollPane2.setViewportView(Palabras_puntos_J2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Palabras_puntos_J1;
    private javax.swing.JTextArea Palabras_puntos_J2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombreJ1;
    private javax.swing.JLabel nombreJ2;
    // End of variables declaration//GEN-END:variables
}
