public class Main {
    public static void main(String[] args) {
        // 1. Creamos los ingredientes para nuestra torta
        String[] listaIngredientes = {"Jamón", "Queso Doble Crema", "Aguacate", "Chipotle"};

        // 2. Instanciamos la Torta (usando el constructor con todos los parámetros)
        Torta miTorta = new Torta("Torta Especial de la Casa", listaIngredientes, 95.50f);

        // 3. Creamos al Usuario que realiza la compra
        Usuario cliente = new Usuario("Fernando_ICT");

        // 4. Creamos el Pedido vinculando al Usuario con su Torta
        Pedido nuevoPedido = new Pedido(cliente, miTorta);

        // 5. Creamos la Orden para gestionar la logística (Prioridad alta, no pagado, en cocina)
        Orden miOrden = new Orden(nuevoPedido, 1, false, "cocina");

        // --- PRUEBAS DE SALIDA EN CONSOLA ---
        
        System.out.println("=== DETALLES DE LA ORDEN ===");
        System.out.println(miOrden.toString());
        
        System.out.println("\n--- Verificación de métodos específicos ---");
        System.out.println("Cliente: " + miOrden.getPedido().getNombreDeUsuario());
        System.out.println("Producto solicitado: " + miOrden.getPedido().getNombreDeTorta());
        System.out.println("Estatus actual: " + miOrden.getEstatus());

        // Ejemplo: Cambiando el estatus de la orden
        System.out.println("\nActualizando orden...");
        miOrden.setPago(true);
        miOrden.setEstatus("pago");

        System.out.println("¿Está pagado?: " + (miOrden.isPago() ? "Sí" : "No"));
        System.out.println("Nuevo estatus: " + miOrden.getEstatus());
    }
}