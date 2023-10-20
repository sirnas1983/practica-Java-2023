package trabajoPracticoPOO.Caballero;

public class Producto {
    String nombre;
    Float precio;
    int stock;
    
    public Producto(String nombre, float precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void agregar(int cant){
        this.stock += cant;
    }

    public void actualizarStock(int stock){
        this.stock = stock;
    }

    public void actualizarPrecio(float precio){
        this.precio = precio;
    }
}
