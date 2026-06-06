package com.mycompany.copymanager;

// Clase base para los clientes del centro de fotocopiado
public class Cliente {

    protected int id;
    protected String nombres;
    protected String apellidos;
    protected String telefono;

    // Contador para asignar id automatico
    private static int contador = 1;

    public Cliente() {
        this.id = contador;
        contador++;
    }

    public String getNombreCompleto() {
        return this.nombres + " " + this.apellidos;
    }

    public void verDatos() {
        System.out.println("CLIENTE ID: " + this.id
                + " NOMBRE: " + this.nombres
                + " APELLIDOS: " + this.apellidos
                + " TEL: " + this.telefono);
    }

    // Getters y Setters
    public int getId() { return id; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
