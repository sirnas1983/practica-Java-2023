package trabajoPracticoPOO.Padawan;

import java.util.LinkedList;
import java.util.Scanner;

public class Contacto {

    String nombre;
    String telefono;
    String email;

    private static int counter;
    private static LinkedList<Contacto> listaContactos = new LinkedList<>();

    public Contacto(String nombre, String telefono, String email){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public static void agregarContacto(Contacto contacto){
        listaContactos.add(contacto);
    }

    public static void borrarContacto(Contacto contacto){
        listaContactos.remove(contacto);
    }

    private static void resetCounter(){
        counter = 0;
    }

    private static void count(){
        ++ counter;
    }

    public static void buscarContacto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre o parte de el para buscar en contactos:");
        String texto = scanner.nextLine();
        System.out.println("-".repeat(20));
        resetCounter();
        listaContactos.forEach((contacto) -> {
            if(contacto.nombre.toLowerCase().contains(texto.toLowerCase())){
                System.out.println(contacto.nombre);
                System.out.println(contacto.telefono);
                System.out.println(contacto.email);
                System.out.println("-".repeat(20));
                count();                
            }
        });
        if (counter == 0){
            System.out.println("No hay coincidencias que se ajusten a su busqueda");
        } else {
            System.out.println("Se encontraron " + counter + " coincidencias");
        }
        scanner.close();
    }

    public static void getContactos(){
        System.out.println("-".repeat(20));        
        System.out.println("LISTA DE CONTACTOS");
        System.out.println(listaContactos.size() + " CONTACTOS");
        System.out.println("-".repeat(20));        
        listaContactos.forEach((contacto) -> {
                System.out.println(contacto.nombre);
                System.out.println(contacto.telefono);
                System.out.println(contacto.email);
                System.out.println("-".repeat(20));        
            });
    }
}
