package tarea2;

class Comprador {
    private String sabor;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Moneda n;
        vuelto = 0;

        try {
            Bebida b = exp.comprarBebida(m, cualBebida);
            sabor = b.beber();
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            while ((n = exp.getVuelto()) != null) {
                vuelto += n.getValor();
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
