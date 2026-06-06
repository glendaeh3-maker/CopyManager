package com.mycompany.copymanager;

// Cliente frecuente: hereda de Cliente y tiene descuento del 5%
public class ClienteFrecuente extends Cliente {

    private int puntos_fidelidad;

    public ClienteFrecuente() {
        super();
        this.puntos_fidelidad = 0;
    }

    // Acumula puntos segun el monto de compra
    public void acumularPuntos(double monto) {
        this.puntos_fidelidad += (int) monto;
    }

    @Override
    public void verDatos() {
        System.out.println("CLIENTE FRECUENTE ID: " + this.id
                + " NOMBRE: " + this.nombres
                + " APELLIDOS: " + this.apellidos
                + " TEL: " + this.telefono
                + " PUNTOS: " + this.puntos_fidelidad);
    }

    // Getters y Setters
    public int getPuntos_fidelidad() { return puntos_fidelidad; }
    public void setPuntos_fidelidad(int puntos_fidelidad) {
        this.puntos_fidelidad = puntos_fidelidad;
    }
}
