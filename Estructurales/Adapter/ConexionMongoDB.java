package Estructurales.Adapter;

public class ConexionMongoDB implements IConexionNoSQL{
    public void conexion(){
        System.out.println("Conexion con MongoDB");
    }
    public String excecuteSentence(){
        return "Consulta MongoDB";
    }
}
