package tarea2;

import java.security.NoSuchAlgorithmException;
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

        if(m == null) {
            throw new PagoIncorrectoException();
        }
        else if(m.getValor() < precio) {
            throw new PagoInsuficienteException();
        }
        else {
            switch(num) {
                case 1: // cocacola
                    if(coca.getSize() == 0) {
                        throw new NoHayBebidaException();
                    }
                    return coca.getBebida();
                    
                case 2: // sprite
                    if(sprite.size() == 0) {
                        throw new NoHayBebidaException();
                    }
                    return sprite.getBebida();
                
                case 3: // fanta
                    if(fanta.getSize() == 0) {
                        throw new NoHayBebidaException();
                    }
                    return fanta.getBebida();
                
                default:
                    throw new NoHayBebidaException();
            }
        }
    }

    public Moneda getVuelto() {
        return vuelto.getMoneda();
    }
}
