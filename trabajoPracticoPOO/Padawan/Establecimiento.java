package trabajoPracticoPOO.Padawan;

import java.util.ArrayList;

public class Establecimiento {
    
    String nombre;

    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Establecimiento(String nombre){
        this.nombre = nombre;
    }

    public void mostrarEstudiantes(){
        estudiantes.forEach(est -> {
            est.verEstudiante();
        });
        System.out.println("-".repeat(25));
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante){
        estudiantes.remove(estudiante);
    }

}
