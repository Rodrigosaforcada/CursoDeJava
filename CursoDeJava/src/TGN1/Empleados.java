package TGN1;

public class Empleados extends Personas {
    private double sueldo;

    public Empleados(String nombre, int edad) {
        super(nombre, edad);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return "nombre =" + getNombre() +
                "\nedad = " + getEdad();
    }

    @Override
    public String getTipo(){
        return getClass().getName();
    }
}
