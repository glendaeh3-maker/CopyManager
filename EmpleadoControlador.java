package com.mycompany.copymanager;

import java.util.ArrayList;

// Controlador de empleados
public class EmpleadoControlador {

    ArrayList<Empleado> lista = new ArrayList();

    public void agregar_empleado(Empleado nuevo) {
        lista.add(nuevo);
    }

    public void listar_empleados() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).verDatos();
        }
    }

    // Busca empleado por nro_doc
    public Empleado buscar_por_doc(String nro_doc) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNro_doc().equals(nro_doc)) {
                return lista.get(i);
            }
        }
        System.out.println("No se encontro empleado con doc: " + nro_doc);
        return null;
    }

    public int total() {
        return lista.size();
    }
}
