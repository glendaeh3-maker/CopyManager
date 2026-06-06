package com.mycompany.copymanager;

// Aqui ejecutamos todo el codigo ya hecho

public class CopyManager {

    public static void main(String[] args) {

        // ---- SERVICIOS ----
        ServicioFotocopiado sfc1 = new ServicioFotocopiado();
        sfc1.setCodigo("SFC001");
        sfc1.setNombre("Fotocopia B/N");
        sfc1.setModalidad("B/N");

        ServicioFotocopiado sfc2 = new ServicioFotocopiado();
        sfc2.setCodigo("SFC002");
        sfc2.setNombre("Fotocopia Color");
        sfc2.setModalidad("COLOR");

        ServicioImpresion sim1 = new ServicioImpresion();
        sim1.setCodigo("SIM001");
        sim1.setNombre("Impresion B/N");
        sim1.setTipo("B/N");

        ServicioEscaneo ses1 = new ServicioEscaneo();
        ses1.setCodigo("SES001");
        ses1.setNombre("Escaneo");

        ServicioEmpastado sem1 = new ServicioEmpastado();
        sem1.setCodigo("SEM001");
        sem1.setNombre("Empastado Espiral");
        sem1.setTipo_empaste("ESPIRAL");

        ServicioPlastificado spl1 = new ServicioPlastificado();
        spl1.setCodigo("SPL001");
        spl1.setNombre("Plastificado");

        // ---- CLIENTES ----
        Cliente cli1 = new Cliente();
        cli1.setNombres("Juan");
        cli1.setApellidos("Perez Quispe");
        cli1.setTelefono("987654321");

        Cliente cli2 = new Cliente();
        cli2.setNombres("Maria");
        cli2.setApellidos("Lopez Torres");
        cli2.setTelefono("912345678");

        // Cliente frecuente con descuento del 5%
        ClienteFrecuente cli3 = new ClienteFrecuente();
        cli3.setNombres("Carlos");
        cli3.setApellidos("Ramirez Diaz");
        cli3.setTelefono("955123456");
        cli3.setPuntos_fidelidad(150);

        ClienteControlador ctrl_clientes = new ClienteControlador();
        ctrl_clientes.agregar_cliente(cli1);
        ctrl_clientes.agregar_cliente(cli2);
        ctrl_clientes.agregar_cliente(cli3);

        System.out.println("===== LISTA DE CLIENTES =====");
        ctrl_clientes.listar_clientes();

        // ---- EMPLEADOS ----
        Empleado emp1 = new Empleado();
        emp1.setTipo_doc("DNI");
        emp1.setNro_doc("10203040");
        emp1.setNombres("Ana");
        emp1.setApellidos("Torres Vega");
        emp1.setTelefono("976543210");
        emp1.setFecha_ingreso("01/03/2020");
        emp1.setRol("ADMINISTRADOR");

        Empleado emp2 = new Empleado();
        emp2.setTipo_doc("DNI");
        emp2.setNro_doc("50607080");
        emp2.setNombres("Luis");
        emp2.setApellidos("Quispe Llanos");
        emp2.setTelefono("934567890");
        emp2.setFecha_ingreso("15/08/2023");
        emp2.setRol("OPERADOR");

        EmpleadoControlador ctrl_empleados = new EmpleadoControlador();
        ctrl_empleados.agregar_empleado(emp1);
        ctrl_empleados.agregar_empleado(emp2);

        System.out.println("\n===== LISTA DE EMPLEADOS =====");
        ctrl_empleados.listar_empleados();

        // ---- INSUMOS ----
        Insumo ins1 = new Insumo();
        ins1.setCodigo("INS001");
        ins1.setNombre("Papel A4 Bond");
        ins1.setUnidad("hojas");
        ins1.setStock_actual(500);
        ins1.setStock_minimo(100);

        Insumo ins2 = new Insumo();
        ins2.setCodigo("INS002");
        ins2.setNombre("Toner Negro");
        ins2.setUnidad("unidad");
        ins2.setStock_actual(2);
        ins2.setStock_minimo(3); // stock bajo a proposito para ver la alerta

        Insumo ins3 = new Insumo();
        ins3.setCodigo("INS003");
        ins3.setNombre("Cartucho Color");
        ins3.setUnidad("unidad");
        ins3.setStock_actual(4);
        ins3.setStock_minimo(2);

        InsumoControlador ctrl_insumos = new InsumoControlador();
        ctrl_insumos.agregar_insumo(ins1);
        ctrl_insumos.agregar_insumo(ins2);
        ctrl_insumos.agregar_insumo(ins3);

        System.out.println("\n===== INVENTARIO =====");
        ctrl_insumos.listar_insumos();
        System.out.println();
        ctrl_insumos.mostrar_alertas();

        // ---- PEDIDOS ----

        // Pedido 1: cliente normal, fotocopias B/N + empastado
        DetallePedido det1 = new DetallePedido();
        det1.setServicio(sfc1);
        det1.setCantidad(50); // 50 paginas B/N

        DetallePedido det2 = new DetallePedido();
        det2.setServicio(sem1);
        det2.setCantidad(1); // 1 empastado espiral

        Pedido ped1 = new Pedido();
        ped1.setFecha("06/06/2026");
        ped1.setCliente(cli1);
        ped1.agregarDetalle(det1);
        ped1.agregarDetalle(det2);

        // Pedido 2: cliente frecuente (descuento 5%), impresion + escaneo
        DetallePedido det3 = new DetallePedido();
        det3.setServicio(sim1);
        det3.setCantidad(20); // 20 paginas impresion B/N

        DetallePedido det4 = new DetallePedido();
        det4.setServicio(ses1);
        det4.setCantidad(5); // 5 paginas escaneo

        Pedido ped2 = new Pedido();
        ped2.setFecha("06/06/2026");
        ped2.setCliente(cli3); // cliente frecuente -> 5% descuento
        ped2.agregarDetalle(det3);
        ped2.agregarDetalle(det4);

        // Pedido 3: cliente anonimo, fotocopias color
        DetallePedido det5 = new DetallePedido();
        det5.setServicio(sfc2);
        det5.setCantidad(10); // 10 paginas color

        Pedido ped3 = new Pedido();
        ped3.setFecha("06/06/2026");
        // sin cliente (anonimo)
        ped3.agregarDetalle(det5);

        PedidoControlador ctrl_pedidos = new PedidoControlador();
        ctrl_pedidos.agregar_pedido(ped1);
        ctrl_pedidos.agregar_pedido(ped2);
        ctrl_pedidos.agregar_pedido(ped3);

        System.out.println("\n===== LISTA DE PEDIDOS =====");
        ctrl_pedidos.listar_pedidos();

        // Busqueda de pedido
        System.out.println("\nBusqueda de pedido por ID:");
        Pedido encontrado = ctrl_pedidos.buscar_por_id(2);
        if (encontrado != null) {
            encontrado.verDatos();
        }

        // Planilla de ventas - igual que mostrar_planilla en GlobalTec
        System.out.println();
        ctrl_pedidos.mostrar_planilla_ventas();

        // Descuenta papel del inventario segun pedidos
        ins1.consumir(50 + 20); // paginas de fotocopiado + impresion
        System.out.println("\n===== INVENTARIO ACTUALIZADO =====");
        ctrl_insumos.listar_insumos();
    }
}
