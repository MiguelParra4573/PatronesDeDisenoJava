package Comportamiento.Visitor;

public class main {
    public static void main(String[] args) {
        Manzana manzana = new Manzana();
        Lavadora lavadora = new Lavadora();
        IVisitor descuento = new DescuentoComun();
        System.out.println(manzana.aplicarDescuento(descuento));
        System.out.println(lavadora.aplicarDescuento(descuento));
    }
}
