package Comportamiento.Visitor;

public class Manzana implements IFruta, IVisitor{
    public float getPrecio(){
        return 2f;
    }
    public float aplicarDescuento(IVisitor visitor){
        return  visitor.descuento(this);
    }
}
