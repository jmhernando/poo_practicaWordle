package Pack_Palabra;

import Interfaz.*; // por si acaso
import java.io.*; // para usar serializable
import java.util.*; //no se para que lo he puesto
/*
 * @author sohaib
 */
public class Palabra extends Almacen_de_palabra implements Serializable {

    private int numArray; //tamaño del arraylist
    private boolean regalo_de_letra; // comprobar si se va a dar la pista o no

    //ARRAYS QUE USAREMOS PARA LAS PALABRAS
    private ArrayList<String> palabras_CincoLetras = new ArrayList<String>(); //arraylist de cinco
    private ArrayList<String> palabras_SeisLetras = new ArrayList<String>(); //arraylist de seis

    //ARRAY QUE USAMOS PARA GUARDAR LOS NÚMEROS DEL ÍNDICE QUE USAMOS.
    private int[] indices_usados_jugador1;
    private int[] indices_usados_jugador2;

    private Almacen_de_palabra almacen = new Almacen_de_palabra(); // carga el fichero para sacar informacion de ella
    private int[] palabra_enviar;
    private int numRandom; // es la posicion del arraylist que sera la palabra entera
    private int indice; // elige de que array sacar palabras
    private String palabra_original; //es la palabra aleatoria que se saca cuando se quiera
//    private ArrayList<String> recoger_usadas; //meter las palabras que se vayan usando para que no se repitan al sacarlas de forma aleatoria

    //INICIALIZACION DE ATRIBUTOS-------------------------------------------------------
    public Palabra() {
        this.palabras_CincoLetras = almacen.getPalabras_de_array(1); //LO QUE HAGO ES SACAR LAS PALABRAS DEL JUGADOR 1 Y GUARDARLAS EN OTRA VARIABLE
        this.palabras_SeisLetras = almacen.getPalabras_de_array(2); //LO QUE HAGO ES SACAR LAS PALABRAS DEL JUGADOR 2 Y GUARDARLAS EN OTRA VARIABLE
        this.numArray = almacen.getPalabras_de_array(1).size(); // guardamos el numero de palabras que tienen los arraylist, como ambos van a TENER EL MISMO TAMANIO DA IGUAL QUE JUGADOR COJA 
        this.indices_usados_jugador1 = new int[numArray];
        this.indices_usados_jugador2 = new int[numArray];

        for (int i = 0; i < numArray; i++) {
            this.indices_usados_jugador1[i] = -1;
            this.indices_usados_jugador2[i] = -1;
        }
//        this.palabra_original = this.sacar_palabra_aleatoria();
//        this.recoger_usadas = new ArrayList<>();

    }                                               //NOTA: LO DE QUE SEA EL JUGADOR 1 O 2 PARA EL NUMPALABRAS ES INDIFERENTE

    //-----------------------------------METODOS DE LA CLASE------------------------------------------------------------------
    //METODO GET NUMERO DE ELEMENTOS
    //METODO COMPROBAR COLOCADAS
    public boolean comprobar_colocadas(int posicion, String palabra_introducida, int turno) {
        //System.out.println(palabra_introducida);

        if (palabra_original.equals(palabra_introducida)) {
            System.out.println("Son iguales");
//            almacen.borrar_palabras_array(indiceRandom, numRandom);
//            almacen.borrar_palabras_array(indiceRandom, numRandom);

            //que se pongan todas en verde
            //que se termine la partida
            return true;
        } else {
            System.out.println("No son iguales");
            palabra_enviar = comprobar_distinta_posicion(posicion, palabra_introducida);
            return false;
        }

    }

    //METODO COMPROBAR Distinta posicion
    private int[] comprobar_distinta_posicion(int posicion, String palabra_introducida) {
        char[] array_palabra_original = palabra_original.toCharArray();
        int[] nuevo_array_letras = new int[palabra_introducida.length()];

        for (int ii = 0; ii < nuevo_array_letras.length; ii++) {
            nuevo_array_letras[ii] = 0;
        }
        //if(palabra_original.contains(palabra_introducida)){
        for (int i = 0; i < palabra_introducida.length(); i++) {
            for (int j = 0; j < palabra_introducida.length(); j++) {
                if (array_palabra_original[i] == palabra_introducida.charAt(j)) {
                    if (i == j) {
                        nuevo_array_letras[j] = 1;
                    } else {
                        if (nuevo_array_letras[j] != 1) {
                            nuevo_array_letras[j] = 2;
                        }
                    }
                }
            }
        }
        return nuevo_array_letras; // devuelve verdadero y se pone amarillo en la posicion
    }

    public int[] getArrayPalabra() {
        return palabra_enviar;
    }

    //METODO MOSTRAR INTENTO RESUELTO
    public String intento_resuelto() {
        //devolver el numero del intento y la palabra del intento
        return "El intento número" + "nºintento" + "nombre palabra";
    }

    //METODO PUNTOS_OBTENIDOS
    public int puntos_Obtenidos() {

        return 0; //devuelve los puntos obtenidos
    }

    //METODO QUE GENERA PALABRAS ALEATORIAS DEL FICHERO DE CONFIGURACION
    public String sacar_palabra_aleatoria(int turno) {
        boolean colocada_j1 = false;
        boolean colocada_j2 = false;
        boolean num_encontrado = false;
        this.numRandom = (int) (Math.random() * this.numArray); //cojo una palabra aleatoria en ese rango [0-arraylist.size[])

        for (int j = 0; j < numArray; j++) {
            if (turno == 0) {
                if (this.indices_usados_jugador1[j] == this.numRandom) {
                    num_encontrado = true;
                }
            } else {
                if (this.indices_usados_jugador2[j] == this.numRandom) {
                    num_encontrado = true;
                }
            }
        }
        while (num_encontrado) {
            num_encontrado = false;
            this.numRandom = (int) (Math.random() * this.numArray);
            for (int j = 0; j < numArray; j++) {
                if (turno == 0) {
                    if (this.indices_usados_jugador1[j] == this.numRandom) {
                        num_encontrado = true;
                    }
                } else {
                    if (this.indices_usados_jugador2[j] == this.numRandom) {
                        num_encontrado = true;
                    }
                }
            }
        }
        if (!num_encontrado) {
            for (int i = 0; i < numArray; i++) {
                if (turno == 0) {
                    if (this.indices_usados_jugador1[i] == -1 && !colocada_j1) {
                        this.palabra_original = almacen.getPalabras_de_array(indice).get(this.numRandom); //elijo una palabra aleatorio  de una arraylist
                        this.indices_usados_jugador1[i] = numRandom;
                        colocada_j1 = true;
                    }
                } else {
                    if (this.indices_usados_jugador2[i] == -1 && !colocada_j2) {
                        this.palabra_original = almacen.getPalabras_de_array(indice).get(this.numRandom); //elijo una palabra aleatorio  de una arraylist
                        this.indices_usados_jugador2[i] = numRandom;
                        colocada_j2 = true;
                    }
                }
            }
        }
        return this.palabra_original; //devuelve una palabra aleatoria del fichero
    }

//    public boolean array_palabras_vacio(int cinco_seis) {
//        boolean vacio;
//        if (cinco_seis == 0) {
//            if (this.almacen.get_longitud_cinco() == 0) {
//                vacio = true;
//            } else {
//                vacio = false;
//            }
//        } else {
//            if (this.almacen.get_longitud_seis() == 0) {
//                vacio = true;
//            } else {
//                vacio = false;
//            }
//        }
//        return vacio;
//    }
    //METODO GET PALABRA RANDOM (MUESTRA LA PALABRA)
    public String getPalabraRandom() {
        return this.palabra_original; //para no tener que sacar todo el rato palabras random si no poder reutilizar una palabra muchas veces
    }

    public int getnumArray() {
        return this.numArray;
    }

    //METODO PARA ASIGNAR LA PALABRA ALEATORIA ESTA ES LA QUE SE USARA FRECUENTEMENTE
    public void setPalabra(int indice, int turno) {
        this.indice = indice;
        this.palabra_original = this.sacar_palabra_aleatoria(turno);
    }
}
