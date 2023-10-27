package ejercicio2.domain;

import ejercicio2.enums.EstadoPedidos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Pedido {
    
    private Long id;
    private Cliente client;
    private LocalDate date;
    private Carrito cart;
    private EstadoPedidos status;

    private static Long autoGeneratedId = 0l;

    public Pedido() {
    }

    public Pedido(Long id, Cliente client, LocalDate date, Carrito cart){
        this.id = id;
        this.client = client;
        this.date = date;
        this.cart = cart;
        this.status = EstadoPedidos.PENDIENTE;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getClient() {
        return this.client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Carrito getCart() {
        return this.cart;
    }

    public void setCart(Carrito cart) {
        this.cart = cart;
    }

    public EstadoPedidos getStatus() {
        return this.status;
    }

    public void setStatus(EstadoPedidos status) {
        this.status = status;
    }
    
    public static Long autoGenerateID(){
        return ++ autoGeneratedId;
    }

    public void payed(){
        this.setStatus(EstadoPedidos.PAGADO);
    }

    public void sent(){
        this.setStatus(EstadoPedidos.ENVIADO);
    }

    public void delivered(){
        this.setStatus(EstadoPedidos.ENTREGADO);
    }

    public Double purchaseAmount(){
        Double amount = 0d;
        for (Producto prod : this.cart.getOrder().keySet()){
            amount += (prod.getPrecio() * this.cart.getOrder().get(prod));
        };
        return amount;
    }

    public void orderToString(){
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String client = this.getClient().getName();
        System.out.println("-".repeat(35));
        System.out.println("id " + this.getId() + " - " + this.date.format(fmt2) + " - Cliente: " + client);
        System.out.println("-".repeat(35));
        this.getCart().carritoToString();
        System.out.println("-".repeat(35));
        System.out.println("Total de compra: " + String.format("%.2f", this.purchaseAmount()) + "\nEstado: " + this.getStatus());
        System.out.println("-".repeat(35));
    }
}
