package com.mycompany.copymanager;

import java.util.ArrayList;

// Pedido realizado en el centro de fotocopiado
public class Pedido {

    private int id;
    private String fecha;
    private Cliente cliente;       // puede ser null si es cliente anonimo
    private String estado;         // "PENDIENTE", "COMPLETADO", "CANCELADO"
    private double descuento;
    private double total;

    private ArrayList<DetallePedido> detalles;

    // Contador para id automatico
    private static int contador = 1;

    public Pedido() {
        this.id = contador;
        contador++;
        this.detalles = new ArrayList();
        this.estado = "PENDIENTE";
        this.descuento = 0;
        this.total = 0;
    }

    // Agrega un detalle al pedido y recalcula el total
    public void agregarDetalle(DetallePedido detalle) {
        detalle.calcularSubtotal();
        this.detalles.add(detalle);
        recalcularTotal();
    }

    // Calcula el total con descuento si aplica (cliente frecuente = 5% menos)
    public void recalcularTotal() {
        double subtotal_bruto = 0;
        for (int i = 0; i < detalles.size(); i++) {
            subtotal_bruto += detalles.get(i).getSubtotal();
        }

        if (this.cliente instanceof ClienteFrecuente) {
            this.descuento = subtotal_bruto * 0.05;
        } else {
            this.descuento = 0;
        }

        this.total = subtotal_bruto - this.descuento;
    }

    public void verDatos() {
        System.out.println("PEDIDO ID: " + this.id
                + " FECHA: " + this.fecha
                + " ESTADO: " + this.estado);
        if (this.cliente != null) {
            System.out.println("  CLIENTE: " + this.cliente.getNombreCompleto());
        } else {
            System.out.println("  CLIENTE: Anonimo");
        }
        System.out.println("  DETALLE:");
        for (int i = 0; i < detalles.size(); i++) {
            detalles.get(i).verDatos();
        }
        System.out.println("  DESCUENTO: S/ " + this.descuento);
        System.out.println("  TOTAL:     S/ " + this.total);
    }

    // Getters y Setters
    public int getId() { return id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        recalcularTotal(); // recalcula por si cambia el tipo de cliente
    }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getDescuento() { return descuento; }
    public double getTotal() { return total; }

    public ArrayList<DetallePedido> getDetalles() { return detalles; }
}
