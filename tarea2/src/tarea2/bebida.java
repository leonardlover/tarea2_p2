package tarea2;

abstract class Bebida {
    public Bebida() {
        super();
    }

    public String beber() {
        return "sabor: ";
    }
}

class Sprite extends Bebida {
    public Sprite() {
        super();
    }
    public String beber() {
        return super.beber() + "Sprite";
    }
}

class Cocacola extends Bebida {
    public Cocacola() {
        super();
    }
    public String beber() {
        return super.beber() + "CocaCola";
    }
}

class Fanta extends Bebida {
    public Fanta() {
        super();
    }
    public String beber() {
        return super.beber() + "Fanta";
    }
}