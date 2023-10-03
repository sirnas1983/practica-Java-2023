package trabajoPracticoUno.Iniciado;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de una mascota:");
        String mascota = scanner.nextLine();
        System.out.println("Ingrese el nombre de una pelicula:");
        String pelicula = scanner.nextLine();
        scanner.close();
        System.out.println(String.format("Nombre de la próxima bebida:  %s %s", mascota, pelicula));
    }
}
