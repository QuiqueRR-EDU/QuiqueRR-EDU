package MexBank;

public class TarjetaCredito extends cuenta {
    private double limiteCredito;

    public TarjetaCredito(double noCuenta, String titular, double limiteCredito) {
        super(noCuenta, titular, "Crédito");
        this.limiteCredito = limiteCredito;
        System.out.println("El credito ha sido creado con el número " + noCuenta + " a nombre de " + titular + " y tiene un límite de crédito de: $" + limiteCredito);
    }

    public void usarTarjeta(double cantidad) {
        if (this.saldo() - cantidad  >= -this.limiteCredito) {
            this.depositar(-cantidad);
            System.out.println("\nCompra realizada por: $" + cantidad);
            System.out.println("Monto actual: $" + this.saldo());
        } else {
            System.out.println("\nLa compra por: $" + cantidad + " no se puede realizar. Límite de crédito excedido.");
        }
    }

    public void sumarIntereses() {
        double intereses = -this.saldo() * 0.15; // Interés del 15%
        this.depositar(-intereses);
        System.out.println("\nIntereses sumados: $" + intereses);
        System.out.println("Monto actual: $" + this.saldo());
    }

    public void pagar(double cantidad) {
        this.depositar(cantidad);
        System.out.println("\nPago realizado por: $" + cantidad);
        System.out.println("Monto actual: $" + this.saldo());
    }

    public String datosCredito() {
        String datos = this.datosCuenta() + "\nLímite de Crédito: $" + this.limiteCredito;
        return datos;
    }
}