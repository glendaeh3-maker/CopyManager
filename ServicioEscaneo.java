package com.mycompany.copymanager;

// Servicio de escaneo de documentos
public class ServicioEscaneo extends Servicio {

    public ServicioEscaneo() {
        this.precio_unitario = 0.50;
    }

    @Override
    public double calcularCosto(int cantidad) {
        return this.precio_unitario * cantidad;
    }

    @Override
    public void verDatos() {
        System.out.println("SERVICIO ESCANEO"
                + " COD: " + this.codigo
                + " NOMBRE: " + this.nombre
                + " PRECIO/PAG: " + this.precio_unitario);
    }
}
