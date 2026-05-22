package InheritanceProject;

public class inheritanceProjectmain {
    public static void main(String[] args) {
        //perro
        dog Dog = new dog("perro", "mamífero");

        System.out.println(Dog.eat());
        System.out.println(Dog.sleep());
        System.out.println(Dog.bark());

        System.out.println();

        //gato
        cat Cat = new cat("gato", "mamífero");

        System.out.println(Cat.eat());
        System.out.println(Cat.sleep());
        System.out.println(Cat.meow());
    }
}