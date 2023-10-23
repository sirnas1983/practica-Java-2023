package trabajoPracticoPOO.Maestro;

import java.util.ArrayList;
import java.util.List;

public class Tienda extends EntidadElectronica {

    private List<Cliente> clientes;
    private List<Factura> facturas;
    private Factura ventaEnCurso;

    public Tienda(String nombre, String domicilio, String telefono) {
        super(nombre, domicilio, telefono);
        this.clientes = new ArrayList<>();
        this.facturas = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<String> productosEnStock(){
        List<String> resp = new ArrayList<>();
        this.productos.forEach((elem) -> {
            if (elem.getStock() > 0){
                resp.add(elem.getNombre());
            }
        });
        return resp;
    }

    public void nuevaVenta(Cliente cliente){
        this.ventaEnCurso = new Factura(cliente);
    }

    public void agregarProductoVenta(Producto prod, int cant){
        if(prod.getStock() < cant){
            System.out.println("No se puede agregar el producto " + prod.getNombre());
            System.out.println("Stock disponible: " + prod.getStock());
        } else {
            prod.setStock(prod.getStock() - cant);
            this.ventaEnCurso.agregarProducto(prod, cant + 
                                            (this.ventaEnCurso.getDetalleFactura().get(prod) != null ? 
                                            this.ventaEnCurso.getDetalleFactura().get(prod) : 0));
            System.out.println("Producto agregado correctamente.");
        }
    }

    public void finalizarVenta(){
        if (this.ventaEnCurso.getDetalleFactura().isEmpty()){
            System.out.println("No hay productos agregados");
            System.out.println("Antes de finalizar agregue productos");
        } else {
            this.ventaEnCurso.confirmarVenta();
            this.facturas.add(this.ventaEnCurso);
            System.out.println("FACTURA N° "+this.ventaEnCurso.getIdFactura() + " - Cliente: " + this.ventaEnCurso.getCliente().getNombre());
            System.out.println("-".repeat(25));
            System.out.println("Detalle:");
            System.out.println("-".repeat(25));
            this.ventaEnCurso.getDetalleFactura().forEach((prod, cant) ->{
                this.ventaEnCurso.getCliente().registrarProducto(prod);
                System.out.println(prod.getNombre() + " - cant.: " + cant);
            });
            System.out.println("-".repeat(25));
            System.out.println("El monto total de venta es de " + this.ventaEnCurso.totalFactura());
            System.out.println("-".repeat(25));
            this.ventaEnCurso = null;
        }
    }

    public void cancelarVenta(){
        this.ventaEnCurso = null;
        System.out.println("Venta cancelada exitosamente.");
    }
}

