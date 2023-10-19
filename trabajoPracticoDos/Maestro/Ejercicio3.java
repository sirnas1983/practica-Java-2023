package trabajoPracticoDos.Maestro;

import java.util.Arrays;

/*
3. Unión de dos arreglos : Dado dos arreglos con cualquier tipo de valor (Ya sea
String, Char, Integer, etc), realice la unión de ambos arreglos en un tercer arreglo.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10,11,12};

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i< arr3.length; i++){
            if (i < arr1.length){
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
