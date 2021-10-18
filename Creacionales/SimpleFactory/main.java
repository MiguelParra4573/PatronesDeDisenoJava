package Creacionales.SimpleFactory;

public class main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria();

        Pizza pizza = pizzeria.crearPizzaChica();
        System.out.println(pizza);
    }
}
