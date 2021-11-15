package Creacionales.Singleton;

public class mian {
    public static void main(String[] args) {
        ConexionDB conexcion = ConexionDB.obtenerConexion();

        conexcion.host ="localHost";

        System.out.println(conexcion.hashCode());
    }
}
