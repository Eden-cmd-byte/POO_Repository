package dominio;

public class Main {
    public static void main(String[] args) {
        Taqueria t = new Taqueria("El Fogón", "Centro", 10);
        t.mostrarInfo();

        Panaderia p = new Panaderia("La Espiga", "Pan dulce");
        p.mostrarInfo();

        MercadoLibre usuario = new MercadoLibre("Felix123", "felix@mail.com");
        usuario.mostrarInfo();

        carrito carrito = new carrito();
        carrito.agregarProducto("Laptop");
        carrito.agregarProducto("Celular");
        carrito.mostrarCarrito();

        RegistroAsignatura mat = new RegistroAsignatura("Programación", "Ing. López");
        RegistroAsignatura etica = new RegistroAsignatura("Ética Profesional", "Mtra. Pérez");

        CargaAcademica carga = new CargaAcademica();
        carga.agregarAsignatura(mat);
        carga.agregarAsignatura(etica);
        carga.mostrarCarga();
    }
}