package Comportamiento.Strategy;

public class Transaccion {
    private IEstrategia estrategia;

    public Transaccion(IEstrategia estrategia){
        this.estrategia = estrategia;
    }

    public float ejecutarTransaccion(float balace,float cantidad){
        return this.estrategia.realizarOperacion(balace, cantidad);
    }


}
