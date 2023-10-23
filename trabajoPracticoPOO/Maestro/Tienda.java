package trabajoPracticoPOO.Maestro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tienda extends EntidadElectronica {

    private List<Cliente> clientes;
    private List<Factura> facturas;

    public Tienda(){
        super();
    }

    public Tienda(String nombre, String domicilio, String telefono) {
        super(nombre, domicilio, telefono);
        this.clientes = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Producto> productosEnStock(){
        List<Producto> resp = new ArrayList<>();
        this.productos.forEach((elem) -> {
            if (elem.getStock() > 0){
                resp.add(elem);
            }
        });
        return resp;
    }

    public void venderProducto(Producto prod, int cant, Cliente cliente){
        if(prod.getStock() < cant){
            System.out.println("No se puede realizar la venta.");
            System.out.println("Stock disponible: " + prod.getStock());
        } else {
            prod.setStock(prod.getStock() - cant);
            cliente.registrarProducto(prod);
            HashMap<Producto, Integer> detalle = new HashMap<>();
            detalle.put(prod, cant);
            Factura factura = new Factura(cliente, LocalDate.now(), detalle); 
            this.facturas.add(factura);
            System.out.println("Venta registrada correctamente.");
        }
    }
}

