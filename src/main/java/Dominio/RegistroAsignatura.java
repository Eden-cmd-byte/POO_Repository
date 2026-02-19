package dominio;

public class RegistroAsignatura {
    // Requerimientos: representar una asignatura con nombre y profesor.
    private String nombreAsignatura;
    private String profesor;

    // Diseño: constructor que inicializa los atributos.
    public RegistroAsignatura(String nombreAsignatura, String profesor) {
        this.nombreAsignatura = nombreAsignatura;
        this.profesor = profesor;
    }

    // Implementación: método para mostrar información de la asignatura.
    public void mostrarInfo() {
        System.out.println("Asignatura: " + nombreAsignatura + " impartida por " + profesor);
    }

    // Pruebas: se validará en Main que imprime correctamente la información.
    // Mantenimiento: se puede ampliar con atributos como créditos o horario.
}