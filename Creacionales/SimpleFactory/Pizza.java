package Creacionales.SimpleFactory;

public class Pizza {
    private int cantidadRevanadas;
    public Pizza(int cantidadRevanadas){
        this.cantidadRevanadas = cantidadRevanadas;
    }
    public String toString(){
        return "Cantidad de revanadas: " + this.cantidadRevanadas;
    }
}
