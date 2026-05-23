package JavaLearn.interfaz_vehiculo;

public class Sedan implements IVehiculo{
    @Override
    public void imprimirMotor() {
        System.out.println("Ultra 600HP");
    }

    @Override
    public void adelante() {
        System.out.println("Sedan - Adelante");
    }

    @Override
    public void reversa() {
        System.out.println("Sedan - Reversa");
    }

    @Override
    public void montarRuedas(int ruedas) {
        System.out.println("Sedán - Se montaron " + ruedas + " ruedas.");
    }
}
