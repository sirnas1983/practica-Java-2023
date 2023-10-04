package trabajoPracticoUno.Caballero;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final double VENTA_DOLAR_BNA = 365.5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cuantos dolares quiere vender: ");
        int dolares = scanner.nextInt();
        System.out.println("Se le entregaran "+ VENTA_DOLAR_BNA * dolares + " pesos");

    }
}
