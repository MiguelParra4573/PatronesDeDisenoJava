package Creacionales.AbstractFactory;

public class AppleStore implements IAbstractFactory{

    public IComputadora crearComputadora(){
        return new MacPro();
    }

    public  ITablet crearTablet(){
        return new IPad();
    }


}
