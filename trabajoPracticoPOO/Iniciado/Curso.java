package trabajoPracticoPOO.Iniciado;

import java.util.ArrayList;

public class Curso {
    
    String nombre;
    Boolean habilitado;
    String descripcion;
    ArrayList<Alumno> alumnos;

    public Curso(String nombre, Boolean habilitado, String descripcion){
        this.nombre = nombre;
        this.habilitado = habilitado;
        this.descripcion = descripcion;
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumnos(Alumno alumno){
        this.alumnos.add(alumno);
    }
}
