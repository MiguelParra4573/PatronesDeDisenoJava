package Estructurales.Decorator;

public class PizzaPeperoni implements IPizza{
    public String descripcion(){
        return "Pizza peperoni";
    }

    public float precio(){
        return 8;
    }
}