package trabajoPracticoDos.Maestro;
/*6. Sera Palíndromo?: Dado un arreglo con caracteres (Formando una palabra) indicar
si es o no palíndromo. */
public class Ejercicio6 {
    public static void main(String[] args) {

        char[] palabra = {'c', 'a', 's', 'a', 'c'};
        boolean palindromo = true;

        for (int i = 0; i < palabra.length/2; i++){
            if (palabra[i] != palabra[palabra.length - 1 - i]){
                palindromo = false;
                break;
            }
        }
        System.out.println(String.format("La palabra %s un palindromo",palindromo ? "es" : "no es"));
    }
}
