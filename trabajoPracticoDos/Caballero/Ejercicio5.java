package trabajoPracticoDos.Caballero;
/*
5. Restalos, prohibido menores a ceros : Cree dos arreglos con números decimales,
luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo, si
la resta da negativo entonces guarde 0.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        double[][] arr = {{7.2,3.7,8.42,5.41,4.87},{6.34,8.47,5.47,25.22,37.0,17.6,42.4}};

        int longitud = Math.min(arr[0].length, arr[1].length);
        double[] rpta = new double[longitud];
        
        for (int i = 0; i < longitud; i++){
            if(arr[0][i]-arr[1][i] >= 0){
                rpta[i] = arr[0][i] - arr[1][i];
            } else {
                rpta[i] = 0;
            }
        }
    }
}
