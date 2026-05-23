package JavaLearn.interfaz_uveg;

public class Circulo implements IFigura{
    private static final double PI = 3.1416;
    private double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Impresión de Círculo");
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(this.radio, 2);
    }

    @Override
    public void imprimirArea() {
        System.out.println("El área del círculo es: " + this.calcularArea());
    }
}
