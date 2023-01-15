package Pack_Jugador;

import Pack_Partida.Marcador;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author sohaib, Jose, Laura
 */
public class Jugador implements Serializable {

    private String nombre;
    private String contrasena;
    private ArrayList<Marcador> NombreRivales = new ArrayList<Marcador>();
    private int puntos;
    private int partidasGanadas, partidasPerdidas, partidasEmpatadas;

    //CONSTRUCTORES
    public Jugador(String nom, String pass) { 
        this.nombre = nom;
        this.contrasena = pass;
    }

    public Jugador(String nom) {
        this.nombre = nom;
    }

    //GET y SET
    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String[] getJugador() {
        String[] temp = {this.nombre, this.contrasena};
        return (temp);
    }

    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public int getPartidasEmpatadas() {
        return partidasEmpatadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas += partidasGanadas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas += partidasPerdidas;
    }

    public void setPartidasEmpatadas(int partidasEmpatadas) {
        this.partidasEmpatadas += partidasEmpatadas;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", contrasena=" + contrasena + ", NombreRivales=" + NombreRivales + ", puntos=" + puntos + ", partidasGanadas=" + partidasGanadas + ", partidasPerdidas=" + partidasPerdidas + ", partidasEmpatadas=" + partidasEmpatadas + '}';
    }

   

    //ACTULIZAR VALORES, COPIANDO EL RESULTADO EN UN JUGADOR PARA METERLO AL FICHERO
    public void setActualizarValores(int partidasGanadas, int partidasPerdidas, int partidasEmpatadas, int puntos) {
        
        this.partidasEmpatadas = partidasEmpatadas;
        this.partidasGanadas = partidasGanadas;
        this.partidasPerdidas = partidasPerdidas;
        this.puntos = puntos;
    }

    public void setNombreRivales(Marcador marcaJugador) {
        this.NombreRivales.add(marcaJugador);
    }

    public Marcador getNombreRivales(int i) {

        return NombreRivales.get(i);
    }
    public ArrayList<Marcador> getArray(){
        return this.NombreRivales;
    }

    public int getTamArray() {
        return this.NombreRivales.size();
    }

}
