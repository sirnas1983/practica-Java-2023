package ejercicio2;

import ejercicio2.basededatos.BdProductos;
import ejercicio2.domain.Cliente;
import ejercicio2.entrada.InputConsoleService;

public class Main {
    public static void main(String[] args) {
        
        Cliente client = new Cliente("Jorge", "De por alla", "jorge@jorge.com", "222-555555");
        int opt = 0;

        do {
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Modificar producto del carrito");
            System.out.println("4. Ver carrito");
            System.out.println("5. Vaciar carrito");
            System.out.println("6. Comprar carrito");
            System.out.println("7. Ver pedidos");
            System.out.println("0. Salir");

            System.out.println("Ingrese una opcion");
            opt = InputConsoleService.getScanner().nextInt();

            switch (opt){
                case 1:
                    BdProductos.listProducts();
                    break;
                case 2:
                    client.addProduct();
                    break;
                case 3:
                    client.modifyProduct();
                    break;
                case 4:
                    client.viewCart();
                    break;       
                case 5:
                    client.emptyCart();
                    break;    
                case 6:
                    client.confirmCarrito();
                    break;                
                case 7:
                    client.getOrdersToString();
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Error! Opcion invalida");
            }

        }while (opt != 0);

        InputConsoleService.getScanner().close();
    }
}
