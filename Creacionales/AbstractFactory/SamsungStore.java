package Creacionales.AbstractFactory;

public class SamsungStore implements IAbstractFactory{
    public IComputadora crearComputadora(){
        return new Qx410();
    }
    public ITablet crearTablet(){
        return new TabS3();
    }
}
