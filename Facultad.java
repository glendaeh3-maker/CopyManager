package com.mycompany.copymanager;

public class Facultad {

    private String codigo;
    private String nombre;

    public Facultad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void verDatos() {
        System.out.println("Facultad COD: " + this.codigo + " NOMBRE: " + this.nombre);
    }
}
