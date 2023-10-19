package trabajoPracticoPOO.Iniciado;



public class Main {
    public static void main(String[] args) {
        Alumno darian = new Alumno("Darian", "Hiebl", "1983-02-24");
        Alumno fede = new Alumno("Federico", "Miranda", "1987-05-04");
        Alumno carlos = new Alumno("Carlos", "NN", "1961-12-31");


        Curso java = new Curso("Java", true, "Curso presencial de JAVA");
        java.agregarAlumnos(darian); 
        java.agregarAlumnos(fede); 
        java.agregarAlumnos(carlos); 

        for (Alumno alumno : java.alumnos){
            System.out.println(alumno.nombre + " " + alumno.apellido + " Edad: " + alumno.edad);
        }
    }
}
