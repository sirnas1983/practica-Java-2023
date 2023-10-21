package trabajoPracticoPOO.Caballero;

import java.util.Locale;
import java.util.Scanner;
/*
Gestión de inventario. Desarrolla una aplicación de gestión de inventario utilizando
un HashMap. Define una clase Producto que incluya propiedades como nombre,
precio y cantidad en stock. Usa el HashMap para mantener un registro de productos
y sus existencias.
a. Permite a los usuarios :
i. Agregar producto
ii. Actualizar producto
iii. Consultar productos.
 */
public class MainInventario {
    
    public static void main(String[] args) {
        
        Integer stock;
        Float precioProducto;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        Producto producto;
        String nombreProducto;
        String x = "";
        GestorDeInventario gestorInventario = new GestorDeInventario();
        do{
            System.out.println("Ingrese una opcion: ");
            System.out.println("1 - Agregar un producto");
            System.out.println("2 - Ver lista de productos");
            System.out.println("3 - Modificar producto");
            System.out.println("Cualquier otra opcion para salir");
            String opcion = scan.nextLine();
            switch (opcion){
                case "1":
                    System.out.println("Ingrese el nombre del producto a agregar: ");
                    nombreProducto = scan.nextLine();
                    System.out.println("Ingrese el precio unitario: ");
                    precioProducto = Float.parseFloat(scan.nextLine());
                    System.out.println("Ingrese el Stock: ");
                    stock = Integer.parseInt(scan.nextLine());
                    producto = new Producto(nombreProducto, precioProducto, stock);
                    gestorInventario.actualizarProducto(producto);                    
                    break;
                case "2":
                    gestorInventario.verProductos();
                    break;
                case "3":
                    System.out.println("Ingrese el nombre del producto a modificar: ");
                    nombreProducto = scan.nextLine();
                    producto = gestorInventario.buscarPorNombre(nombreProducto);
                    if (producto != null){
                        System.out.println("Ingrese el nuevo precio (ENTER para dejar precio actual): ");
                        String pr = scan.nextLine();
                        if (!pr.equals("")){
                        producto.precio = Float.parseFloat(pr);
                        }
                        System.out.println("Ingrese el Stock: ");
                        producto.stock = Integer.parseInt(scan.nextLine());                   
                    }
                    break;
                default:
                    x = "exit";
            } 
        }while(x == "");
        scan.close();
        
    }
}
