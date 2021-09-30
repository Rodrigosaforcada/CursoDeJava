package LaFacultad;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;

    public Persona(String nombre,String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + "(Leg. " + legajo+")";
    }

    public abstract void modificarDatos();
}
