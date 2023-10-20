package trabajoPracticoPOO.Padawan;
/*
Aplicación de estudiantes y calificaciones. 
Define una clase Estudiante con atributos como nombre, número de identificación y calificaciones. 
Cree una clase calificaciones y para cada estudiante cree un par de calificaciones, cada calificación 
tiene atributos como calificación (1 al 10) y fecha de creación. Utiliza un ArrayList para almacenar 
las calificaciones y los estudiantes. a. La aplicación debe permitir : i. Agregar estudiantes 
junto con sus calificaciones ii. Calcular promedios de calificaciones iii. 
Mostrar por pantalla identificación, nombre del estudiante y promedio de calificaciones 
*/
public class MainEstudiante {
    public static void main(String[] args) {
        
        Estudiante darian = new Estudiante("Darian");
        Estudiante.agregarEstudiante(darian);
        Estudiante pedro = new Estudiante("Pedro");
        Estudiante.agregarEstudiante(pedro);
        Estudiante carlos = new Estudiante("Carlos");
        Estudiante.agregarEstudiante(carlos);

        Calificacion uno = new Calificacion(8.32f, "2023-10-19");
        Calificacion dos = new Calificacion(5.91f,"2023-10-17");
        Calificacion tres = new Calificacion(7.51f,"2023-10-17");
        Calificacion cuatro = new Calificacion(6.01f,"2023-10-17");

        darian.agregarCalificacion(cuatro);
        darian.agregarCalificacion(tres);
        carlos.agregarCalificacion(uno);
        carlos.agregarCalificacion(uno);
        pedro.agregarCalificacion(dos);

        Estudiante.mostrarEstudiantes();


        System.out.println(carlos.promedioCalificaciones());
        System.out.println(pedro.promedioCalificaciones());

        darian.verEstudiante();
    }
}
