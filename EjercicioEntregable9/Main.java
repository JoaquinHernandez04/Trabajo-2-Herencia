package EjercicioEntregable9;
public class Main {

    public static void main(String[] args) {


        Empleado empleado = new Empleado("42958791", "Joaquin hernandez", "Necochea 385", "21-01-2022", "Empleado");
        Empleado.Vendedor vendedor = empleado.new Vendedor("42958791", "Joaquin hernandez", "Necochea 385", "21-01-2022",5000000);

        vendedor.imprimirTicket();

        Empleado.Administrativo administrativo = empleado.new Administrativo("42558785", "Eros Marziani", "Rodiguez 100", "22-01-2022","Administrativo",false);

        administrativo.imprimirTicketAdministrativo();

        Empleado.Repartidor repartidor = empleado.new Repartidor("42558773", "Leo Messi", "Castelar 2500", "22-10-2022","Repartidor", 10);

        repartidor.imprimirTicketRepartidor();
    }
}


