package tarea2;

class Comprador {
    private String sabor;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida b = exp.comprarBebida(m, cualBebida);
        Moneda n;

        if (b != null) {
            sabor = b.beber();
            vuelto = 0;

            n = exp.getVuelto();
            while (n != null) {
                vuelto += n.getValor();
                n = exp.getVuelto();
            }
        }
        else {
            n = exp.getVuelto();
            if (n != null) {
                vuelto = n.getValor();
            }
        }
    }

    public String getSabor() {
        return sabor;
    }

    public int getVuelto() {
        return vuelto;
    }
}
