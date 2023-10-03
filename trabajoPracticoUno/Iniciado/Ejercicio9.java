package trabajoPracticoUno.Iniciado;

public class Ejercicio9 {
    public static void main(String[] args) {
        var numero = 36;
        var numeroCubo = Math.pow(36,3);
        var numeroCuadrado = Math.pow(36,2);
        System.out.println(String.format("El cuadrado de %d es %,.2f",numero, numeroCuadrado));
        System.out.println(String.format("El cubo de %d es %,.2f",numero, numeroCubo));
    }
}
