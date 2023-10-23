package trabajoPracticoPOO.Maestro;

import java.time.LocalDate;
import java.util.HashMap;

public class Factura {
    
    static private Long idFacturaAutogenerado = 0l;
    private Long idFactura;
    private Cliente cliente;
    private LocalDate fecha;
    private HashMap<Producto, Integer> detalle;

    public Factura(Cliente cliente, LocalDate fecha, HashMap<Producto, Integer> detalle) {
        this.idFactura = getIdAutogenerado();
        this.cliente = cliente;
        this.fecha = fecha;
        this.detalle = detalle;
    }

    public Factura() {
    }

    
    static Long getIdAutogenerado(){
        idFacturaAutogenerado ++;
        return idFacturaAutogenerado;
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


    public HashMap<Producto, Integer> getDetalle() {
        return detalle;
    }

    
    public void setDetalle(HashMap<Producto, Integer> detalle) {
        this.detalle = detalle;
    }


    public Long getIdFactura() {
        return idFactura;
    }


}
