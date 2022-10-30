package tarea2;

class CocaCola extends Bebida {
    public Cocacola(int s) {
        super(s);
    }
    public String beber() {
        return super.beber() + "CocaCola";
    }
}
