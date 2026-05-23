package JavaLearn.ejemplo_abstracto;

public class Perro extends Animal {
    Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("¡Guauuuuuuu!");
    }
}


