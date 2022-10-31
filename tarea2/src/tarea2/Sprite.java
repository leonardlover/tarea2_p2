package tarea2;

class Sprite extends Bebida {
    public Sprite(int s) {
        super(s);
    }
    public String beber() {
        return super.beber() + "Sprite";
    }
}
