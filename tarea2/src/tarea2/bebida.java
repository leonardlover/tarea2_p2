package tarea2;

abstract class Bebida {
    public abstract String beber();
}

class Sprite extends Bebida {
    public Sprite() {
        super();
    }
    public String beber() {
        return "Sprite";
    }
}

class Cocacola extends Bebida {
    public Cocacola() {
        super();
    }
    public String beber() {
        return "CocaCola";
    }
}

class Fanta extends Bebida {
    public Fanta() {
        super();
    }
    public String beber() {
        return "Fanta";
    }
}