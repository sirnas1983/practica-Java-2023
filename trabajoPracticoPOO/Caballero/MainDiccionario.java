package trabajoPracticoPOO.Caballero;

import java.util.Scanner;

/*
Diccionario simple. Crea una aplicación de diccionario que almacene palabras y
sus definiciones utilizando un HashMap. Debes definir una clase Diccionario que
tenga un atributo nombre de diccionario y un atributo (De tipo Hashmap) palabras.
Se debe definir una clase Palabra que tenga una palabra y una definición, y luego
almacenar instancias de esta clase en el HashMap. La aplicación debe permitir
agregar, buscar y mostrar las definiciones de palabras.
 */
public class MainDiccionario {
    public static void main(String[] args) {
        
        String x = "";
        Scanner scanner = new Scanner(System.in);
        Diccionario espaniol = new Diccionario("Español");

        do{
            System.out.println("Ingrese una opcion: ");
            System.out.println("1 - Agregar palabra");
            System.out.println("2 - Buscar palabra");
            System.out.println("3 - Mostrar palabras");
            System.out.println("Cualquier otra opcion para salir");
            String opcion = scanner.nextLine();
            switch (opcion){
                case "1":
                    System.out.println("Ingrese palabra: ");
                    String palabra = scanner.nextLine();
                    System.out.println("Ingrese definicion: ");
                    String definicion = scanner.nextLine(); 
                    Palabra pal = new Palabra(palabra, definicion);
                    espaniol.agregarPalabra(pal);
                    break;
                case "2":
                    System.out.println("Ingrese palabra a buscar: ");
                    String palabraBuscar = scanner.nextLine();
                    if (espaniol.palabras.get(palabraBuscar) == null){
                        System.out.println("La palabra buscada no se encuentra");
                    } else {
                        System.out.println("Def. " + palabraBuscar + ": " + espaniol.palabras.get(palabraBuscar));
                    }
                    break;
                case "3":
                    System.out.println("-".repeat(25));
                    System.out.println("Diccionario " + espaniol.nombre);
                    System.out.println("-".repeat(25));
                    for(String i : espaniol.palabras.keySet()){
                        System.out.println(i + ": " + espaniol.palabras.get(i));
                    }
                    System.out.println("-".repeat(25));
                    break;
                default:
                    x = "exit";
            }

        } while( x != "exit");
        scanner.close();
    }
}
