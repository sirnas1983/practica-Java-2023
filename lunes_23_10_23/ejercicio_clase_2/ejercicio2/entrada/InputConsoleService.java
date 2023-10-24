package lunes_23_10_23.ejercicio_clase_2.ejercicio2.entrada;

import java.util.Scanner;

public class InputConsoleService{

    public static Scanner scanner;

    private InputConsoleService() {}

    public static Scanner getScanner(){
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static void closeScanner(){
        if(scanner != null){
            scanner.close();
        }
    }

}
