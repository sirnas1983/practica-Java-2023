package Iniciado;
import java.util.Scanner;

public class Ejercicio1 {

        public static void main(String[] args) {
            try{
                try (Scanner myObj = new Scanner(System.in)) {
                    System.out.println("Ingrese un entero: ");
                    int integer1 = myObj.nextInt();
                    System.out.println("Ingrese otro entero: ");
                    int integer2 = myObj.nextInt();
                    int sum = integer1 + integer2;
                    String mensaje = String.format("El resultado de la suma es %d, es %s",sum, (sum % 2 == 0 ? "par": "impar"));
                    System.out.println(mensaje);
                } }
            catch(Exception e) {
                System.out.println(String.format("Ha ocurrido el siguiente error: %s", e.toString()));
            } finally {
                
            }
    }
}
