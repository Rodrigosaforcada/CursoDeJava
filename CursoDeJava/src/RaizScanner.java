import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        System.out.println("introduce un número: ");
        Scanner reader = new Scanner(System.in);
        int numero;
        numero = reader.nextInt();
        System.out.println("La raíz cuadrada del número " + numero + " es = " + Math.sqrt(numero));
    }
}
