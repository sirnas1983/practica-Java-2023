package trabajoPracticoPOO.Caballero.Bilbioteca;

import java.time.Year;

public class Autor {

    private String nombre;
    private Year anioNacimiento;

    public Autor() {
    }

    public Autor(String nombre, Year anioNacimiento) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Year getAnioNacimiento() {
        return this.anioNacimiento;
    }

    public void setAnioNacimiento(Year anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }      
    
}
