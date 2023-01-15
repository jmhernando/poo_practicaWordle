package Pack_Palabra;

import java.io.*;
import java.util.ArrayList;
import Pack_Config.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Almacen_de_palabra implements Serializable {

    private Almacen_Configuracion infoConfig = new Almacen_Configuracion(); //VARIBLE DE TIPO CONFIGURACION PARA SACAR LOS DATOS Y USAR LOS METODOS DE CONFIGURACION

//CONSTRUCTOR QUE CARGA EL FICHERO
    public Almacen_de_palabra() { //AL INICIAR ESTA CLASE SE CARGA EL FICHERO ENTERO
        try {
            //(SE CARGA EL FICHERO) ---------------> objeto de tipo Almacen de configuracion para sacar el contenido del fichero 
            //COMO EL FICHERO TIENE CONTANIDO DE TIPO ALMACEN DE CONFIGURACION HACEMOS UN CASTING PARA METERLO EN OTRO OBJETO Y SACARLO
            
            ObjectInputStream cargaFichero = new ObjectInputStream(new FileInputStream("Fichero_Configuracion.txt")); //para ver el contenido del fichero
            this.infoConfig = (Almacen_Configuracion) cargaFichero.readObject();      
            cargaFichero.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Almacen_de_palabra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //METODO QUE DEVUELVE PALABRAS
    public ArrayList<String> getPalabras_de_array(int tipoArray) { //devolver la cadena de palabras de cada arraylist
        if (tipoArray == 1) { // 1 PARA DEVOLVER ARRAYLIST DE 5 LETRAS, OTRO NUMERO PARA ARRAYLIST DE 6 LETRAS
            return this.infoConfig.getPalabras_CincoLetras(); //DEVUELVE LAS PALABRAS DEL 5 LETRAS
        } else {
            return this.infoConfig.getPalabras_SeisLetras(); //DEVUELVE LAS PALABRAS DE 6 LETRAS
        }
    }
//    public void borrar_palabras_array(int tipoArray,int indice_palabra) { //devolver la cadena de palabras de cada arraylist
//        if (tipoArray == 1) { // 1 PARA DEVOLVER ARRAYLIST DE 5 LETRAS, OTRO NUMERO PARA ARRAYLIST DE 6 LETRAS
//            this.infoConfig.borrar_palabras_cincoletras(indice_palabra);
//        } else {
//            this.infoConfig.getPalabras_SeisLetras(); //DEVUELVE LAS PALABRAS DE 6 LETRAS
//        }
//    }
//    public int get_longitud_cinco(){
//        return this.infoConfig.get_longitud_array_cinco();
//    }
//    
//    public int get_longitud_seis(){
//        return this.infoConfig.get_longitud_array_seis();
//    }
    //METODO QUE DEVUELVE LA CONFIRMACION SI SE ENVIA PISTA O NO 
    public boolean confirmacionPista() {
        return "SI".equals(this.infoConfig.getPista()); //devuelve true si esto es cierto, es decir TRANSFORMA EL SI EN TRUE, NO EN FALSE
    }

}
