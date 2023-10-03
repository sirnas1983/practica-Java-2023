package trabajoPracticoUno.Maestro;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la masa del objeto (kg): ");
        int masa = scanner.nextInt();

        System.out.println("Ingrese la velocidad inicial del mismo (m/s): ");
        int velocidad = scanner.nextInt();

        System.out.println(
            String.format("La energia cinetica de un objeto de masa %dkg con una velocidad de %dm/s es %.2fJ",
            masa,
            velocidad,
            masa/2 * Math.pow(velocidad,2)
            ));

    }
}
