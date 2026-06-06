package com.mycompany.copymanager;

import java.util.ArrayList;

// Controlador de pedidos y planilla de ventas
public class PedidoControlador {

    ArrayList<Pedido> lista = new ArrayList();

    public void agregar_pedido(Pedido nuevo) {
        nuevo.setEstado("COMPLETADO");
        lista.add(nuevo);
    }

    public void listar_pedidos() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).verDatos();
        }
    }

    // Busca pedido por id
    public Pedido buscar_por_id(int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return lista.get(i);
            }
        }
        System.out.println("No se encontro pedido con ID: " + id);
        return null;
    }

    // Muestra la planilla de ventas del dia - igual que mostrar_planilla en GlobalTec
    public void mostrar_planilla_ventas() {
        System.out.println("====== PLANILLA DE VENTAS - COPY MANAGER ======");
        double total_general = 0;
        for (int i = 0; i < lista.size(); i++) {
            Pedido p = lista.get(i);
            total_general += p.getTotal();
            String cliente_nombre = (p.getCliente() != null)
                    ? p.getCliente().getNombreCompleto() : "Anonimo";
            System.out.println("Pedido #" + p.getId()
                    + " | CLIENTE: " + cliente_nombre
                    + " | DESCUENTO: S/ " + p.getDescuento()
                    + " | TOTAL: S/ " + p.getTotal());
        }
        System.out.println("TOTAL GENERAL: S/ " + total_general);
        System.out.println("===============================================");
    }

    public int total() {
        return lista.size();
    }
}
