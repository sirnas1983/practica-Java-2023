package trabajoPracticoDos.Iniciado;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();

        if (num > 0){
            System.out.println("Numero positivo");;
        } else if (num == 0){
            System.out.println("Numero es cero");;
        } else {
            System.out.println("Numero negativo");;
        }

      };  
    }

