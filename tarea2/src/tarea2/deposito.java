package tarea2;
import java.util.ArrayList;

class Deposito {
    private ArrayList<Bebida> stock;

    public Deposito() {
        stock = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida b) {
        stock.add(b);
    }

    public Bebida getBebida() {
        if(stock.size() == 0) {
            return null;
        } else {
            return stock.remove(0);
        }
    }
}
