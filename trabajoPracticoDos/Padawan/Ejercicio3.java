package trabajoPracticoDos.Padawan;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para calcular su factorial");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int fact = 1;
        for (int i = 2; i <=num; i++ ){
            fact *= i;
        }
        System.out.println("El factorial de " + num + " es: " + fact);
    }
}
