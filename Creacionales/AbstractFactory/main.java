package Creacionales.AbstractFactory;

public class main {
    public static void main(String[] args) {
        SamsungStore samsung = new SamsungStore();
        AppleStore apple = new AppleStore();

        IComputadora mac = apple.crearComputadora();
        ITablet ipad = apple.crearTablet();

        IComputadora qx = samsung.crearComputadora();
        ITablet s3 = samsung.crearTablet();
    }
}
