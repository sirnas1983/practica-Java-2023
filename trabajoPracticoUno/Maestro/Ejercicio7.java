package trabajoPracticoUno.Maestro;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        double masa, velAng, radio;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese masa del objeto (kg):");
        masa = scanner.nextDouble();

        System.out.println("Ingrese radio de giro (m):");
        radio = scanner.nextDouble();
        
        System.out.println("Ingrese velocidad angular (m/s):");
        velAng = scanner.nextDouble();

        System.out.println("La fuerza centripeta para mantener a un objeto de masa " 
        + masa + "kg en una trayectoria circular de radio " + radio + "m y a una velocidad angular de "
        + velAng + "m/s es de " + String.format("%.2f", masa * Math.pow(velAng,2)/radio) + "N.");
    }
}
