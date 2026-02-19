package dominio;

import java.util.ArrayList;

public class carrito {
    // Requerimientos: representar un carrito con productos.
    private ArrayList<String> productos;

    // Diseño: inicializamos la lista en el constructor.
    public carrito() {
        productos = new ArrayList<>();
    }

    // Implementación: método para agregar productos.
    public void agregarProducto(String producto) {
        productos.add(producto);
    }

    // Implementación: método para mostrar productos.
    public void mostrarCarrito() {
        System.out.println("Productos en el carrito: " + productos);
    }

    // Pruebas: se validará en Main que los productos se agregan y muestran correctamente.
    // Mantenimiento: se podría extender para manejar precios o cantidades.
}