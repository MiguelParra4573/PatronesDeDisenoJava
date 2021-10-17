package Comportamiento.Command;

public class main {
    public static void main(String[] args) {
        IDevise tv = new Tv();

        ICommand on = new OnDevice(tv);
        ICommand off = new OffDevice(tv);

        on.operacion();
        off.operacion();

    }
}
