package tarea2;
import java.util.ArrayList;

class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;

    public Expendedor(int cantidad, int precio) {
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();

        for(int i = 0; i < cantidad; i++) {
            Bebida b = new CocaCola(100+i);
            Bebida b2 = new Sprite(200+i);
            Bebida b3 = new Fanta(300+i);
            coca.addBebida(b);
            sprite.addBebida(b2);
            fanta.addBebida(b3);
        }
    }

    public Bebida comprarBebida(Moneda m, int num) {
        Bebida r = null;
        if(m != null && num == 1) { // convertirlo a un switch y usar ifs para manejar excepciones :)
            r = coca.getBebida();
        }
        else if(m != null && num == 2) {
            r = sprite.getBebida();
        }
        else if(m != null && num == 3) {
            r = fanta.getBebida();
        }
        return r;
    }
}
