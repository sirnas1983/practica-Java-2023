package trabajoPracticoPOO.Caballero.Bilbioteca;

import java.util.List;

public class Libro {

    private String nombre;
    private List<Autor> autores;
    private Boolean disponible;

    public Libro() {
    }

    public Libro(String nombre, List<Autor> autores, Boolean disponible) {
        this.nombre = nombre;
        this.autores = autores;
        this.disponible = disponible;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Autor> getAutores() {
        return this.autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public Boolean isDisponible() {
        return this.disponible;
    }

    public Boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}