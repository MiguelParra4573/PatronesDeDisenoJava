package Estructurales.Decorator;

public class main {
    public static void main(String[] args) {

        IPizza pizzaPeperoni = new QuesoExtra(new PizzaPeperoni());
        System.out.println("Descripcion = " + pizzaPeperoni.descripcion());
        System.out.println("Precio = " + pizzaPeperoni.precio());

        IPizza pizzaHawaiana = new QuesoExtra(new OrillaRellena(new PizzaHawaiana()));
        System.out.println("Descripcion = " + pizzaHawaiana.descripcion());
        System.out.println("Precio = " + pizzaHawaiana.precio());


    }
}
