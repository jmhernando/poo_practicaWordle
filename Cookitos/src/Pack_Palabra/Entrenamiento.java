
package Pack_Palabra;

public class Entrenamiento {
    private int puntos;
    private boolean regalo_de_palabra;

    public Entrenamiento(int puntos, boolean regalo_de_palabra) {
        this.puntos = puntos;
        this.regalo_de_palabra = regalo_de_palabra;
    }
    
    //MOSTRAR PUNTOS DE LA PARTIDA
    public int mostrar_puntos(){
    
    return this.puntos;
    }
    
    //
    public boolean usar_Pista_de_Palabra(){
    
    return false;
    }
    
    
    
}
