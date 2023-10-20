package trabajoPracticoPOO.Caballero;

import java.util.Scanner;

/*
3. Libros de biblioteca. Simula un sistema de registro de libros en una biblioteca
utilizando un HashMap. Crea clases como Libro, Autor y Biblioteca. Los libros
pueden tener autores y se almacenan en el HashMap junto con su disponibilidad.
Una biblioteca puede tener N libros.
a. La aplicación debe permitir:
i. Buscar libros por título o autor
ii. Registrar libros.
b. Crear el diagrama de clases del escenario.
 */
public class MainBiblioteca {

    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        Scanner scan = new Scanner(System.in);

        String x = "";

        do{
            System.out.println("Ingrese una opcion: ");
            System.out.println("1 - Registrar Libro");
            System.out.println("2 - Buscar por Autor");
            System.out.println("3 - Buscar por Titulo");
            System.out.println("Cualquier otra opcion para salir");
            String opcion = scan.nextLine();
            switch (opcion){
                case "1":
                    System.out.println("Ingrese titulo: ");
                    String titulo = scan.nextLine();
                    System.out.println("Ingrese genero: ");
                    String genero = scan.nextLine();
                    System.out.println("Ingrese disponibilidad: 1 para si, 0 para no");
                    String disponible = scan.nextLine();
                    Boolean isDisponible;
                    if (disponible == "1"){
                        isDisponible = true;
                    } else {
                        isDisponible = false;
                    }
                    Libro libro = new Libro(titulo, genero, isDisponible);
                    biblioteca.agregarLibro(libro);
                    break;
                case "2":

                    break;
                case "3":

                    break;
                default:
                    x = "exit";
            }

        } while( x != "exit");
        scan.close();
    }
    
}
