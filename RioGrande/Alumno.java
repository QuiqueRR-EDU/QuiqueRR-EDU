package RioGrande;

public class Alumno extends Persona implements Calificaciones {
    private double calificacion;
    private String materia;

    Alumno(double id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Perfil del alumno:");
        System.out.println("ID: " + this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Correo electrónico: " + this.getCorreoElectronico());
    }
    
    public double getCalificaciones(){
        return this.calificacion;   
    }


    @Override
    public void mostrarCalificaciones() {
        System.out.println("La calificación del alumno es: " + this.calificacion);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Perfil del alumno:");
        System.out.println("ID: " + this.getId());   
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Correo electrónico: " + this.getCorreoElectronico());
        System.out.println("Calificación: " + this.calificacion);
    }   
    
}
