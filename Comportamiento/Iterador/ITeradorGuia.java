package Comportamiento.Iterador;

public class ITeradorGuia implements IIterador {

    private GuiaTelefonica guia;
    private int posicion;

    public ITeradorGuia(GuiaTelefonica guia) {
        this.guia = guia;
    }

    public String siguiente(){
        return this.guia.getNumero().get(this.posicion++);
    }
    public boolean contieneSiguiente(){
        return this.posicion < this.guia.getNumero().size() && this.guia.getNumero().get(this.posicion) != null;
    }

}
