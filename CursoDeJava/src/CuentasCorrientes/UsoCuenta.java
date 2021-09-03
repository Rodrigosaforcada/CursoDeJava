package CuentasCorrientes;

public class UsoCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Pablo", 6000.00);
        CuentaCorriente cuenta2 = new CuentaCorriente("Eduardo", 5000.00);

        System.out.println("Los saldos iniciales son de: ");
        System.out.println("Saldo en cuenta 1 = " + cuenta1.getSaldo());
        System.out.println("Saldo en cuenta 2 = " + cuenta2.getSaldo());

        cuenta1.realizarTransferencia(2500, cuenta2);
        System.out.println("Los saldos después de la transferencia son de: ");
        System.out.println("Saldo en cuenta 1 = " + cuenta1.getSaldo());
        System.out.println("Saldo en cuenta 2 = " + cuenta2.getSaldo());
    }
}
