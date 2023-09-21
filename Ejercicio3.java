import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String name = scanner.nextLine();
        char[] nameArray = name.toCharArray();
        for (int i=0; i< name.length(); i++){
            System.out.println(nameArray[i]);
        }
    }
}
