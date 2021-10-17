package Comportamiento.ChainOfResponsibility;

public class main {
    public static void main(String[] args) {

        Transaccion transaccion = new Transaccion(100, 200, TipoTransaccion.Deposito);

        IManejadorTransacciones deposito = new Deposito();
        IManejadorTransacciones retiro = new Retiro();
        IManejadorTransacciones reembolso = new Reembolso();

        deposito.setNextMAnejador(retiro);
        retiro.setNextMAnejador(reembolso);

        deposito.ejecutarTransaccion(transaccion);

    }
}
