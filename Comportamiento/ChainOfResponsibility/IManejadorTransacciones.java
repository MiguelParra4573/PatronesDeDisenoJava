package Comportamiento.ChainOfResponsibility;

public interface IManejadorTransacciones {

    void setNextMAnejador(IManejadorTransacciones next);
    void ejecutarTransaccion(Transaccion transaccion);

}
