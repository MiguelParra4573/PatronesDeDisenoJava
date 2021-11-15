package Creacionales.SinfletonConcurrente;

public class main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexion = ConexionDB.obtenerConexion();
                conexion.hashCode();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexion = ConexionDB.obtenerConexion();
                conexion.hashCode();
            }
        });
        t1.start();
        t2.start();

    }
}
