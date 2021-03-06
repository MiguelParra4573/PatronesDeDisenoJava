package Estructurales.VirtualProxy;

public class ProxyServicio implements IServicio {

    private IServicio servicio;
    private Usuario usuario;

    public ProxyServicio(Usuario usuario) {
        this.usuario = usuario;
    }
    public void leer(){
        this.obtenerServicio().leer();
    }
    public void escribir(){
        this.obtenerServicio().escribir();
    }
    public void actualizar(){
        this.obtenerServicio().actualizar();
    }
    public void eliminar(){
        this.obtenerServicio().eliminar();
    }
    private IServicio obtenerServicio(){
        if(this.servicio == null){
            this.servicio = new Servicio();
        }
        return this.servicio;
    }

}
