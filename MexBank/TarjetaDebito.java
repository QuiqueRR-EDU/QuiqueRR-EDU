package MexBank;

public class TarjetaDebito extends cuenta   {
    

    public TarjetaDebito(double noCuenta, String titular, double apertura) {
        super(noCuenta, titular, "Débito");
        this.depositar(apertura);
        System.out.println("La cuenta de débito ha sido creada con el número " + noCuenta + "a nombre de" + titular +" y se realizó con un depósito inicial de: $" + apertura);
    }

    public void retirar(double cantidad) {
        if (this.saldo() >= cantidad) {
            this.depositar(-cantidad);
            System.out.println("\nRetiro realizado por: $" + cantidad);
            System.out.println("Saldo actual: $" + this.saldo());
        } else {
            System.out.println("\nEl retiro por: $" + cantidad + " no se puede realizar. Saldo insuficiente.");
        }
    }

    public void abonar(double cantidad) {
        this.depositar(cantidad);
        System.out.println("\nCarga de saldo realizada por: $" + cantidad);
        System.out.println("Saldo actual: $" + this.saldo());
    }

    public String datosDebito() {
        String datos = this.datosCuenta();
        return datos;
    }
}
