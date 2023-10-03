package trabajoPracticoDos.Maestro;
/*
5. Inversión de un arreglo: Dado un arreglo de enteros inviertalo, de tal manera que
el primer elemento ahora sea el último y así sucesivamente.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        int[] arr = {5,7,8,9,12,1,0,2,3};
        int aux; 

        for (int i = 0; i < arr.length/2; i++){
            aux = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = aux;
        }
    }
}
