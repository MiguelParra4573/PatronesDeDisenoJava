package Creacionales.FactoryMethod;

public class main {
    public static void main(String[] args) {
        Pizzeria cf = new Pizzeria();
        Pizza peperoni = cf.crearPizza("Peperoni");
        Pizza hawaiana = cf.crearPizza("Hawaiana");
        Pizza orillaRellena = cf.crearPizza("Peperoni orilla rellena");
        System.out.println("peperoni = " + peperoni);
        System.out.println("hawaiana = " + hawaiana);
        System.out.println("orillaRellena = " + orillaRellena);
    }

}
