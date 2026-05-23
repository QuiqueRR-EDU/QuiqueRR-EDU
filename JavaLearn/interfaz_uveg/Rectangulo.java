package JavaLearn.interfaz_uveg;

public class Rectangulo implements IFigura {
    private double base;
    private double altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Impresión de Rectángulo");
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public void imprimirArea() {
        System.out.println("El área del rectángulo es: " + this.calcularArea());
    }
}