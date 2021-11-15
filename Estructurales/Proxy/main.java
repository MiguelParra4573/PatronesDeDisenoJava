package Estructurales.Proxy;

public class main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(5);

        IServicio servicio = new ProxyServicio(new Servicio(),usuario);

        servicio.escribir();
        servicio.leer();
        servicio.actualizar();
        servicio.eliminar();
    }
}
