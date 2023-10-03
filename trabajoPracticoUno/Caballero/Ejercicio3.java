package trabajoPracticoUno.Caballero;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final double VENTA_EURO = 1.2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cuantos euros quiere vender: ");
        int euros = scanner.nextInt();
        System.out.println("Se le entregaran "+ VENTA_EURO * euros + " dolares");
    }
}
