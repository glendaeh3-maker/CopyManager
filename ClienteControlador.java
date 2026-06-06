package com.mycompany.copymanager;

import java.util.ArrayList;

// Controlador de clientes
public class ClienteControlador {

    ArrayList<Cliente> lista = new ArrayList();

    public void agregar_cliente(Cliente nuevo) {
        lista.add(nuevo);
    }

    public void listar_clientes() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).verDatos();
        }
    }

    // Busca cliente por id
    public Cliente buscar_por_id(int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return lista.get(i);
            }
        }
        System.out.println("No se encontro cliente con ID: " + id);
        return null;
    }

    // Busca cliente por nombre
    public Cliente buscar_por_nombre(String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombreCompleto().toLowerCase().contains(nombre.toLowerCase())) {
                return lista.get(i);
            }
        }
        System.out.println("No se encontro cliente con nombre: " + nombre);
        return null;
    }

    // Elimina cliente por id (solo si no tiene pedidos activos)
    public boolean eliminar_cliente(int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }

    public int total() {
        return lista.size();
    }
}
