package JavaLearn.ejemplo_abstracto;

public class Test {
    
    public static void main(String[] args) {
        
        Perro perro = new Perro("Firulais");
        Gato gato = new Gato("Michi");  

        perro.imprimirNombre();
        perro.sonido();
        gato.imprimirNombre();
        gato.sonido();
    }
}
