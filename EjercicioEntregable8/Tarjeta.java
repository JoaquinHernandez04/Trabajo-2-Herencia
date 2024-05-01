package EjercicioEntregable8;

public class Tarjeta {
    private String entidadEmisora;
    private String entidadBancaria;
    private String numeroTarjeta;
    private int saldoDisponible;
    private Titular titular;

    public Tarjeta(String entidadEmisora, String entidadBancaria, String numeroTarjeta,
                   int saldoDisponible, Titular titular) {
        this.entidadEmisora = entidadEmisora;
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
    }

    public String getEntidadEmisora() {
        return entidadEmisora;
    }

    public void setEntidadEmisora(String entidadEmisora) {
        this.entidadEmisora = entidadEmisora;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public boolean realizarPago(double monto, int cuotas) {
        double montoTotal = monto * (1 + (0.03 * (cuotas - 1)));
        if (montoTotal > saldoDisponible) {
            return false; // No hay saldo suficiente
        }

        // Realizar el pago (aquí se simula la transacción)
        saldoDisponible -= montoTotal;
        return true;
    }
}