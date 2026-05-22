package InheritanceProject;

public class cat extends Animal {
    cat(String type, String kind){
        super(type, kind);
    }
    
    public String meow(){
        return "El " + this.type + " esta maullando";
    }
}
