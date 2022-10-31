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

        vuelto = new DepositoVuelto();

        precio = 100 * precioBebidas; // debe ser un multiplo de 100

        for(int i = 0; i < numBebidas; i++) {
            coca.addBebida(new CocaCola(100 + i));
            sprite.addBebida(new Sprite(200 + i));
            fanta.addBebida(new Fanta(300 + i));
        }
    }

    public Bebida comprarBebida(Moneda m, int cual) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        if (m == null) {
            throw new PagoIncorrectoException();
        }
        else if (m.getValor() < precio) {
            vuelto.addMoneda(m);
            throw new PagoInsuficienteException();
        }
        else {
            switch (cual) {
                case 1: // cocacola
                    if (coca.getSize() == 0) {
                        vuelto.addMoneda(m);
                        throw new NoHayBebidaException();
                    }

                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                        vuelto.addMoneda(new Moneda100());
                    }

                    return coca.getBebida();
                    
                case 2: // sprite
                    if (sprite.getSize() == 0) {
                        vuelto.addMoneda(m);
                        throw new NoHayBebidaException();
                    }

                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                        vuelto.addMoneda(new Moneda100());
                    }

                    return sprite.getBebida();
                
                case 3: // fanta
                    if (fanta.getSize() == 0) {
                        vuelto.addMoneda(m);
                        throw new NoHayBebidaException();
                    }

                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                        vuelto.addMoneda(new Moneda100());
                    }

                    return fanta.getBebida();
                
                default:
                    vuelto.addMoneda(m);
                    throw new NoHayBebidaException();
            }
        }
    }

    public Moneda getVuelto() {
        return vuelto.getMoneda();
    }
}
