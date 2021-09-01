public class EjercicioCombinado {
    public static void main(String[] args) {
        double numerador = ((6.0/5.0) - (2.0/3.0) * (7.0/2.0) + (2.0/30.0));
        double denominador = ((1.0/3.0) / 5);
        double resultado = numerador / denominador;
        System.out.println("resultado = " + String.format("%.2f", resultado));
    }
}
