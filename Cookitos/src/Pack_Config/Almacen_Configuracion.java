package Pack_Config;

import java.io.*;
import java.util.ArrayList;

/**
 * * @author sohaib
 */
public class Almacen_Configuracion implements Serializable {

    private int letras_Cinco; // DEVUELVEN UN 5 
    private int letras_Seis; //DEVUELVEN UN 6
    private int numPalabras; //numero de palabras por partida
    private String pista; //si hay pista o no
    private ArrayList<String> palabras_CincoLetras; //las palabras que hay 
    private ArrayList<String> palabras_SeisLetras; //las palabras que hay 
  

    public Almacen_Configuracion() {
        this.palabras_CincoLetras = new ArrayList<String>();
        this.palabras_SeisLetras = new ArrayList<String>();
       
    }

    //CONSTRUCTOR COMPLETO 
    public Almacen_Configuracion(int letras1, int numPalabras, String pista, ArrayList palabras_jugador1, int letras2, ArrayList palabras_jugador2) {
        //INFORMACION QUE IRA DENTRO DEL FICHERO 
        this.letras_Cinco = letras1;
        this.letras_Seis = letras2;
        this.pista = pista;
        this.palabras_SeisLetras = new ArrayList<String>();
        this.palabras_CincoLetras = new ArrayList<String>();
       
        this.palabras_CincoLetras = palabras_jugador1;
        this.palabras_SeisLetras = palabras_jugador2;
        this.numPalabras = numPalabras;
    }

    //METODOS GET DE LAS VARIABLES
    public int getLetras_SeisLetras() {
        return letras_Seis;
    }

    //METODOS SET DE LAS VARIABLES
    public void setLetras_SeisLetras(int letras__SeisLetras) {
        this.letras_Seis = letras__SeisLetras;
    }

    //METODOS GET DE LAS VARIABLES
    public String getPista() {
        return pista;
    }

    //METODOS SET DE LAS VARIABLES
    public void setPista(String pista) {
        this.pista = pista;
    }

    //METODOS GET DE LAS VARIABLES
    public int getNumPalabras() {
        return numPalabras;
    }
    
    //METODOS SET DE LAS VARIABLES
    public void setNumPalabras(int numPalabras) {
        this.numPalabras = numPalabras;
    }

    //METODOS GET DE LAS VARIABLES
    public int getLetras_CincoLetras() {
        return letras_Cinco;
    }

    //METODOS SET DE LAS VARIABLES
    public void setLetras_CincoLetras(int letras_jugador1) {
        this.letras_Cinco = letras_jugador1;
    }

    //METODOS GET DE LAS VARIABLES
    public ArrayList<String> getPalabras_CincoLetras() {
        return palabras_CincoLetras;
    }

    //METODOS SET DE LAS VARIABLES
    public void setPalabras_CincoLetras(ArrayList<String> palabras_jugador1) {
        this.palabras_CincoLetras = palabras_jugador1;
    }
    
    //METODOS GET DE LAS VARIABLES
    public ArrayList<String> getPalabras_SeisLetras() {
        return palabras_SeisLetras;
    }

    //METODOS SET DE LAS VARIABLES
    public void setPalabras_SeisLetras(ArrayList<String> palabras_jugador2) {
        this.palabras_SeisLetras = palabras_jugador2;
    }

    //METODO toString DE LAS VARIABLES (este es importante)
    @Override
    public String toString() {
        return this.letras_Cinco + " " + this.numPalabras + " " + this.pista + "\n" + palabras_CincoLetras + "\n" + this.letras_Seis + "\n" + palabras_SeisLetras;
    }

}
