package InheritanceProject;

public class dog extends Animal {
    dog(String type, String kind){
        super(type, kind);
    }
    public String bark(){
        return "El " + this.type + " esta ladrando";
    }
}
