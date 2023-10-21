package trabajoPracticoPOO.Caballero;

import java.util.HashMap;

public class GestorDeInventario {

    HashMap<Producto, Integer> inventario;
    
    public GestorDeInventario(){
        this.inventario = new HashMap<>();
    }
    
    public void actualizarProducto(Producto producto){
        this.inventario.put(producto, producto.stock);
    }

    public void verProductos(){
        System.out.println("-".repeat(25));
        this.inventario.forEach( (a,b) -> {
            System.out.println(a.nombre);
            System.out.println(a.precio);
            System.out.println(b);
            System.out.println("-".repeat(25));
        });
    }

    public Producto buscarPorNombre(String nombre){
        for (Producto producto : this.inventario.keySet()){
            System.out.println(producto.nombre);
            if (producto.nombre.toLowerCase().equals(nombre.toLowerCase())){
                return producto;
            }
        }
        System.out.println("No se encontro un producto de nombre " + nombre);
        return null;
    }
}
