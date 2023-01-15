package Pack_Partida;

import Pack_Jugador.Almacen_de_jugadores;
import Pack_Jugador.Jugador;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Jose Manuel
 */
public class Marcador {

    private Jugador j1,j2;
    
    private String nombre_j1;                      //CONSERVAR
    private String nombre_j2;                      //CONSERVAR

    private int puntos_j1;                      //CONSERVAR
    private int puntos_j2;                      //CONSERVAR

    private int ronda_j1;
    private int ronda_j2;

    private boolean ganaJ1;                         //CONSERVAR
    private boolean ganaJ2;                         //CONSERVAR
    private boolean empate;                         //CONSERVAR

    private int turno;
    private Almacen_de_jugadores almacenjug;
    
    private boolean cambio_j1 = false;
    private boolean cambio_j2 = false;

    private boolean pediste_ayuda_palabra_j1;
    private boolean pediste_ayuda_palabra_j2;

    //AQUÍ SE GUARDAN LOS PUNTOS (ESTO SE GUARDA EN EL HISTORIAL)
    private ArrayList<Integer> puntos_palabra1 = new ArrayList<Integer>(); // Create an ArrayList object
    private ArrayList<Integer> puntos_palabra2 = new ArrayList<Integer>();
    //AQUÍ SE ALMACENAN LAS PISTAS QUE SE USARON
    private ArrayList<Integer> restar_puntos_palabra1 = new ArrayList<Integer>(); // Create an ArrayList object
    private ArrayList<Integer> restar_puntos_palabra2 = new ArrayList<Integer>();

    //TODAS LAS PALABRAS QUE SALGAN EN EL JUEGO SE VAN A GUARDAR EN ESTE ARRAY
    private ArrayList<String> palabra_marcador1 = new ArrayList<String>();
    private ArrayList<String> palabra_marcador2 = new ArrayList<String>();

    private ArrayList<String> palabra_pista1 = new ArrayList<String>();
    private ArrayList<String> palabra_pista2 = new ArrayList<String>();

    public Marcador() {
        this.puntos_j1 = 0;
        this.puntos_j2 = 0;
        this.ronda_j1 = 0;
        this.ronda_j2 = 0;

//        this.nombre_j1 = "jose";
//        this.nombre_j2 = "laura";

        this.turno = 0;
        this.pediste_ayuda_palabra_j1 = false;
        this.pediste_ayuda_palabra_j2 = false;
    }

    public int getPuntosJ1() {
        return this.puntos_j1;
    }

    public int getPuntosJ2() {
        return this.puntos_j2;
    }

    public int getRondaJ1() {
        return this.ronda_j1;
    }

    public int getRondaJ2() {
        return this.ronda_j2;
    }

    public int getTurno() {
        return this.turno;
    }

    public void setPuntos_j1(int puntos_j1) {
        this.puntos_j1 += puntos_j1;
    }

    public void setPuntos_j2(int puntos_j2) {
        this.puntos_j2 += puntos_j2;
    }

    public void setRonda_j1(int ronda_j1) {
        this.ronda_j1 += ronda_j1;
    }

    public void setRonda_j2(int ronda_j2) {
        this.ronda_j2 += ronda_j2;
    }

    public void set_cambio_j1() {
        this.cambio_j1 = true;
    }

    public void set_cambio_j2() {
        this.cambio_j2 = true;
    }

    public boolean get_Cambio_j1() {
        return this.cambio_j1;
    }

    public boolean get_Cambio_j2() {
        return this.cambio_j2;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public boolean get_pedir_ayuda_p_j1() {
        return this.pediste_ayuda_palabra_j1;
    }

    public boolean get_pedir_ayuda_p_j2() {
        return this.pediste_ayuda_palabra_j2;
    }

    public void set_pedir_ayuda_palabra_j1() {
        this.pediste_ayuda_palabra_j1 = true;
    }

    public void set_pedir_ayuda_palabra_j2() {
        this.pediste_ayuda_palabra_j2 = true;
    }

    public void set_añadir_puntos_palabra(int puntuacion) {
        if (this.turno == 0) {
            this.puntos_palabra1.add(puntuacion);
        } else {
            this.puntos_palabra2.add(puntuacion);
        }
    }

    public void set_restar_puntos_palabra(int puntuacion) {
        if (this.turno == 0) {
            this.restar_puntos_palabra1.add(puntuacion);
        } else {
            this.restar_puntos_palabra2.add(puntuacion);
        }
    }

    public void set_añadir_palabra(String palabra) {
        if (this.turno == 0) {
            this.palabra_marcador1.add(palabra);
        } else {
            this.palabra_marcador2.add(palabra);
        }
    }

    public void set_añadir_palabra_pistas(String palabra) {
        if (this.turno == 0) {
            this.palabra_pista1.add(palabra);
        } else {
            this.palabra_pista2.add(palabra);
        }
    }

    public ArrayList<Integer> getArray_puntos1() {
        return this.puntos_palabra1;
    }

    public ArrayList<Integer> getArray_puntos2() {
        return this.puntos_palabra2;
    }

    public ArrayList<Integer> getArray_restar_puntos1() {
        return this.restar_puntos_palabra1;
    }

    public ArrayList<Integer> getArray_restar_puntos2() {
        return this.restar_puntos_palabra2;
    }

    public ArrayList<String> getArray_palabras1() {
        return this.palabra_marcador1;
    }

    public ArrayList<String> getArray_palabras2() {
        return this.palabra_marcador2;
    }

    public ArrayList<String> getArray_palabrasPistas2() {
        return this.palabra_pista2;
    }

    public ArrayList<String> getArray_palabrasPistas1() {
        return this.palabra_pista1;
    }

    public String get_nombre_j1() {
        return this.nombre_j1;
    }

    public String get_nombre_j2() {
        return this.nombre_j2;
    }

    public void set_nombre_j1(String nombre) {
        this.nombre_j1 = nombre;
    }

    public void set_nombre_j2(String nombre) {
        this.nombre_j2 = nombre;
    }

    public void ganadorJuego() {
        if (this.puntos_j1 == this.puntos_j2) {
            this.empate = true;
        } else if (this.puntos_j1 > this.puntos_j2) {
            this.ganaJ1 = true;
        } else {
            this.ganaJ2 = true;
        }
    }

    public boolean getGanaJ1() {
        return this.ganaJ1;
    }

    public boolean getGanaJ2() {
        return this.ganaJ2;
    }

    public boolean getempate() {
        return this.empate;
    }
    public void setNombrej1(String nombre){
        this.nombre_j1 = nombre;
    }
    public void setNombrej2(String nombre){
        this.nombre_j2 = nombre;
    }
    
    public void setJugadorObjeto(Jugador jugador1,Jugador jugador2){
        this.j1 = jugador1;
        this.j2 = jugador2;
    }
    
    public void guardarResultados(){
        
        this.j1.setPuntos(this.puntos_j1);
        this.j2.setPuntos(this.puntos_j2);
        
        if(this.ganaJ1){
            this.j1.setPartidasGanadas(1);
            this.j2.setPartidasPerdidas(1);
        }
        else if(this.ganaJ2){
            this.j1.setPartidasPerdidas(1);
            this.j2.setPartidasGanadas(1);
        }
        else{
            this.j1.setPartidasEmpatadas(1);
            this.j2.setPartidasEmpatadas(1);
        }   
    }
    
    public void setAlmacenJugadores(Almacen_de_jugadores almacenjug){
        this.almacenjug = almacenjug;
    }
    
    public Almacen_de_jugadores getAlmacen(){
        return this.almacenjug;
    }    
    
    public Jugador getJugador1(){
        return this.j1;
    }
    public Jugador getJugador2(){
        return this.j2;
    }
}
