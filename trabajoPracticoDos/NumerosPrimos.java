package trabajoPracticoDos;
import java.util.Scanner;
// El ejercicio pide determinar la cantidad de numeros primos en un rango determinado.
// Voy a usar max como el maximo del rango, min como el minimo del rango y cont como el
// contador para determinar la cantidad de primos en ese conjunto de valores. i y j son 
// los contadores utilizados dentro de los bucles for.
public class NumerosPrimos {
    public static void main(String[] args) {
        // En esta primera seccion declaro las variables
        // max, cont, min, i y j.
        int max, cont, min, i, j;
        // Inicializo el contador en 0
        cont = 0; 
        Scanner scanner = new Scanner(System.in);
        // Solicito al usuario ingresar un maximo y un minimo para el calculo
        // e inicializo las variables max y min
        System.out.println("Ingrese un numero entre 1 y 999");
        min = scanner.nextInt();
        System.out.println("Ingrese un numero entre 1 y 1000 mayor al anterior");
        max = scanner.nextInt();
        // Determino si max => min para no entrar en bucles infinitos y si ambos 
        // estan dentro de los limites establecidos (0 y 1000). De haber un error
        // el bucle while va a seguir solicitando que se ingresen los valores hasta
        // que esten dentro de los parametros establecidos
        while (max < 0 || max > 1000 || max < min){ 
            System.out.println("Debe ingresar un numero entre 1 y 1000 y maximo mayor a minimo");
            System.out.println("Ingrese nuevamente un minimo:");
            min = scanner.nextInt();
            System.out.println("Ingrese nuevamente un maximo:");
            max = scanner.nextInt();
        }
        // inicio el bucle en el minimo y finalizo en el maximo, ambos
        // establecidos por el usuario en el paso anterior
        System.out.println("-".repeat(15));
        for (i = min ; i <= max; i++){
            // Caso puntual i = 2. Es un primo, con lo que si 2 esta dentro del rango
            // (i == 2) imprimimos que es primo y sumamos 1 al contador.
            if (i==2){ 
                System.out.println(i + " es primo.");
                cont ++;
                // Este continue salta a la proxima iteracion sin recorrer el resto del bloque for
                continue; 
            }
            // Verifico la divisibilidad desde el numero analizado (i) hasta
            // la raiz cuadrada de ese numero. Esto esta razonado asi porque cualquier
            // numero mayor que la raiz cuadrada de un numero debe multiplicar si o si
            // a un numero menor que este, por ende ese valor ya lo tendriamos evaluado
            // con lo que no tendria sentido seguir recorriendo valores superiores a este.
            // a x a = b x c
            // si (b > a) -> (c < a) para mantener la igualdad
            for (j = 2; j <= Math.ceil(Math.pow(i, 0.5)); j++){
                // Si es divisible por algun numero entre 2 y la raiz cuadrada 
                // quiere decir que no es primo, con lo que salimos del segundo bucle for.
                if (i % j == 0){ 
                    break;
                // Si llegamos al final de la iteracion (final = Math.ceil(Math.pow(i, 0.5)))
                // quiere decir que este es un numero primo, ya que no hubo ningun numero en ese
                // rango con el que es divisible. Imprimimos el numero y sumamos 1 al contador.
                } else if (j == Math.ceil(Math.pow(i, 0.5))){
                    System.out.println(i + " es primo.");
                    cont ++;
                } 
            }
        }
        // Imprimimos el resultado por consola
        System.out.println("-".repeat(15));
        System.out.println("Hay "+ cont + " numeros primos del " + min + " al " + max);
        scanner.close();
    }
}
