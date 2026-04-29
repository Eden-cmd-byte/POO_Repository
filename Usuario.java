public class Usuario {
    private String nombre;

    public Usuario() {}

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre;
    }
}