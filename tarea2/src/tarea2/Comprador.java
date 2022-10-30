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

            while ((n = exp.getVuelto()) != null) {
                vuelto += n.getValor();
            }
        }
        else {
            if ((n = exp.getVuelto()) != null) {
                vuelto = n.getValor();
            }
        }
    }

    public String getSabor() {
        return sabor;
    }

    public int getVuelo() {
        return vuelto;
    }
}
