package Caballero;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double VENTA_LIBRA_ESTERLINA = 1.40;
        System.out.println("Ingrese cuantos Libras Esterlinas quiere vender: ");
        int Libras = scanner.nextInt();
        System.out.println("Se le entregaran "+ VENTA_LIBRA_ESTERLINA * Libras + " dolares");

    }
}
