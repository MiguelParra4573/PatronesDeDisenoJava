package Comportamiento.State;

public class main {
    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.apagar();
        auto.manejar();
        auto.apagar();
        auto.encender();
        auto.manejar();
        auto.apagar();



    }
}
