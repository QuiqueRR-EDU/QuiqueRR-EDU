
package Java;

public class Vehiculos{
    private String tipoVehiculo;
    private int noLlantas;

    public void arrancar(){
        System.out.println("Estoy arrancando");
    }
    public void encender(){
        System.out.println("Estoy encendiendo");
    }
    public void setTipoVehiculo(String tipo){
        this.tipoVehiculo=tipo;
    }
    public String getTipoVehiculo(){
        return this.tipoVehiculo;
    }
    public void setNoLlantas(int numero){
        this.noLlantas=numero;
    }
    public int getNoLlantas(){
        return this.noLlantas;
    }
}