import java.util.Arrays;

public class Clase6del10 {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
            if(arr == null || arr.length<=2) {   
                System.out.println("El arreglo es demasiado corto o vacio");
            }else if (arr == null ||arr.length > 2) {
                int[] arrResultado = new int[arr.length - 2];
                for (int i=0; i < arrResultado.length; i++){
                    arrResultado[i] = arr[i+1];
                }
                System.out.println(Arrays.toString(arrResultado));
            }
    }
}
