public class Pedido {
    private Usuario usuario;
    private Torta torta;

    public Pedido(Usuario usuario, Torta torta) {
        this.usuario = usuario;
        this.torta = torta;
    }

    public String getNombreDeUsuario() {
        return (usuario != null) ? usuario.getNombre() : "Sin usuario";
    }

    public String getNombreDeTorta() {
        return (torta != null) ? torta.getNombre() : "Sin torta";
    }

    public float getPrecio() {
        // Asumimos que el precio viene del objeto Torta
        return (torta != null) ? 0.0f : 0.0f; // Aquí podrías retornar torta.getPrecio() si añades el getter en Torta
    }
}