package Comportamiento.Command;

public class OnDevice implements ICommand{

    private IDevise devise;

    public OnDevice(IDevise devise){
        this.devise = devise;
    }

    public void operacion(){
        this.devise.on();
    }
    }
