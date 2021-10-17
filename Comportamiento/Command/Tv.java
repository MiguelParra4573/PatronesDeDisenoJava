package Comportamiento.Command;

public class Tv implements IDevise {

    private boolean on;
    public Tv(){
        this.on = false;
    }
    public void on(){
        this.on = true;
        System.out.println("Tv encendida!");
    }

    public void off(){
        this.on   = true;
        System.out.println("Tv apagada!");
    }
}
