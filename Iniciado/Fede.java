package Iniciado;

public class Fede {
    public static void main(String[] args) {
        
        int n = 7;
        for (int i = 1; i <= n; i++){
            if (i == 1){
              estrellla(n);  
            }
            for (int k = 1; k <= n-i; k++){
                System.out.print(" ");
            } 
            for (int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
        private static void estrellla(int lados){
            System.out.println(" ".repeat(lados-1)+"*");
            System.out.println(" ".repeat(lados-3)+"*****");
            System.out.println(" ".repeat(lados-2)+"* *");
            System.out.println(" ".repeat(lados-3)+"*   *");
        };


}
