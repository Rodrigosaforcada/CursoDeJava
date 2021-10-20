package TGN1;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {

        String nombreEspectador;
        int edadEspectador = 0;
        String filaEspectador;
        int sillaEspectador = 0;

        int i = 0;

        Scanner datosEspectador = new Scanner(System.in);

        System.out.println("Por favor ingrese el nombre, edad, fila y silla de cada espectador " +
                "y cuántos espectadores desea agregar.");
        System.out.println("¿Cuántos espectadores van a ser agregados?");

        int contador = datosEspectador.nextInt();

        Espectadores[] listaEspectadores = new Espectadores[contador];

        while(i < contador) {
            System.out.println("Escriba el nombre del espectador");
            nombreEspectador = datosEspectador.next();
            System.out.println("Escriba la edad del espectador");
            try {
                edadEspectador = datosEspectador.nextInt();
            } catch (RuntimeException e) {
                System.out.println("ERROR EN EL INGRESO DE DATOS");
            }
            System.out.println("Indique la fila del espectador");
            filaEspectador = datosEspectador.next();
            System.out.println("Indique la silla del espectador");
            try {
                sillaEspectador = datosEspectador.nextInt();
            } catch (RuntimeException e) {
                System.out.println("ERROR EN EL INGRESO DE DATOS");
            }
            Espectadores espectador =
                    new Espectadores(nombreEspectador, edadEspectador, filaEspectador, sillaEspectador);
            listaEspectadores[i] = espectador;
            i++;
        }

        Salas sala = new Salas(3, "Sala01");
        sala.setPelicula("Joker");

        sala.setEspectadores(listaEspectadores);

        try {
            if (listaEspectadores[0] == null)
                System.out.println("\nLista de esectadores: ");
            for (Espectadores espectador : sala.getEspectadores()) {
                System.out.println("\n" + espectador.toString());
            }
        } catch (Exception e) {
            System.out.println("SIN ESPECTADORES CARGADOS");
        }

        Acomodadores acomodador = new Acomodadores("Alberto", 27);

        acomodador.setSueldo(50000);

        System.out.println("\nAcomodador designado a la sala: " + "\n" + acomodador.toString());

        Empleados empleado = new Empleados("Sebastian", 32);

        System.out.println("\nEmpleado designado a la sala: " + "\n" + empleado.toString());
    }
}
