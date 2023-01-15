package Pack_Jugador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; 

/**
 *
 * @author sohaib, Jose, Laura
 */
public class Almacen_de_jugadores implements Serializable {

    // private String nombreFichero;
    private int contador_de_jugadores = 0;  //para asignar el numero de jugadores

    private ArrayList<Jugador> jugadorFichero = new ArrayList();

    //Constructores
//     public Almacen_de_jugadores(){
//        this.nombreFichero="JugadoresBinario.txt";//Nombre del objeto
//    }
    //Fichero escribir
    public void serializar() throws ClassNotFoundException {
        try {
            //FileWriter fw = new FileWriter("JugadoresBinario.txt", true); //poniendo apend a true hacemos que no se sobreescriba el fichero
            ObjectOutputStream entrada = new ObjectOutputStream(new FileOutputStream("JugadoresBinario.txt"));

            entrada.writeObject(this.jugadorFichero);
            entrada.close();
            System.out.println("Guardado correctamente");
        } catch (IOException e) {
            System.out.println("Error de escritura");
        }
    }

    //Fichero leer
    public void deserializar() throws ClassNotFoundException {
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("JugadoresBinario.txt"));

            ArrayList<Jugador> objetoLeido = (ArrayList<Jugador>) entrada.readObject();
            jugadorFichero = objetoLeido;
            System.out.println(objetoLeido);
            entrada.close();

            // System.out.println(objetoLeido.getNombre());
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }

    //Dar de alta a un jugador
    public void alta(Jugador j) throws ClassNotFoundException {
        if (autenticar(j.getNombre(), j.getContrasena()) != null) {
            System.out.println("Ya existe el usuario");
        } else {
            jugadorFichero.add(j); //Si el usuario no existe, se añadirá al ArrayList de jugadores /probar
            contador_de_jugadores++;
            System.out.println("Jugador añadido");
            System.out.println(j);

        }
    }

    //Dar de baja a un jugador
    //Dar de baja a un jugador
    public boolean baja(String nombre) throws ClassNotFoundException {
        boolean borrado;
        if (autenticar2(nombre) != null) {
            jugadorFichero.remove(this.autenticar2(nombre));
            contador_de_jugadores--;
            borrado = true;
            System.out.println("Jugador borrado: ");
        } else {
            borrado = false;
            System.out.println("Error: No existe el usuario, por lo que no se puede eliminar");
        }
        return borrado;
    }

    //Para buscar al jugador
    public Jugador autenticar(String nombre, String clave) throws ClassNotFoundException {
        Jugador j = null;
        for (int i = 0; i < this.jugadorFichero.size(); i++) {
            if (this.jugadorFichero.get(i).getJugador()[1].equals(clave) && this.jugadorFichero.get(i).getJugador()[0].equals(nombre)) {
                j = this.jugadorFichero.get(i);
            }
        }
        return (j);
    }

    //PUESTO POR SOHA
    public Jugador autenticar2(String nombre) throws ClassNotFoundException {
        Jugador j = null;
        for (int i = 0; i < this.jugadorFichero.size(); i++) {
            if (this.jugadorFichero.get(i).getJugador()[0].equals(nombre)) {
                j = this.jugadorFichero.get(i);
            }
        }
        return (j);
    }

    public void modificar_array(Jugador j1, Jugador j2) throws ClassNotFoundException {
        for (int i = 0; i < this.jugadorFichero.size(); i++) {
            if (this.jugadorFichero.get(i).getContrasena().equals(j1.getContrasena()) && this.jugadorFichero.get(i).getNombre().equals(j1.getNombre())) {
                this.jugadorFichero.get(i).setActualizarValores(j1.getPartidasGanadas(), j1.getPartidasPerdidas(), j1.getPartidasEmpatadas(), j1.getPuntos());

            }
            if (this.jugadorFichero.get(i).getContrasena().equals(j2.getContrasena()) && this.jugadorFichero.get(i).getNombre().equals(j2.getNombre())) {
                this.jugadorFichero.get(i).setActualizarValores(j2.getPartidasGanadas(), j2.getPartidasPerdidas(), j2.getPartidasEmpatadas(), j2.getPuntos());

            }
            this.serializar();
        }
    }

    public ArrayList<Jugador> ranking_ordenado_por_victorias() throws ClassNotFoundException {
        deserializar();
        ArrayList<Jugador> array = (ArrayList<Jugador>) jugadorFichero.clone();
        Collections.sort(array, new Comparar_Por_Partidas_Ganadas());

        for(Jugador temp: array){
//            System.out.println("Usuario: "+temp.getNombre()+"Partidas ganadas:"+temp.getPartidasGanadas());
            System.out.println(temp.getNombre());  
        }

        return (array);
    }
    

    private static class Comparar_Por_Partidas_Ganadas implements Comparator<Jugador> {

        @Override
        public int compare(Jugador j1, Jugador j2) {
        return Integer.compare(j2.getPartidasGanadas(), j1.getPartidasGanadas());
 
        }
    }

    public ArrayList<Jugador> ranking_ordenado_por_nombre() throws ClassNotFoundException {
        deserializar();
        ArrayList<Jugador> array = (ArrayList<Jugador>) jugadorFichero.clone();
        Collections.sort(array, new comparar_por_nombre() );

        for(Jugador temp: array){
            System.out.println(temp.getNombre());
        }

        return (array);
    }

    private static class comparar_por_nombre implements Comparator<Jugador> {

        @Override
        public int compare(Jugador j1, Jugador j2) {
           return j1.getNombre().compareTo(j2.getNombre());
        }
    }
}
