package com.mycompany.copymanager;

// Clase abstracta base para todos los servicios del centro de fotocopiado
public abstract class Servicio {

    protected String codigo;
    protected String nombre;
    protected double precio_unitario;

    // Cada subclase calcula su costo a su manera (polimorfismo)
    public abstract double calcularCosto(int cantidad);

    public abstract void verDatos();

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio_unitario() { return precio_unitario; }
    public void setPrecio_unitario(double precio_unitario) { this.precio_unitario = precio_unitario; }
}
