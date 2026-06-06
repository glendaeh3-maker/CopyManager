package com.mycompany.copymanager;

import java.util.ArrayList;

// Controlador del inventario de insumos
public class InsumoControlador {

    ArrayList<Insumo> lista = new ArrayList();

    public void agregar_insumo(Insumo nuevo) {
        lista.add(nuevo);
    }

    public void listar_insumos() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).verDatos();
        }
    }

    // Busca insumo por codigo
    public Insumo buscar_por_codigo(String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equals(codigo)) {
                return lista.get(i);
            }
        }
        System.out.println("No se encontro insumo con codigo: " + codigo);
        return null;
    }

    // Muestra solo los insumos que tienen stock bajo
    public void mostrar_alertas() {
        System.out.println("====== ALERTAS DE STOCK BAJO ======");
        int alertas = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).requiereAlerta()) {
                lista.get(i).verDatos();
                alertas++;
            }
        }
        if (alertas == 0) {
            System.out.println("  Sin alertas. Todo el stock esta OK.");
        }
        System.out.println("===================================");
    }
}
