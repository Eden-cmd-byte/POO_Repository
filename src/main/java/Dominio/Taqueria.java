package dominio;

public class Taqueria {
    // Fase de Requerimientos: necesitamos representar una taquería con nombre, dirección y número de mesas.
    private String nombre;
    private String direccion;
    private int numeroDeMesas;

    // Fase de Diseño: definimos un constructor para inicializar los atributos.
    public Taqueria(String nombre, String direccion, int numeroDeMesas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroDeMesas = numeroDeMesas;
    }

    // Fase de Implementación: método para mostrar información de la taquería.
    public void mostrarInfo() {
        System.out.println("Taquería: " + nombre + " ubicada en " + direccion);
    }

    // Fase de Pruebas: este método se probará en la clase Main para verificar que imprime correctamente.
    // Fase de Mantenimiento: si se agregan nuevos atributos (ej. menú), se actualizará aquí.
}