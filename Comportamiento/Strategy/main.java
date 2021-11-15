package Comportamiento.Strategy;

public class main {
    public static void main(String[] args) {
        Transaccion transaccion = new Transaccion(new Deposito());
        System.out.println(transaccion.ejecutarTransaccion(100,20));

        Transaccion transaccion2 = new Transaccion(new Retiro());
        System.out.println(transaccion2.ejecutarTransaccion(10,200));
    }
}
