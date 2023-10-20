package trabajoPracticoPOO.Caballero;

import java.util.HashMap;

public class Biblioteca {

    HashMap<Libro, Boolean> libros;

    public Biblioteca(){
        this.libros = new HashMap<>();
    }

    public void agregarLibro(Libro libro){
        this.libros.put(libro, libro.isDisponible);
    }

    public void alquilarLibro(Libro libro){
        if (libro.isDisponible){
            libro.isDisponible = !libro.isDisponible;
        }
    }

    
}
