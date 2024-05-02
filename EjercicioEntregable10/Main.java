package EjercicioEntregable10;

public class Main {

    public static void main(String[] args) {

        Casa casa1 = new Casa(12345, 200, "Calle 123", 4, 3, true, 300, true);
        Apartamento apartamento1 = new Apartamento(54321, 100, "Avenida Principal", 2, 2, false);
        Casa casa2 = new Casa(24567, 220, "Calle 1233", 4, 2, false, 300, false);
        LocalComercial localComercial1 = new LocalComercial(78901, 300, "Calle 1234", "Calle 123", "Centro Comercial");

        casa1.imprimir();
        casa2.imprimir();
        apartamento1.imprimir();
        localComercial1.imprimir();

    }
}
