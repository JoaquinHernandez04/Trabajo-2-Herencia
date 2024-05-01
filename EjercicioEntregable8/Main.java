package EjercicioEntregable8;
public class Main{

    public static void main(String[] args) {
        Titular titular = new Titular("42958791", "joaquin", "Hernandez", "123456789", "joaquinhernandezj.4@gmail.com");
        Tarjeta tarjeta = new Tarjeta("Visa", "Banco X", "1234-5678-9101-1121", 15000, titular);
        Posnet posnet = new Posnet();
        int monto = 10000;
        int cuotas = 5;

        String resultadoPago = posnet.efectuarPago(tarjeta, monto, cuotas);
        if (resultadoPago != null) {
            System.out.println(resultadoPago);
        } else {
            System.out.println("No se pudo realizar el pago. Saldo insuficiente.");
        }
    }     
}
