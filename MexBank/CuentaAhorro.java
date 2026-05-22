package MexBank;

public class CuentaAhorro extends cuenta{
    
    public CuentaAhorro(double noCuenta, String titular, double apertura) {
        super(noCuenta, titular, "Ahorro");
        this.depositar(apertura);
        System.out.println("La cuenta de ahorro ha sido creada con el número " + noCuenta + "a nombre de" + titular +" y se realizó con un depósito inicial de: $" + apertura);
    }

    public void retirar(double cantidad) {
        if (this.saldo() >= cantidad) {
            this.depositar(-cantidad);
            System.out.println("\nHa retirado de su ahorro: $" + cantidad);
            System.out.println("Saldo actual: $" + this.saldo());
        } else {
            System.out.println("\nEl retiro por: $" + cantidad + " no se puede realizar. Saldo insuficiente.");
        }
    }

    public void invertir() {
        double inversion = this.saldo() * 0.1; // Inversión del 10%
        this.depositar(inversion);
        System.out.println("\nInversión realizada por: $" + inversion);
        System.out.println("Saldo actual: $" + this.saldo());
    }

    public String datosAhorro() {
        String datos = this.datosCuenta();
        return datos;
    }

}
