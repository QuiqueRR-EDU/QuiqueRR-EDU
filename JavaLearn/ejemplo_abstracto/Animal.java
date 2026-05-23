package JavaLearn.ejemplo_abstracto;

public abstract class Animal {
    private String nombre;
    Animal(String nombre) {
        this.nombre =  nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void imprimirNombre() {
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public abstract void sonido();
}
