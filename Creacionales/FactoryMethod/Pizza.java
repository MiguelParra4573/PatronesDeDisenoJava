package Creacionales.FactoryMethod;

public class Pizza {
    private int cantidadRevanadas;
    private String especialidad;
    public Pizza(int cantidadRevanadas, String especialidad){
        this.cantidadRevanadas = cantidadRevanadas;
        this.especialidad = especialidad;
    }
    public String toString(){
        return "Cantidad de revanadas: " + this.cantidadRevanadas + "Especialidad: " + this.especialidad;
    }
}
