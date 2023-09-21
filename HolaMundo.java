import java.util.Scanner;

public class HolaMundo{


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("¡Hola Mundo!");
        String nombre = myObj.nextLine();
        System.out.println("Your name is " + nombre);
    }


}