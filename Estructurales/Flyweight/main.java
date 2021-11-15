package Estructurales.Flyweight;

public class main {
    public static void main(String[] args) {

        NubeFactory factory = new NubeFactory();

        for (int x=0; x<100; x++){
            Nube nube = factory.getNube(TipoDeNube.Chica);
        }
        for (int x=0; x<200; x++){
            Nube nube = factory.getNube(TipoDeNube.Mediana);
        }
        for (int x=0; x<300; x++){
            Nube nube = factory.getNube(TipoDeNube.Grande);
        }
        System.out.println(factory.countNubesMap());
    }
}
