import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {

        int numeroAleatorio = (int) (Math.random()*100);
        
        System.out.println("Adivine un número que se encuentra entre 1 y 100: ");
        Scanner reader = new Scanner(System.in);
        int numeroElegido = reader.nextInt();
        int contador = 1;

        while (numeroElegido != numeroAleatorio) {
            if (numeroElegido < numeroAleatorio) {
                System.out.println("El número es menor.");
                System.out.println("Ingrese un número entre 1 y 100: ");
                reader = new Scanner(System.in);
                numeroElegido = reader.nextInt();
                contador++;
            } else {
                System.out.println("El número es mayor.");
                System.out.println("Ingrese un número entre 1 y 100: ");
                reader = new Scanner(System.in);
                numeroElegido = reader.nextInt();
                contador++;
            }
        }

        System.out.println("¡Correcto, adivinaste! El número era " + numeroAleatorio);
        System.out.println("Realizaste un total de " + contador + " intentos.");
    }
}
