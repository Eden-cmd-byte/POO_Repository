public class Orden {
    // Atributos privados según el UML
    private Pedido pedido;
    private int prioridad;
    private boolean pago;
    private String estatus; // Puede ser "cocina" o "pago"

    // Constructor
    public Orden(Pedido pedido, int prioridad, boolean pago, String estatus) {
        this.pedido = pedido;
        this.prioridad = prioridad;
        this.pago = pago;
        this.estatus = estatus;
    }

    // Getters y Setters
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Orden [" +
               "Usuario: " + pedido.getNombreDeUsuario() + 
               ", Torta: " + pedido.getNombreDeTorta() +
               ", Prioridad: " + prioridad + 
               ", Pagado: " + (pago ? "Sí" : "No") + 
               ", Estatus: " + estatus + 
               "]";
    }
}