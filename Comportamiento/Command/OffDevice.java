package Comportamiento.Command;

public class OffDevice implements ICommand{
    private IDevise devise;

    public OffDevice(IDevise devise){
        this.devise = devise;
    }

    public void operacion(){
        this.devise.off();
    }

}
