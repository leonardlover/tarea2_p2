package tarea2;

class Fanta extends Bebida {
    public Fanta(int s) {
        super(s);
    }
    public String beber() {
        return super.beber() + "Fanta";
    }
}
