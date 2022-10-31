package tarea2;

public class Tarea2 {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2, 4); // monto se multiplica por 100 en constructor

        Moneda m1 = new Moneda500();
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        Moneda m4 = new Moneda1000();

        Comprador Leo = new Comprador(m1, 1, exp);
        Comprador Clau = new Comprador(m2, 2, exp);
        Comprador Vivi = new Comprador(m3, 1, exp);
        Comprador Dani = new Comprador(null, 1, exp);
        Comprador Diego = new Comprador(m4, 1, exp);

        System.out.println();
        System.out.println("Leo, vuelto: " + Leo.getVuelto());
        System.out.println("Clau, vuelto: " + Clau.getVuelto());
        System.out.println("Clau: " + Clau.getSabor());
        System.out.println("Vivi, vuelto: " + Vivi.getVuelto());
        System.out.println("Vivi: " + Vivi.getSabor());
        System.out.println("Diego, vuelto: " + Diego.getVuelto());
    }
}
