package com.mycompany.copymanager;

// Servicio de plastificado de hojas
public class ServicioPlastificado extends Servicio {

    public ServicioPlastificado() {
        this.precio_unitario = 2.00;
    }

    @Override
    public double calcularCosto(int cantidad) {
        return this.precio_unitario * cantidad;
    }

    @Override
    public void verDatos() {
        System.out.println("SERVICIO PLASTIFICADO"
                + " COD: " + this.codigo
                + " NOMBRE: " + this.nombre
                + " PRECIO/HOJA: " + this.precio_unitario);
    }
}
