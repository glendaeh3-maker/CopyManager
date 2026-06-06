package com.mycompany.copymanager;

// Servicio de empastado de documentos
public class ServicioEmpastado extends Servicio {

    private String tipo_empaste; // "ESPIRAL", "PASTA BLANDA", "PASTA DURA"

    public ServicioEmpastado() {
    }

    @Override
    public double calcularCosto(int cantidad) {
        return this.precio_unitario * cantidad;
    }

    @Override
    public void verDatos() {
        System.out.println("SERVICIO EMPASTADO"
                + " COD: " + this.codigo
                + " NOMBRE: " + this.nombre
                + " TIPO: " + this.tipo_empaste
                + " PRECIO/UNIDAD: " + this.precio_unitario);
    }

    // Getters y Setters
    public String getTipo_empaste() { return tipo_empaste; }
    public void setTipo_empaste(String tipo_empaste) {
        this.tipo_empaste = tipo_empaste;
        // Precio segun tipo
        if (tipo_empaste.equalsIgnoreCase("ESPIRAL")) {
            this.precio_unitario = 3.00;
        } else if (tipo_empaste.equalsIgnoreCase("PASTA BLANDA")) {
            this.precio_unitario = 5.00;
        } else {
            this.precio_unitario = 8.00; // PASTA DURA
        }
    }
}
