package tarea2;

abstract class Bebida {
    private int serie;

    public Bebida(int s) {
        serie = s;
    }

    public int getSerie() {
        return serie;
    }

    public String beber() {
        return "sabor: ";
    }
}
