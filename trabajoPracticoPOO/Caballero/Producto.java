package trabajoPracticoPOO.Caballero;
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
public class Producto {
    String nombre;
    Float precio;
    int stock;
    
    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }

    public void agregarStock(int cant){
        this.stock += cant;
    }

    public void cambiarNombre(String nombre){
        this.nombre = nombre;
    }

    public void ventaProducto(int cant){
        if(cant > this.stock){
            System.out.println("No hay cantidad suficiente de stcok");
        } else {
            this.stock -= cant;
        }
    }
}
