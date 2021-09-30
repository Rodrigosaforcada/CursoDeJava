package LaFacultad;

import java.util.HashSet;
import java.util.Set;

public class Carrera implements Informacion {
    private String nombre;
    private Set<Materia> coleccionMaterias;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.coleccionMaterias = new HashSet<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(Set<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    public void agregarMateria(Materia materia) {
        coleccionMaterias.add(materia);
    }

    public void eliminarMateria(String nombre) {
        boolean contiene = false;
        for (Materia o : this.coleccionMaterias) {
            if (o.getNombre() == nombre) {
                this.coleccionMaterias.remove(o);
                contiene = true;
                break;
            }
        }
        if (contiene)
            System.out.println("\nMateria borrada de la lista.");
        else
            System.out.println("\nEl nombre de la materia no se encuentra en la lista.");
    }

    public void encontrarMateria(String nombre) {
        boolean contiene = false;
        for (Materia o : this.coleccionMaterias) {
            if (o.getNombre() == nombre) {
                contiene = true;
                break;
            }
        }
        if (contiene)
            System.out.println("\nLa materia se encuentra en la lista.");
        else
            System.out.println("\nEl nombre de la materia no se encuentra en la lista.");
    }

    public int verCantidad() {
        return coleccionMaterias.size();
    }

    public String listarContenidos() {
        System.out.println("\nNombres de las materias pertenecientes a la carrera: ");
        for(Materia materia : this.coleccionMaterias){
            System.out.println(materia.getNombre());
        }
        return "Finalizado";
    }
}
