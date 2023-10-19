package trabajoPracticoPOO.Padawan;

public class Main {
    public static void main(String[] args) {
        Tarea tarea1 = new Tarea("Futbol", "Partido de futbol liga de veteranos", "2023-11-01");
        Tarea tarea2 = new Tarea("Clases", "Inicio clases Java", "2023-10-01");
        Tarea tarea3 = new Tarea("Jardin", "Buscar a la Bendi del Maternal", "2024-02-01");
    
        Tarea.agregarTarea(tarea1);
        Tarea.agregarTarea(tarea2);
        Tarea.agregarTarea(tarea3);

        Tarea.listarTareas();
    }

}