package LaFacultad;

import java.util.Scanner;

public class Estudiante extends Persona {

    public Estudiante(String nombre, String apellido, int legajo){
        super(nombre, apellido, legajo);
    }

    @Override
    public String toString() {
        return "Estudiante: "+ super.toString();
    }

    @Override
    public void modificarDatos() {
        Scanner s = new Scanner(System.in);

        System.out.println("Está por modificar los datos de: " + this.toString());
        System.out.println("Ingresa el nombre:");
        String nombre = s.nextLine();
        this.setNombre(nombre);
        System.out.println("Ingresa el apellido:");
        String apellido = s.nextLine();
        this.setApellido(apellido);
        System.out.println("Ingresa el número de legajo:");
        int legajo = s.nextInt();
        this.setLegajo(legajo);
        System.out.println("Se han modificado los datos del estudiante: ");
        System.out.println(this.toString());

        s.close();
    }
}
