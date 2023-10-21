package trabajoPracticoPOO.Caballero.Bilbioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private HashMap<Libro, Boolean> libros;

    public Biblioteca() {
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new HashMap<>();
    }

    public HashMap<Libro,Boolean> getLibros() {
        return this.libros;
    }

    public void setLibros(HashMap<Libro,Boolean> libros) {
        this.libros = libros;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarLibro(Libro libro){
        this.libros.put(libro, libro.getDisponible());
    }

    public List<Libro> buscarPorAutor(Autor autor){
        List<Libro> resp = new ArrayList<>();
        this.libros.forEach((a, b) ->{
            if(a.getAutores().contains(autor)){
                resp.add(a);
            }
        });
        return resp;
    }

    public List<Libro> buscarPorTitulo(String titulo){
        List<Libro> resp = new ArrayList<>();
        this.libros.forEach((a, b) ->{
            if(a.getNombre().contains(titulo)){
                resp.add(a);
            }
        });
        return resp;
    }

    public List<Libro> buscarPorTituloExacto(String titulo){
        List<Libro> resp = new ArrayList<>();
        this.libros.forEach((a, b) ->{
            if(a.getNombre().equals(titulo)){
                resp.add(a);
            }
        });
        return resp;
    }
}
