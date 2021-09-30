package LaFacultad;

import java.util.HashSet;
import java.util.Set;

public class Facultad implements Informacion {
    private String nombre;
    private Set<Carrera> coleccionCarreras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.coleccionCarreras = new HashSet<Carrera>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public void setColeccionCarreras(Set<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    public void agregarCarrera(Carrera carrera) {
        coleccionCarreras.add(carrera);
    }

    public void eliminarCarrera(String nombre) {
        boolean contiene = false;
        for (Carrera o : this.coleccionCarreras) {
            if (o.getNombre() == nombre) {
                this.coleccionCarreras.remove(o);
                contiene = true;
                break;
            }
        }
        if (contiene)
            System.out.println("\nCarrera borrada de la lista.");
        else
            System.out.println("\nEl nombre de la carrera no se encuentra en la lista.");
    }

    public void eliminarEstudiante(Estudiante estudianteEliminado) {
        boolean contiene = false;
        for (Carrera carrera : this.coleccionCarreras) {
            for (Materia materia : carrera.getColeccionMaterias()) {
                for (Estudiante estudiante : materia.getColeccionEstudiantes()) {
                    if (estudiante == estudianteEliminado) {
                        materia.getColeccionEstudiantes().remove(estudianteEliminado);
                        contiene = true;
                        break;
                    }
                }
            }
        }
        if (contiene) {
            System.out.println("\nEstudiante eliminado de la Facultad.");
        } else {
            System.out.println("\nEl nombre del alumno no se encuentra en ninguna lista de la Facultad.");
        }
    }

    public int verCantidad() {
        return coleccionCarreras.size();
    }

    public String listarContenidos() {
        System.out.println("\nNombres de las materias pertenecientes a la carrera: ");
        for(Carrera carrera : this.coleccionCarreras){
            System.out.println(carrera.getNombre());
        }
        return "Finalizado";
    }
}