package TGN1;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {

        String nombreEspectador;
        int edadEspectador;
        String filaEspectador;
        int sillaEspectador;

        int cantidadEspectadores;

        int i = 0;

        int contador = 0;

        Scanner datosEspectador = new Scanner(System.in);

        System.out.println("Por favor ingrese el nombre, edad, fila y silla de cada espectador " +
                "y cuántos espectadores desea agregar.");
        System.out.println("¿Cuántos espectadores van a ser agregados?");

        try {
            contador = datosEspectador.nextInt();
            try {
                numeroPositivo(contador);
            } catch(Exception e) {
                e.printStackTrace();
            }
        } catch (RuntimeException e) {
            System.out.println("ERROR EN EL INGRESO DE DATOS");
            e.printStackTrace();
        }

        if(contador == 0 || contador < 0) {
            cantidadEspectadores = 1;
        } else {
            cantidadEspectadores = contador;
        }

        Espectadores[] listaEspectadores = new Espectadores[cantidadEspectadores];
        listaEspectadores[0] = null;

        while(i < contador) {
            System.out.println("Escriba el nombre del espectador");
            nombreEspectador = datosEspectador.next();
            System.out.println("Escriba la edad del espectador");
            try {
                edadEspectador = datosEspectador.nextInt();
            } catch (RuntimeException e) {
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                e.printStackTrace();
                break;
            }
            System.out.println("Indique la fila del espectador");
            filaEspectador = datosEspectador.next();
            System.out.println("Indique la silla del espectador");
            try {
                sillaEspectador = datosEspectador.nextInt();
            } catch (RuntimeException e) {
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                e.printStackTrace();
                break;
            }
            Espectadores espectador =
                    new Espectadores(nombreEspectador, edadEspectador, filaEspectador, sillaEspectador);
            listaEspectadores[i] = espectador;
            i++;
        }

        Salas sala = new Salas(3, "Sala01");
        sala.setPelicula("Joker");

        try {
            comprobarCapacidad(listaEspectadores, sala);
            sala.setEspectadores(listaEspectadores);
            try {
                listaVacia(listaEspectadores);
                System.out.println("\nLista de esectadores: ");
                for (Espectadores espectador : sala.getEspectadores()) {
                    System.out.println(espectador.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        Acomodadores acomodador = new Acomodadores("Alberto", 27);

        acomodador.setSueldo(50000);

        System.out.println("\nAcomodador designado a la sala: " + "\n" + acomodador.toString());

        Empleados empleado = new Empleados("Sebastian", 32);

        System.out.println("\nEmpleado designado a la sala: " + "\n" + empleado.toString());
    }

    static void numeroPositivo(int numero) throws Exception {
        if(numero < 0) {
            throw new Exception("No se pueden ingresar numeros negativos");
        }
    }

    static void comprobarCapacidad(Espectadores[] espectadores, Salas sala) throws Exception {
        if (espectadores.length > sala.getCapacidad()){
            throw new Exception("Hay demasiados espectadores para la capacidad de la sala.");
        }
    }

    static void listaVacia(Espectadores[] espectadores) throws Exception {
        if (espectadores[0] == null) {
            throw new Exception("SIN ESPECTADORES CARGADOS");
        }
    }
}
