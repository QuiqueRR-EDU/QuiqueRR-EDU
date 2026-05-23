package RioGrande;

public class Maestro extends Persona implements Calificaciones {
    private String materia;
    private Alumno alumno;

    Maestro(double id, String nombre, String apellido, String correoElectronico, String materia) {
        super(id, nombre, apellido, correoElectronico);
        this.materia = materia;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Perfil del maestro:");
        System.out.println("ID: " + this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Correo electrónico: " + this.getCorreoElectronico());
        System.out.println("Materia: " + this.materia);
    }
    
    @Override
    public void calificacion(double calificacion, String materia, Alumno alumno) {
        alumno.calificacion = calificacion;
        alumno.materia = materia;

    }
}
