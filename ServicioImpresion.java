package com.mycompany.copymanager;

// Servicio de impresion de documentos
public class ServicioImpresion extends Servicio {

    private String tipo; // "COLOR" o "B/N"

    public ServicioImpresion() {
    }

    @Override
    public double calcularCosto(int cantidad) {
        return this.precio_unitario * cantidad;
    }

    @Override
    public void verDatos() {
        System.out.println("SERVICIO IMPRESION"
                + " COD: " + this.codigo
                + " NOMBRE: " + this.nombre
                + " TIPO: " + this.tipo
                + " PRECIO/PAG: " + this.precio_unitario);
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) {
        this.tipo = tipo;
        if (tipo.equalsIgnoreCase("COLOR")) {
            this.precio_unitario = 0.80;
        } else {
            this.precio_unitario = 0.20;
        }
    }
}
