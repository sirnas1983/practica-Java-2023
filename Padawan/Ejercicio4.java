package Padawan;


public class Ejercicio4 {
    public static void main(String[] args) {
        String nom1, nom2, nom3;
        nom1 = "Juan";
        nom2 = "Jorge";
        nom3 = "Carlos";
        int edad1, edad2,edad3;
        edad1 = 31;
        edad2 = 45;
        edad3 =19;
        
        System.out.println(String.format("La edad de %s es %d", nom1, edad1));
        System.out.println(String.format("La edad de %s es %d", nom2, edad2));
        System.out.println(String.format("La edad de %s es %d", nom3, edad3));

        System.out.println("La edad promedio es: "+ (edad1+edad2+edad3)/3.0 );

    }
}
