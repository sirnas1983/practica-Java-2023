package trabajoPracticoDos.Padawan;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num = 5000;
        int acum = 0;

        for (int i = 1; i <= num; i++){
            acum += i;
        }
        System.out.println("La suma es: "+acum);
    }
}
