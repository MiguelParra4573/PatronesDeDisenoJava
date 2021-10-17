package Comportamiento.ChainOfResponsibility;

public class Reembolso implements IManejadorTransacciones{
    private IManejadorTransacciones next;

    @Override
    public void setNextMAnejador(IManejadorTransacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {
        if(transaccion.getTipoTransaccion() == TipoTransaccion.Reembolso ){
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El nuevo balance despues de un reembolos es :" + cantidad);
        }else{
            System.out.println("Operacion no valida");
        }
    }

}
