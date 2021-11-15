package Comportamiento.TemplateMethod;

public class main {
    public static void main(String[] args) {
        Usuario gerente = new Gerente();
        Usuario administrador = new Administrador();

        gerente.autenticacion();
        gerente.formaTrabajar();

    }
}
