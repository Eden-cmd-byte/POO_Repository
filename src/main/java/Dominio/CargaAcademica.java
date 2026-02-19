/*

Ejemplo de carga academica para el ITESS

*/


package dominio;

import java.util.ArrayList;

public class CargaAcademica {
    // Requerimientos: representar la carga académica de un semestre con varias asignaturas.
    private ArrayList<RegistroAsignatura> asignaturas;

    // Diseño: inicializar la lista de asignaturas en el constructor.
    public CargaAcademica() {
        asignaturas = new ArrayList<>();
    }

    // Implementación: método para agregar asignaturas.
    public void agregarAsignatura(RegistroAsignatura asignatura) {
        asignaturas.add(asignatura);
    }

    // Implementación: método para mostrar todas las asignaturas de la carga.
    public void mostrarCarga() {
        System.out.println("Carga académica:");
        for (RegistroAsignatura a : asignaturas) {
            a.mostrarInfo();
        }
    }

    // Pruebas: se validará en Main que las asignaturas se agregan y muestran correctamente.
    // Mantenimiento: se puede ampliar con atributos como semestre, promedio o créditos totales.
}