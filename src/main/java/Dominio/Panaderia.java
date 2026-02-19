package dominio;

public class Panaderia {
    // Requerimientos: representar una panadería con nombre y especialidad.
    private String nombre;
    private String especialidad;

    // Diseño: constructor que inicializa los atributos.
    public Panaderia(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Implementación: método para mostrar información de la panadería.
    public void mostrarInfo() {
        System.out.println("Panadería " + nombre + " especializada en " + especialidad);
    }

    // Pruebas: se validará en Main que imprime correctamente la información.
    // Mantenimiento: se puede ampliar con atributos como horario o lista de productos.
}