package trabajoPracticoDos.Maestro;

import java.util.Arrays;

/*4. Trasladar posiciones en un arreglo: Dado un arreglo de enteros, una posición del
arreglo y la cantidad de N traslados a hacer en un arreglo. Lo que debe hacer es
tomar el elemento de la posición del arreglo y trasladarlo N cantidad de veces, si el
traslado es mayor al tamaño del arreglo informar por pantalla. */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int aux, i, j, pos, trasl;
        System.out.println("Original: " + Arrays.toString(arr));
        pos = 5;
        trasl = 3;
        if (pos + trasl > arr.length - 1){
            System.out.println("Los traslados superan la longitud del arreglo.");
        } else {
            for (i = pos, j = 1; j <= trasl ; j++, i++){
                aux = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = aux;
            }
        }
        System.out.println("Modificado: " + Arrays.toString(arr));
    }
}
