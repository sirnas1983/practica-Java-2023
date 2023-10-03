package trabajoPracticoDos.Caballero;
/*Dame los mayores y los menores : Realizar un programa donde se guarden 5 en
un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo
de los números ingresados. */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,81,110,154,199,0,413,122,212,-15};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : arr){
            if(num <= min){
                min = num;
            } else if (num >= max){
                max = num;
            }
        }
        System.out.println("El minimo es "+ min + " y el maximo es " + max);
    }
}
