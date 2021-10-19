package TGN1;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {

        int respuestaContinuar;
        String nombreEspectador;
        int edadEspectador;
        String filaEspectador;
        int sillaEspectador;
        boolean continuar = true;

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
            edadEspectador = datosEspectador.nextInt();
            System.out.println("Indique la fila del espectador");
            filaEspectador = datosEspectador.next();
            System.out.println("Indique la silla del espectador");
            sillaEspectador = datosEspectador.nextInt();
            Espectadores espectador =
                    new Espectadores(nombreEspectador, edadEspectador, filaEspectador, sillaEspectador);
            listaEspectadores[i] = espectador;
            i++;
        }

        Salas sala = new Salas(3, "Sala01");
        sala.setPelicula("Joker");

        sala.setEspectadores(listaEspectadores);

        for (Espectadores espectador : sala.getEspectadores()) {
            System.out.println(espectador.toString());
        }

        Acomodadores acomodador = new Acomodadores("Alberto", 27);

        acomodador.setSueldo(50000);

        System.out.println(acomodador.toString());

        Empleados empleado = new Empleados("Sebastian", 32);

        System.out.println(empleado.toString());
    }
}
