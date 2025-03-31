public class Conta {
    private double saldo;
    public Conta (double saldoInicial) {
        if (saldoInicial > 0.0)
            saldo = saldoInicial;
        else
            saldo = 0.0;
    }
    public double getSaldo() {
        return saldo;
    }
    public void creditar (double quantia) {
        saldo += quantia;
    }
    public void debitar(double quantia) {
        if((this.saldo-quantia) < 0) {
            System.out.println("débito que excedeu o saldo");
        } else {
            this.saldo-=quantia;
        }
    }
}