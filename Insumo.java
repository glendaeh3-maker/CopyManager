package com.mycompany.copymanager;

// Insumo del inventario (papel, toner, cartuchos, etc.)
public class Insumo {

    private String codigo;
    private String nombre;
    private String unidad;
    private int stock_actual;
    private int stock_minimo;

    public Insumo() {
    }

    // Retorna true si el stock esta por debajo del minimo
    public boolean requiereAlerta() {
        return this.stock_actual < this.stock_minimo;
    }

    // Descuenta unidades del stock
    public void consumir(int cantidad) {
        this.stock_actual -= cantidad;
        if (this.stock_actual < 0) {
            this.stock_actual = 0;
        }
    }

    // Repone unidades al stock
    public void reponer(int cantidad) {
        this.stock_actual += cantidad;
    }

    public void verDatos() {
        String alerta = requiereAlerta() ? " *** STOCK BAJO ***" : "";
        System.out.println("INSUMO COD: " + this.codigo
                + " NOMBRE: " + this.nombre
                + " STOCK: " + this.stock_actual + " " + this.unidad
                + " MIN: " + this.stock_minimo
                + alerta);
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUnidad() { return unidad; }
    public void setUnidad(String unidad) { this.unidad = unidad; }

    public int getStock_actual() { return stock_actual; }
    public void setStock_actual(int stock_actual) { this.stock_actual = stock_actual; }

    public int getStock_minimo() { return stock_minimo; }
    public void setStock_minimo(int stock_minimo) { this.stock_minimo = stock_minimo; }
}
