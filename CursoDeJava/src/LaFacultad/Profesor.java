package LaFacultad;

import java.util.Scanner;

public class Profesor extends Persona {
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo() {
        return (this.basico * (1 + 0.1 * this.antiguedad));
    }

    @Override
    public void modificarDatos(){
        Scanner s = new Scanner(System.in);

        System.out.println("Está por modificar los datos de: " + this.toString());
        System.out.println("Ingresa el nombre:");
        String nombre = s.nextLine();
        this.setNombre(nombre);
        System.out.println("Ingresa el apellido:");
        String apellido = s.nextLine();
        this.setApellido(apellido);
        System.out.println("Ingresa el legajo:");
        int legajo = s.nextInt();
        this.setLegajo(legajo);
        System.out.println("Ingresa la antigüedad:");
        int antiguedad = s.nextInt();
        this.setAntiguedad(antiguedad);
        System.out.println("Ingresa el basico:");
        double basico = s.nextDouble();
        this.setBasico(basico);
        System.out.println("Se han modificado los datos del profesor: ");
        System.out.println(this.toString());

        s.close();

    }

    @Override
    public String toString() {
        return "Profesor: "+super.toString();
    }
}
