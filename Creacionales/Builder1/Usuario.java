package Creacionales.Builder1;

public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;

    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = "";
        this.telefono = "";
        this.direccion = "";
    }

    public static Usuario Make( String nombre, String apellido){
        return new Usuario(nombre, apellido);
    }

    public String getDireccion() {
        return direccion;
    }

    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return  this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Usuario setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }
    public Usuario Buid(){
        return this;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
