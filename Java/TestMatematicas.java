package Java;

public class TestMatematicas {
    public static void main(String[] args) {
        Matematicas test2 = new Matematicas(3,7);
        System.out.println(test2.multiplicar());
        System.out.println(test2.multiplicar(4));
        System.out.println(test2.multiplicar(4, "El resultado es: "));
    }
}
