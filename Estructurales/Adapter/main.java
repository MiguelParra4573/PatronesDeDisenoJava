package Estructurales.Adapter;

public class main {
    public static void main(String[] args) {
         IConexionSQL conexion = new AdaptadorDB(new ConexionMongoDB());
         conexion.conexion();
         String result = conexion.runQuery();
        System.out.println(result);
    }
}
