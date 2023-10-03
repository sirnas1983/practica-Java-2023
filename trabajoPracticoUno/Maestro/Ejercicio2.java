package trabajoPracticoUno.Maestro;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese temperatura en Celsius: ");
        int temp_celsius = scanner.nextInt();
        var temp_farenheit = (temp_celsius * 9/5) + 32;
        System.out.println(temp_celsius + "°C equivalen a " + temp_farenheit + "°F");

    }
    
}
