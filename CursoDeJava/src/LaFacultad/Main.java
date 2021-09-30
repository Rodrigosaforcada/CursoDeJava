package LaFacultad;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Carlos", "Ramírez", 1200);
        Estudiante estudiante2 = new Estudiante("Gonzalo", "Flores", 1240);
        Estudiante estudiante3 = new Estudiante("Pablo", "Canteros", 1300);

        System.out.println("estudiante1 = " + estudiante1.getNombre());
        System.out.println("estudiante2 = " + estudiante2.getNombre());
        System.out.println("estudiante3 = " + estudiante3.getNombre());

        Profesor profesor1 = new Profesor("Alberto", "Castañeda", 2500, 35000, 7);

        System.out.println("\nprofesor1 = " + profesor1.getNombre());

        Materia laboratorio2 = new Materia("Progragramación", profesor1);

        laboratorio2.agregarEstudiante(estudiante1);
        laboratorio2.agregarEstudiante(estudiante2);
        laboratorio2.agregarEstudiante(estudiante3);

        System.out.println("Los estudiantes que están inscriptos a la materia Laboratorio 2 son: ");

        laboratorio2.listarContenidos();

        laboratorio2.eliminarEstudiante("Pablo");

        System.out.println("\nSe elimina al estudiante Pablo Canteros de la materia Laboratorio 2, los estudiantes que quedan son: ");

        laboratorio2.listarContenidos();

        Carrera programacion = new Carrera("Tecnicatura en Programación");
        programacion.agregarMateria(laboratorio2);

        Carrera ingenieria = new Carrera("Ingeniería en Sistemas");
        programacion.agregarMateria(laboratorio2);

        System.out.println("\nSe crean dos carreras y se agregan a la Facultad.");

        Facultad utn = new Facultad("Universidad Tecnológica Nacional");
        utn.agregarCarrera(programacion);
        utn.agregarCarrera(ingenieria);

        utn.eliminarEstudiante(estudiante2);

        System.out.println("Se elimina al estudiante Gonzalo Flores de la Facultad, el estudiante que queda es: ");

        laboratorio2.listarContenidos();

    }
}
