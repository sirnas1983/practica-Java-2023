package trabajoPracticoDos.Maestro;

import java.util.Arrays;

/*
2. Eliminación de un elemento: Dado un arreglo con valores enteros, realice la
búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por
pantalla. 
*/
public class Ejercicio1y2 {
    public static void main(String[] args) {
        
        int[] arrNumerosEnteros = {1,2,3,4,5,6,7,8,6,6,69,10};
        int elemento = 6;
        int cantidadApariciones = 0;
        int i;
        // Con este primer 'for' cuento la cantidad de eventos
        for(i = 0; i < arrNumerosEnteros.length; i++){
            if (arrNumerosEnteros[i]== elemento){
                cantidadApariciones ++;
            }
        }
        // Teniendo la cantidad de eventos hago el "pseudo-borrado"
        if (cantidadApariciones != 0){
            int[] resp = new int[arrNumerosEnteros.length - cantidadApariciones];
            int j = 0;
            for(i = 0; i< arrNumerosEnteros.length; i++){
                if(arrNumerosEnteros[i] != elemento){
                    resp[j] = arrNumerosEnteros[i];
                    j ++;
                }
            }
            System.out.println(Arrays.toString(resp));
        } else {
            System.out.println("El numero solicitado no se encuentra en el arreglo.");
        }
    }
}
