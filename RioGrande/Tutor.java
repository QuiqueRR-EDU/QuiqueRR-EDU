package RioGrande;

public class Tutor extends Persona implements Calificaciones {
    private Alumno alumno;

    Tutor(double id, String nombre, String apellido, String correoElectronico, Alumno alumno) {
        super(id, nombre, apellido, correoElectronico);
        
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Perfil del tutor:");
        System.out.println("ID: " + this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Correo electrónico: " + this.getCorreoElectronico());
        System.out.println("Alumno: " + this.alumno.getNombre() + " " + this.alumno.getApellido());
    }
    
    @Override
    public void mostrarCalificaciones() {
        System.out.println("Calificaciones del alumno:" + alumno.getCalificacion());
    }
    
}
