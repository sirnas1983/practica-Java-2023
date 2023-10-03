package trabajoPracticoUno.Maestro;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        final double GRAVEDAD = 9.8;
        double velInicial, tiempo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese velocidad incial en m/s:");
        velInicial = scanner.nextDouble();

        System.out.println("Ingrese tiempo en segundos:");
        tiempo = scanner.nextDouble();
        
        System.out.println(String.format(
            "La velocidad final del objeto transcurridos %.2f segundos es: %.2fm/s",
            tiempo,
            velInicial + tiempo * GRAVEDAD));

    }
}
