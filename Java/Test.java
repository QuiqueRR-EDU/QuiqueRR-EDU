package Java;

public class Test{
    public static void main (String[] args){
        Vehiculos moto= new Vehiculos();
        moto.arrancar();
        moto.encender();
        moto.setNoLlantas(2);
        moto.setTipoVehiculo("Motocicleta");
        System.out.println(moto.getTipoVehiculo());
        System.out.println(moto.getNoLlantas());
    }
}