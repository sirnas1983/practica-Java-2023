package trabajoPracticoPOO.Padawan;
import java.util.ArrayList;

public class Estudiante {

    String nombre;
    Long id;
    ArrayList<Calificacion> calificaciones;
    
    static private long autoIncrementalId = 0;

    public Estudiante(String nombre){
        this.nombre = nombre;
        this.id = getNumeroId();
        this.calificaciones = new ArrayList<>();
    }

    //metodo para devolver un numero autoincremental como id
    static public long getNumeroId(){
        ++ autoIncrementalId;
        return autoIncrementalId;
    }
    
    //metodo para imprimir el prom. de calificaciones
    public float promedioCalificaciones(){
        float sum = 0;
        if (this.calificaciones.size() == 0){
            System.out.println("El estudiante no posee calificaciones");
            return 0f;
        } else {
        for (Calificacion calificacion : this.calificaciones){
            sum += calificacion.calificacion;
        }
        return sum/this.calificaciones.size();
        }
    }

    //metodo para imprimir por pantalla la informacion de la instancia que llama el metodo
    public void verEstudiante(){
        System.out.println("-".repeat(25));
        System.out.println("ID " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Promedio: " + this.promedioCalificaciones());
        System.out.println("-".repeat(25));
    }
        
    public void agregarCalificacion(Calificacion calificacion){
        this.calificaciones.add(calificacion);
    }
}