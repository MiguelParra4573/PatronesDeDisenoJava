package Comportamiento.Memento;

public class main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Miguel", 21);

        Usuario memento = usuario.getMemento();

        usuario.setNombre("Mathyas");
        usuario.setEdad(9);

        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());

        usuario.restarMemento(memento);

        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());

    }
}
