package trabajoPracticoPOO.Maestro;

public class Main {
    public static void main(String[] args) {
        
        Tienda tienda = new Tienda("Offit", "Las garzas 732", "362-444444");

        Producto prod1 = new Producto("Tablet", "Tablet 10.5' marca Toshiba", 225.25, 10);
        Producto prod2 = new Producto("Celular Samsung A23", "Celular A23 liberado color Plata", 115.49, 6);
        Producto prod3 = new Producto("Notebook HP", "notebook HP de 15.6' con touchscreen", 1239.99, 1);

        Cliente cliente1 = new Cliente("Juan", "Pehuajo", "444-4444444");
        Cliente cliente2 = new Cliente("Carlos", "Cordoba", "111-111111");
        Cliente cliente3 = new Cliente("Leonel", "Rosario", "333-333333");

        tienda.registrarProducto(prod1);
        tienda.registrarProducto(prod2);
        tienda.registrarProducto(prod3);

        tienda.nuevaVenta(cliente1);
        tienda.agregarProductoVenta(prod1, 1);
        tienda.agregarProductoVenta(prod1, 5);
        tienda.agregarProductoVenta(prod1, 5);
        tienda.finalizarVenta();

        tienda.nuevaVenta(cliente2);
        tienda.agregarProductoVenta(prod1, 1);
        tienda.agregarProductoVenta(prod1, 3);
        tienda.finalizarVenta();

        tienda.nuevaVenta(cliente3);
        tienda.agregarProductoVenta(prod2, 6);
        tienda.agregarProductoVenta(prod1,  50);
        tienda.finalizarVenta();
        tienda.cancelarVenta();
    }
}
