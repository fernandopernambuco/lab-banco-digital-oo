
public class ContaCorrente extends Conta {

    private static final double TAXA_MANUTENCAO = 10.0;

    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    public void cobrarTaxaManutencao() {
        if (saldo >= TAXA_MANUTENCAO) {
            saldo -= TAXA_MANUTENCAO;
            System.out.println("Taxa de manutenção de R$" + TAXA_MANUTENCAO + " cobrada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para cobrança da taxa de manutenção.");
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "numero='" + numero + '\'' + ", saldo=" + saldo + '}';
    }
}
