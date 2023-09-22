package Padawan;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        // char[] name = {'D', 'a', 'r', 'i', 'a', 'n'};
        List<Character> name = List.of('D', 'a', 'r', 'i', 'a', 'n');
        for (var letra : name){
            System.out.println(letra);
        }
    }
}
