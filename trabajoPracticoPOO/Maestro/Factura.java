package trabajoPracticoPOO.Maestro;

import java.time.LocalDate;
import java.util.HashMap;

public class Factura {
    
    static private Long idAutogenerado = 0l;
    private Long idFactura;
    private Cliente cliente;
    private LocalDate fecha;
    private HashMap<Producto, Integer> detalleFactura;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.detalleFactura = new HashMap<>();
    
    }

    static Long getIdAutogenerado(){
        idAutogenerado ++;
        return idAutogenerado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void agregarProducto(Producto prod, int cant){
        this.detalleFactura.put(prod, cant);
    }

    public HashMap<Producto,Integer> getDetalleFactura() {
        return this.detalleFactura;
    }

    public Double totalFactura(){
        Double sum = 0.00;
        for (Producto prod  : this.detalleFactura.keySet()){
            sum += prod.getPrecio() * this.detalleFactura.get(prod);
        };
        return sum;
    }

    public void confirmarVenta(){
        this.idFactura = getIdAutogenerado();
    }
}
