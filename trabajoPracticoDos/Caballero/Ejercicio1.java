package trabajoPracticoDos.Caballero;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] arr = {5,7,8,10,15,18,22,35,34,28,45,46};
        int numBuscado = 18;
        boolean isFound = false;
        for (int num : arr){
            if (numBuscado == num){
                System.out.println("Se encontro el numero");
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("El numero no se encontro");
        }
    }
}
