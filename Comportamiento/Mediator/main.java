package Comportamiento.Mediator;

public class main {
    public static void main(String[] args) {
        Usuario eduardo = new Usuario("Eduador");
        Usuario codi = new Usuario("codi");

        SalaChat sala = new SalaChat();
        sala.addParticipante(eduardo);
        sala.addParticipante(codi);
        sala.enviarMensaje(eduardo,codi, "Hola desde el curso de patrones de diseño");
    }
}