package JavaLearn.ejemplo_abstracto;

public class Gato extends Animal {
    Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("¡Miauuuuuu!");
    }
    
}
