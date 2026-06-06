package com.mycompany.copymanager;

// Clase base para los empleados del centro de fotocopiado
public class Empleado {

    protected int id;
    protected String tipo_doc;
    protected String nro_doc;
    protected String nombres;
    protected String apellidos;
    protected String telefono;
    protected String fecha_ingreso;
    protected String rol;  // "ADMINISTRADOR" o "OPERADOR"

    private static int contador = 1;

    public Empleado() {
        this.id = contador;
        contador++;
    }

    public String getNombreCompleto() {
        return this.nombres + " " + this.apellidos;
    }

    public void verDatos() {
        System.out.println("EMPLEADO ID: " + this.id
                + " TIPODOC: " + this.tipo_doc
                + " NRODOC: " + this.nro_doc
                + " NOMBRE: " + this.nombres
                + " APELLIDOS: " + this.apellidos);
        System.out.println("    TEL: " + this.telefono
                + " INGRESO: " + this.fecha_ingreso
                + " ROL: " + this.rol);
    }

    // Getters y Setters
    public int getId() { return id; }

    public String getTipo_doc() { return tipo_doc; }
    public void setTipo_doc(String tipo_doc) { this.tipo_doc = tipo_doc; }

    public String getNro_doc() { return nro_doc; }
    public void setNro_doc(String nro_doc) { this.nro_doc = nro_doc; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getFecha_ingreso() { return fecha_ingreso; }
    public void setFecha_ingreso(String fecha_ingreso) { this.fecha_ingreso = fecha_ingreso; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}
