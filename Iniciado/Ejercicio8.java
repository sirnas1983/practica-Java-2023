package Iniciado;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        System.out.println(String.format("Mi nombre es %s", nombre));
        System.out.println(String.format("Mi edad es %d", edad));
    }
}
