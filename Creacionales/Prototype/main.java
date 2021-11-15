package Creacionales.Prototype;

public class main {
    public static void main(String[] args) {
        Enemigo enemigoBase = new Enemigo("Image.png",0,100,2);

        Enemigo enemigo1 = new Enemigo(enemigoBase);
        Enemigo enemigo2 = new Enemigo(enemigoBase);
        Enemigo enemigo3 = new Enemigo(enemigoBase);

        enemigo1.setPosx(100);
        enemigo2.setPosx(125);
        enemigo3.setPosx(150);

        Enemigo enemigoBase2 = new Enemigo("Image.png",0,200,2);

        Enemigo enemigo4 = enemigoBase2.clone();
        Enemigo enemigo5 = enemigoBase2.clone();
        Enemigo enemigo6 = enemigoBase2.clone();

        enemigo4.setPosx(100);
        enemigo5.setPosx(125);
        enemigo6.setPosx(150);


    }
}
