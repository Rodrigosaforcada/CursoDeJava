package TGN1;

public class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;
    private Espectadores[] espectadores;

    public Salas(int capacidad, String nombre){
        this.setCapacidad(capacidad);
        this.setNombre(nombre);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Espectadores[] getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString(){
        return "\nnombre =" + getNombre() +
                "\nedad = " + getCapacidad();
    }
}
