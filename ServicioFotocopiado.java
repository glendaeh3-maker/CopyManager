package com.mycompany.copymanager;

// Servicio de fotocopiado: puede ser color o blanco y negro
public class ServicioFotocopiado extends Servicio {

    private String modalidad; // "COLOR" o "B/N"

    public ServicioFotocopiado() {
    }

    // precio por pagina x cantidad de paginas
    @Override
    public double calcularCosto(int cantidad) {
        return this.precio_unitario * cantidad;
    }

    @Override
    public void verDatos() {
        System.out.println("SERVICIO FOTOCOPIADO"
                + " COD: " + this.codigo
                + " NOMBRE: " + this.nombre
                + " MODALIDAD: " + this.modalidad
                + " PRECIO/PAG: " + this.precio_unitario);
    }

    // Getters y Setters
    public String getModalidad() { return modalidad; }
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
        // Precio segun modalidad
        if (modalidad.equalsIgnoreCase("COLOR")) {
            this.precio_unitario = 0.50;
        } else {
            this.precio_unitario = 0.10;
        }
    }
}
