package trabajoPracticoPOO.Maestro;

import java.util.ArrayList;
import java.util.List;

public abstract class EntidadElectronica {
    protected String nombre;
    protected String domicilio;
    protected String telefono;
    protected List<Producto> productos;


    public EntidadElectronica() {
    }

    public EntidadElectronica(String nombre, String domicilio, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void registrarProducto(Producto producto) {
        this.productos.add(producto);
    }

    
}
