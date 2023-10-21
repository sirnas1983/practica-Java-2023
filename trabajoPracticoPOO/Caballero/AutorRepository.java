package trabajoPracticoPOO.Caballero;

import java.util.HashMap;
import java.util.Scanner;

public class AutorRepository {
    
    static public HashMap<String, Autor> autores = new HashMap<>();

    public static void agregarAutor(Autor autor){
        autores.put(autor.nombre+autor.apellido, autor);
    }

    public static Autor asignarAutor(){
        Scanner scan = new Scanner(System.in);
        String nombreApellido;
        if (autores != null){
            autores.forEach((nomAp, autor) ->{
                System.out.println(nomAp);
            });
            System.out.println("Si el autor esta en la lista ingrese nombreApellido, sino presione ENTER");
            nombreApellido = scan.nextLine();
        } else {
            nombreApellido ="";
        }
        if (nombreApellido.equals("")){
            System.out.println("Ingrese nombre del Autor:");
            String nombre = scan.nextLine();
            System.out.println("Ingrese nombre del Autor:");
            String apellido = scan.nextLine();
            System.out.println("Ingrese nombre del Autor:");
            int anioNacimiento = Integer.parseInt(scan.nextLine());
            Autor nuevoAutor = new Autor(nombre, apellido, anioNacimiento);
            AutorRepository.agregarAutor(nuevoAutor);
            return nuevoAutor;
        } else {
            return AutorRepository.autores.get(nombreApellido);
        }
    }

    
}
