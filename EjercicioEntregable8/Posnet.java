package EjercicioEntregable8;

public class Posnet {
    public String efectuarPago(Tarjeta tarjeta, double monto, int cuotas) {
        boolean pagoExitoso = tarjeta.realizarPago(monto, cuotas);
        if (pagoExitoso) {
            double montoTotal = monto * (1 + (0.03 * (cuotas - 1)));
            double montoCuota = montoTotal / cuotas;
            return "Ticket de Pago:\n" +
                   "Cliente: " + tarjeta.getTitular().getNombre() + " " + tarjeta.getTitular().getApellido() + "\n" +
                   "Monto Total: $" + montoTotal + "\n" +
                   "Monto por Cuota: $" + montoCuota;
        } else {
            return null; 
        }
}
}
