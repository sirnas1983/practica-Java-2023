package trabajoPracticoPOO.Caballero;

import java.util.Scanner;

public class Autor {
    
    String nombre;
    String apellido;
    int anioNacimiento;

    public Autor(String nombre, String apellido, int anioNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
    }

    public static Autor asignarAutor(){
        Scanner scan = new Scanner(System.in);
        AutorRepository.autores.forEach((nombreApellido, autor) ->{
            System.out.println(nombreApellido);
        });
        System.out.println("Si el autor esta en la lista ingrese nombreApellido, sino presione ENTER");
        String nombreApellido = scan.nextLine();
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
