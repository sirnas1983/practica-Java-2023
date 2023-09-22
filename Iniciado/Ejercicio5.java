package Iniciado;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud del lado del triangulo:");
        var longitudLado = scanner.nextInt();
        for (int i = 0; i <= longitudLado; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            };
            if(i!=0){
                System.out.println();
            };
        }
    }
    
}
