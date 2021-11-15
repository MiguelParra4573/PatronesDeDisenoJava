package Comportamiento.Visitor;

public class Lavadora implements ILineaBlanca, IVisitor{
    public float getPrecio(){
        return 20f;
    }
    public float aplicarDescuento(IVisitor visitor){
        return  visitor.descuento(this);
    }
}
