package CuentasCorrientes;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(String nombreTitular, double saldo){
        this.nombreTitular = nombreTitular;
        this.setSaldo(saldo);
        this.numeroCuenta = (int) (Math.random()*100000000);
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void realizarTransferencia(double transferencia, CuentaCorriente cuentaTransferida) {
        this.saldo = (saldo - transferencia);
        cuentaTransferida.setSaldo( (cuentaTransferida.getSaldo() + transferencia) );
    }
}
