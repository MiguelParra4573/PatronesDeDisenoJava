package Estructurales.Flyweight;

public class Nube {
    private TipoDeNube tipo;
    private String imagen;
    private int posx;
    private int posy;

    public Nube(TipoDeNube tipo, String imagen, int posx, int posy) {
        this.tipo = tipo;
        this.imagen = imagen;
        this.posx = posx;
        this.posy = posy;
    }

    public TipoDeNube getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeNube tipo) {
        this.tipo = tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
}
