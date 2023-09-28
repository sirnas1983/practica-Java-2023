package Iniciado;
import java.util.Scanner;

public class Ejercicio1 {
        public static void main(String[] args) {
                    int num1 = 5;
                    int num2 = 7;
                    var sum = num1 + num2;
                    String mensaje = String.format(
                        "El resultado de la suma es %d, es %s",
                        sum, 
                        sum % 2 == 0 ? "par": "impar"
                        );
                    System.out.println(mensaje);
            }
    }

