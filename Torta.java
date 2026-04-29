import java.util.Arrays;

public class Torta {
    private String nombre;
    private String[] ingredientes;
    private float precio;

    // Constructor vacío
    public Torta() {
        this.ingredientes = new String[0];
    }

    // Constructor con todos los parámetros
    public Torta(String nombre, String[] ingredientes, float precio) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    // Constructor solo con nombre
    public Torta(String nombre) {
        this.nombre = nombre;
        this.ingredientes = new String[0];
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar ingrediente (Redimensionando el arreglo)
    public void agregarIngrediente(String ingrediente) {
        if (this.ingredientes == null) {
            this.ingredientes = new String[]{ingrediente};
        } else {
            this.ingredientes = Arrays.copyOf(this.ingredientes, this.ingredientes.length + 1);
            this.ingredientes[this.ingredientes.length - 1] = ingrediente;
        }
    }

    @Override
    public String toString() {
        return "Torta: " + nombre + " | Precio: $" + precio + " | Ingredientes: " + Arrays.toString(ingredientes);
    }
}