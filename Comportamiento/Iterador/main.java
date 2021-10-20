package Comportamiento.Iterador;

public class main {
    public static void main(String[] args) {
        GuiaTelefonica guia = new GuiaTelefonica();

        guia.add("123");
        guia.add("123");
        guia.add("123");
        guia.add("123");
        guia.add("123");

        IIterador iterador = new ITeradorGuia(guia);

        while ((iterador.contieneSiguiente())){
            System.out.println(iterador.siguiente());
        }

    }
}
