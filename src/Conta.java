
public abstract class Conta {
    protected String numero;
    protected double saldo;

    public Conta(String numero, double saldo) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("O número da conta não pode ser nulo ou vazio.");
        }
        this.numero = numero;
        this.saldo = saldo > 0 ? saldo : 0; // Saldo inicial não pode ser negativo
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso! Saldo atual: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso! Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo da conta " + numero + ": R$" + saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
