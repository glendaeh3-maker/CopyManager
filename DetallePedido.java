package com.mycompany.copymanager;

// Representa una linea de detalle dentro de un pedido
// (un servicio con su cantidad y subtotal)
public class DetallePedido {

    private Servicio servicio;
    private int cantidad;
    private double subtotal;

    public DetallePedido() {
    }

    public void calcularSubtotal() {
        this.subtotal = this.servicio.calcularCosto(this.cantidad);
    }

    public void verDatos() {
        System.out.println("    SERVICIO: " + this.servicio.getNombre()
                + " CANTIDAD: " + this.cantidad
                + " SUBTOTAL: S/ " + this.subtotal);
    }

    // Getters y Setters
    public Servicio getServicio() { return servicio; }
    public void setServicio(Servicio servicio) { this.servicio = servicio; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
}
