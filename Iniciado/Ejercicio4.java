package Iniciado;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dividendo: ");
        Integer numero1 = scanner.nextInt();
        System.out.println("Ingrese el divisor: ");
        Integer numero2 = scanner.nextInt();
        System.out.println(String.format("El numero %d %s divisible por %d", numero1, numero1%numero2==0 ? "es": "no es",numero2));

    }
    
}
