package Iniciado;

public class Ejercicio10 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 22;
        var acum = 0;
        for(int i=1; i <=15; i++){
            acum += (num1 * num2) / i;
            System.out.println(acum);
        }
        System.out.println(acum);
    }
}
