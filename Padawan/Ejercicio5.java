package Padawan;

public class Ejercicio5 {

    public static void main(String[] args) {
        final var FACTOR_LIBRAS_A_KILOS = 0.4535970244035199;
        int pesoEnLibras = 170 ;
        var pesoEnKilos = pesoEnLibras * FACTOR_LIBRAS_A_KILOS;
        System.out.println(pesoEnLibras + " libras equivalen a " + pesoEnKilos + " kilogramos.");

    }
    
}
