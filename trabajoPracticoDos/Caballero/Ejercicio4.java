package trabajoPracticoDos.Caballero;
/* 4.Ordenarlo todo : Realizar un programa que guarde cierta cantidad de números con
punto decimal en un arreglo. Luego, el programa debe ordenar los números de
forma ascendente y mostrarlos en pantalla.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
         
        Double[] arr = {22.37,7.34,8.22,3.47,8.22,9.75,8.22,10.15,0.0,8.34,15.22};
        Double aux;
        
        for (int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if (arr[i] < arr[j]){  
                    aux = arr[j]; 
                    arr[j] = arr[i]; 
                    arr[i] = aux;
                }
            }
        }
        for(int k=0; k< arr.length; k++){
            System.out.println(arr[k]);
        }
    }
}
