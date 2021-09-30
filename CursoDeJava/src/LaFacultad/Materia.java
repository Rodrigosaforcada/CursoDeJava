package LaFacultad;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Materia implements Informacion {
    private String nombre;
    private Profesor titular;
    private Set<Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new HashSet<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public Set<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(Set<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.coleccionEstudiantes.add(estudiante);
    }

    public void eliminarEstudiante(String nombre) {
        boolean contiene = false;
        for (Estudiante estaudianteEliminado : this.coleccionEstudiantes) {
            if (estaudianteEliminado.getNombre() == nombre) {
                this.coleccionEstudiantes.remove(estaudianteEliminado);
                contiene = true;
                break;
            }
        }
        if (contiene)
            System.out.println("\nEstudiante borrado de la lista.");
        else
            System.out.println("\nEl nombre del alumno no se encuentra en la lista.");
    }

    public void modificarTitular(Profesor profesor) {
        this.titular = profesor;
    }

    @Override
    public String toString() {
        return "Materia: "+ nombre + "\n" +
                "Titular: " + titular + "\n"+
                "Estudiantes: "+ coleccionEstudiantes.size()+" \n" + coleccionEstudiantes;
    }

    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    public String listarContenidos() {
        System.out.println("\nNombres de los alumnos inscriptos en la materia: ");
        for(Estudiante est : this.coleccionEstudiantes){
            System.out.println(est.getNombre());
        }
        return "Finalizado";
    }
}
