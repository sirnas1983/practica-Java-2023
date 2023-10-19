package trabajoPracticoPOO.Iniciado;

import java.time.Period;
import java.time.LocalDate;

public class Alumno {
    
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    int edad;

    public Alumno(String nombre, String apellido, String fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
        this.edad = Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }
}
