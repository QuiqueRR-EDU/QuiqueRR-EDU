package MexBank;

public class mexBank {
 
    public static void main(String[] args) {

        System.out.println("Tarjeta de Credito:\n\n");   
        TarjetaCredito tarjetaCredito = new TarjetaCredito(123456, "Juan Duns", 1000);
        System.out.println(tarjetaCredito.datosCredito());
        tarjetaCredito.usarTarjeta(500);
        tarjetaCredito.sumarIntereses();
        tarjetaCredito.pagar(300);
        tarjetaCredito.usarTarjeta(1500);

        System.out.println("\n\nTarjeta de Débito:\n\n");
        TarjetaDebito tarjetaDebito = new TarjetaDebito(654321, "Maria Lopez", 100);
        System.out.println(tarjetaDebito.datosDebito());
        tarjetaDebito.abonar(3500);
        tarjetaDebito.retirar(4000);
        tarjetaDebito.retirar(2000);

        System.out.println("\n\nCuenta de Ahorro:\n\n");
        CuentaAhorro cuentaAhorro = new CuentaAhorro(789012, "Carlos Perez", 500);
        System.out.println(cuentaAhorro.datosAhorro());
        cuentaAhorro.invertir();  
        cuentaAhorro.retirar(1000);  
        cuentaAhorro.retirar(300);
    }
}
