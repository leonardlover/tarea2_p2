package tarea2;
import java.util.ArrayList;

class DepositoVuelto {
    private ArrayList<Moneda> vuelto;

    public DepositoVuelto() {
        vuelto = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda m) {
        vuelto.add(m);
    }

    public Moneda getMoneda() {
        if (vuelto.size() == 0) {
            return null;
        } else {
            return vuelto.remove(0);
        }
    }
}
