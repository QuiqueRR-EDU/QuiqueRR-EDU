package InheritanceProject;

public class Animal {
    public String type ="";
    private String kind = "";

    Animal(String type, String kind){
        this.type = type;
        this.kind = kind;

    }
    public String eat(){
        return "El " + this.type + " esta comiendo";
    }
    public String sleep(){
        return "El " + this.type + " esta durmiendo";
    }
}
