package Comportamiento.State;

public class Apagar implements IEstadoAuto{
    private final Auto auto;

    public Apagar(Auto auto){
        this.auto = auto;
    }

    public void encender(){
        System.out.println("El auto esta encendido");
        auto.setEstadoActual(auto.getAutoEncendido());

    }
    public void manejar(){
        System.out.println("El auto esta en movimiento");
        auto.setEstadoActual(auto.getAutoMovimiento());
    }
    public void apagar(){
        System.out.println("El auto ya esta apagado");
    }
}
