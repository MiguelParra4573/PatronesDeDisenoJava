package Comportamiento.State;

public class Manejar implements IEstadoAuto{
    private final Auto auto;

    public Manejar(Auto auto){
        this.auto = auto;
    }

    public void encender(){
        System.out.println("El auto ya esta encendido");
    }
    public void manejar(){
        System.out.println("El auto se esta manejando");
    }
    public void apagar(){
        System.out.println("El auto  esta apagado");
        auto.setEstadoActual(auto.getAutoApagado());
    }
}
