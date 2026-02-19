package dominio;

public class MercadoLibre {
    // Requerimientos: representar un usuario de MercadoLibre con nombre y correo.
    private String usuario;
    private String email;

    // Diseño: constructor que inicializa los atributos.
    public MercadoLibre(String usuario, String email) {
        this.usuario = usuario;
        this.email = email;
    }

    // Implementación: método para mostrar información del usuario.
    public void mostrarInfo() {
        System.out.println("Usuario: " + usuario + " con correo: " + email);
    }

    // Pruebas: se validará en Main que imprime correctamente los datos del usuario.
    // Mantenimiento: se puede ampliar con atributos como historial de compras o reputación.
}