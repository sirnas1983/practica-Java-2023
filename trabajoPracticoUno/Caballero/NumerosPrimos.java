package trabajoPracticoUno.Caballero;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        
        int max, cont, min, j;
        cont = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un minimo entre 1 y 999");
        min = scanner.nextInt();
        System.out.println("Ingrese un maximo entre 1 y 5000");
        max = scanner.nextInt();
        while (min < 0 || max > 10000 || max < min){
            System.out.println("Debe ingresar un maxero entre 1 y 5000 y maximo mayor a minimo");
            System.out.println("Ingrese nuevamente un minimo:");
            min = scanner.nextInt();
            System.out.println("Ingrese nuevamente un maximo:");
            max = scanner.nextInt();
        }
        scanner.close();
        LocalDateTime now = LocalDateTime.now();
        for (int i = min ; i <= max; i++){
            if (i==2){
                System.out.println(i + " es primo.");
                cont ++;
            }
            for (j = 2; j < i; j++){
                if (i % j == 0){
                    break;
                } else if (j == i - 1){
                    System.out.println(i + " es primo.");
                    cont ++;
                } 
            }
        }
        LocalDateTime finish = LocalDateTime.now();

        System.out.println("Hay "+ cont + " numeros primos del " + min + " al " + max);
        System.out.println("El proceso tardo: " + (finish.getNano()/10000 - now.getNano()/10000) + "ms.");
    }
}
