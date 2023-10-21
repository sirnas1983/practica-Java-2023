package trabajoPracticoPOO.Maestro;

public class Main {
    public static void main(String[] args) {
        
        Tienda tienda = new Tienda("Offit", "Las garzas 732", "362-444444");
        Producto prod1 = new Producto("Tablet", "Tablet 10.5' marca Toshiba", 225.25, 10);
        Producto prod2 = new Producto("Celular Samsung A23", "Celular A23 liberado color Plata", 115.49, 6);
        Producto prod3 = new Producto("Notebook HP", "notebook HP de 15.6' con touchscreen", 1239.99, 1);

        tienda.registrarProducto(prod1);
        tienda.registrarProducto(prod2);
        tienda.registrarProducto(prod3);

        System.out.println(tienda.productosEnStock().toString());

        Cliente cliente1 = new Cliente("Juan", "Pehuajo", "444-4444444");
        Cliente cliente2 = new Cliente("Carlos", "Cordoba", "111-111111");
        Cliente cliente3 = new Cliente("Leonel", "Rosario", "333-333333");
    
        tienda.venderProducto(prod1, 5, cliente3);
        tienda.venderProducto(prod2, 5, cliente3);
        tienda.venderProducto(prod3, 5, cliente3);

        System.out.println(cliente3.getProductos());

        tienda.venderProducto(prod2, 1, cliente1);
        tienda.venderProducto(prod1, 3, cliente2);
        
        System.out.println(tienda.productosEnStock().toString());
    }
}
