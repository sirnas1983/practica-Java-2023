package trabajoPracticoPOO.Padawan;

import java.util.Locale;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Ingrese el nombre del establecimiento: ");
        String nombreEstablecimiento = scanner.nextLine();
        String x = "";
        String fechaNota;
        Estudiante estudiante;
        Double nota;
        String nombreAlumno;
        Establecimiento est = new Establecimiento(nombreEstablecimiento);
        System.out.println("Bienvenido al establecimiento " + est.nombre);

        do {
            System.out.println("-".repeat(25));
            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1 - Agregar estudiante");
            System.out.println("2 - Ver lista de estudiantes");
            System.out.println("3 - Calificar estudiante");
            System.out.println("Cualquier otro para salir");
            System.out.println("-".repeat(25));
            x = scanner.nextLine();
            switch (x){
                case "1":
                    System.out.println("Ingrese nombre de alumno a ingresar: ");
                    nombreAlumno = scanner.nextLine();
                    estudiante = new Estudiante(nombreAlumno);
                    est.agregarEstudiante(estudiante);
                    break;
                case "2":
                    System.out.println("-".repeat(25));
                    System.out.println("LISTA DE ESTUDIANTES");
                    est.mostrarEstudiantes();
                    break;
                case "3":
                    est.mostrarEstudiantes();
                    System.out.println("Ingrese ID de estudiante a calificar: ");
                    long idEstudiante = Long.parseLong(scanner.nextLine());
                    estudiante = null;
                    for(Estudiante i : est.estudiantes) {
                        if (i.id == idEstudiante){
                            estudiante = i;
                            break;
                        }
                    }
                    if (estudiante != null){
                        System.out.println("Ingrese la fecha en formato YYYY-MM-DD: ");
                        fechaNota = scanner.nextLine();
                        System.out.println("Ingrese la calificacion: ");
                        nota = Double.parseDouble(scanner.nextLine());
                        estudiante.agregarCalificacion(new Calificacion(nota, fechaNota));
                    }
                    break;
                default:
                    x = "exit";
                }
        }while(x != "");
        scanner.close();
    }
}
