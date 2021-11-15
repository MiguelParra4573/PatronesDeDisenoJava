package Creacionales.Builder1;

public class main {
    public static void main(String[] args) {
        Usuario Mathyas = Usuario.Make("Mathyas","Parra")
                .setEmail("mathyas@gmail.com")
                .setTelefono("000-000-000")
                .setDireccion("Ecuador")
                .Buid();


        System.out.println(Mathyas);
    }
}
