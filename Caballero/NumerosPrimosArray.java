package Caballero;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimosArray {
    public static void main(String[] args) {
        
        int max, min, j;
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

        List<Integer> primos = new ArrayList<Integer>();
        primos.add(2);
        LocalDateTime now = LocalDateTime.now();
        for (int i = min ; i <= max; i++){
            boolean esDivisible = false;
            if (i==2){
                System.out.println(i + " es primo.");
            }
            for (j = 2; j < Math.ceil(Math.pow(i, 0.5)); j ++){
                if (i % num == 0){
                    esDivisible = true;
                    break;
                } 
            }
            if (!esDivisible){
                System.out.println(i +" es primo.");
                primos.add(i);
            }
        }
        LocalDateTime finish = LocalDateTime.now();

        System.out.println("Hay "+ primos.size() + " numeros primos del " + min + " al " + max);
        System.out.println("El proceso tardo: " + (finish.getNano()/10000 - now.getNano()/10000) + "ms.");
    }
}
