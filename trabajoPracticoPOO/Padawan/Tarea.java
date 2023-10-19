package trabajoPracticoPOO.Padawan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Tarea {

    private String titulo;
    private String descripcion;
    private LocalDate fechaVencimiento;
    private static ArrayList<Tarea> listaTareas = new ArrayList<>();

    public Tarea(String titulo, String descripcion, String fechaVencimiento){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaVencimiento = LocalDate.parse(fechaVencimiento);
    }

    public static void agregarTarea(Tarea tarea){
        listaTareas.add(tarea);
    }

    public static void borrarTarea(Tarea tarea){
        listaTareas.remove(tarea);
    }

    public static void listarTareas(){
        for(Tarea tarea : listaTareas){
            System.out.println("-".repeat(25));
            System.out.println(tarea.titulo);
            System.out.println(tarea.descripcion);
            long tiempo = ChronoUnit.DAYS.between(LocalDate.now(), tarea.fechaVencimiento);
            if (tiempo < 0){
                System.out.println("TAREA VENCIDA POR " + tiempo * -1 + " DIAS");
            } else {
            System.out.println("Dias para vencimiento: " + tiempo + " DIAS");
            }
        }
        System.out.println("-".repeat(25));

    }
}
