package Creacionales.Prototype;

public class Enemigo {
    private String imagen;
    private int posx;
    private int posy;
    private int cantidadVida;

    public Enemigo(String imagen, int posx, int posy, int cantidadVida) {
        this.setImagen(imagen);
        this.setPosx(posx);
        this.setPosy(posy);
        this.setCantidadVida(cantidadVida);
    }

    public Enemigo(Enemigo enemigo){
        this.setImagen(enemigo.getImagen());
        this.setPosx(enemigo.getPosx());
        this.setPosy(enemigo.getPosy());
        this.setCantidadVida(enemigo.getCantidadVida());
    }

    public  Enemigo clone(){
        //return new Enemigo( this);
        return new Enemigo(this.imagen,this.posx, this.posy, this.cantidadVida);
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

    public int getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }
}
