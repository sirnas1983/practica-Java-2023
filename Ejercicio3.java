import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String name = scanner.nextLine();
        for (int i=0; i< name.length(); i++){
            System.out.println(name.toCharArray()[i]);
        }
    }
}
