package tarea2;

import java.util.ArrayList;

class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;

    private DepositoVuelto vuelto;

    private int precio;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();

        precio = 100 * precioBebidas; // debe ser un multiplo de 100

        for(int i = 0; i < numBebidas; i++) {
            coca.addBebida(new CocaCola(100 + i));
            sprite.addBebida(new Sprite(200 + i));
            fanta.addBebida(new Fanta(300 + i));
        }
    }

    public Bebida comprarBebida(Moneda m, int cual) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
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

    public Moneda getVuelto() {
        return vuelto.getMoneda();
    }
}
