package MexBank;

public class cuenta {
    private double noCuenta;
    private String titular;
    private double montoActual;
    private String tipoCuenta;

    public cuenta(double noCuenta, String titular, String tipoCuenta) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
    }

    public void depositar(double cantidad) {
        this.montoActual += cantidad;
    }

    public double saldo() {
        return this.montoActual;
    }

    public String datosCuenta() {
        String datos = "\nCuenta " + this.tipoCuenta + "\nNúmero de Cuenta: " + this.noCuenta + "\nTitular: " + this.titular + "\nSaldo actual: $" + this.saldo();
        return datos;
    }
}
