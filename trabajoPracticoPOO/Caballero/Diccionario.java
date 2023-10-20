package trabajoPracticoPOO.Caballero;

import java.util.HashMap;

public class Diccionario {
    
    String nombre;
    HashMap<String, String> palabras;

    public Diccionario(String nombre){
        this.nombre = nombre;
        this.palabras = new HashMap<>();
    }

    public void agregarPalabra(Palabra palabra){
        this.palabras.put(palabra.palabra, palabra.definicion);
    }

    

}
