package RioGrande;

public abstract class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String correoElectronico;

    Persona(int id, String nombre, String apellido, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public abstract void imprimirDatos();

}
