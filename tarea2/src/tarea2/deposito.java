package tarea2;
import java.util.ArrayList;

class Deposito {
    private ArrayList<Bebida> a;

    public Deposito() {
        a = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida b) {
        a.add(b);
    }

    public Bebida getBebida() {
        if(a.size() == 0) {
            return null;
        } else {
            return a.remove(0);
        }
    }
}
