
package Java;

public class Matematicas {
    int numero1 = 2;
    int numero2 = 5;

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
