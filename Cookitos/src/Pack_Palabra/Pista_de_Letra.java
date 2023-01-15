/**
 *
 * @author sohaib
 */
package Pack_Palabra;

import java.util.ArrayList;

public class Pista_de_Letra {

    private Almacen_de_palabra palPista; //es el objeto de la cual sacamos la palabra de la pista 
    private char[] converStringToChar; // es para convertir /dividir el string en char
    private int numRandom; // es la posicion de la palabra que sera la pista
    private char letraPista;

    public Pista_de_Letra() {
        this.palPista = new Almacen_de_palabra();
    }
    //METODO DONDE se comprueba si se da una letra en caso afirmativo se da la letra
    public void regalar_letra(String palabra_original) {  //estos parametros son necesarios para ver de que palabras sacar la pista
       if(palPista.confirmacionPista()==true){ //si la pista es afirmativa se devuelve un char
           
        //VARIABLE ARRAY CHAR , coger el array de palabras de uno de los jugadores y de ese array sacar una palabra y convertirlo en un array de char, para luego poder coger una letra aleatoria.
        this.converStringToChar = palabra_original.toCharArray();
        this.numRandom = (int) (Math.random() * this.converStringToChar.length); // genero un numero aleatorio para soltar un caracter aleatorio de la palabra (rango [0-char[].size()] 
         this.letraRandom(); //lo que hace es devolver una letra aleatoria de la palabra
       }
    }
     
    public char letraRandom(){
        this.letraPista=this.converStringToChar[this.numRandom];
    return this.letraPista; //DEVUELVE UN CARACTER ALEATORIO DE LA PALABRA ;
    }
    public int getPosicion_en_Palabra(){
        return this.numRandom;
    }
    
}
