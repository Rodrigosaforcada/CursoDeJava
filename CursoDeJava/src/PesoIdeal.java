import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {

        System.out.println("Introduce la altura en centímetros de una persona: ");
        Scanner reader = new Scanner(System.in);
        int peso = reader.nextInt();

        System.out.println("Introduce el género de la misma persona, 1 si es\n" +
                "mujer, 2 si es hombre: ");
        Scanner reader2 = new Scanner(System.in);
        int genero = reader2.nextInt();

        if (genero == 1) {
            System.out.println("Su peso ideal es " + (peso - 120) + " kilogramos.");
        } else {
            System.out.println("Su peso ideal es " + (peso - 110) + " kilogramos.");
        }
    }
}
