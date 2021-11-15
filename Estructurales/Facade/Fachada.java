package Estructurales.Facade;

public class Fachada {
    private Computadora computadora;

    public Fachada(){
        ITeclado teclado = new Teclado();
        IMouse mose = new Mause();
        this.computadora = new Computadora(teclado,mose);
    }

    public void encender(){

    }

}
