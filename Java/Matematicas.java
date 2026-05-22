
package Java;

public class Matematicas {
    int numero1;
    int numero2;

    public Matematicas() {
        this.numero1 = 2;
        this.numero2 = 5;
    }

    public Matematicas(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int multiplicar(){
        return numero1*numero2;
    }
    public int multiplicar(int numero2){
            return numero1*numero2;
    }
    public int multiplicar(int numero2,String mensaje){
        System.out.println(mensaje);
        return numero1*numero2;
    }
}
