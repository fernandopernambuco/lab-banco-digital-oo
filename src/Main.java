
public class Main {
    public static void main(String[] args) {
        // Criando um cliente e contas
        Cliente cliente1 = new Cliente("Alice", "123.456.789-00", "alice@email.com");

        // Criando uma conta corrente
        ContaCorrente contaCorrente = new ContaCorrente("CC123", 500);
        cliente1.criarConta(contaCorrente);

        // Operações na conta corrente
        cliente1.depositar(1000, "CC123");
        cliente1.sacar(800, "CC123");
        cliente1.consultarSaldo("CC123");
        contaCorrente.cobrarTaxaManutencao();
        cliente1.consultarSaldo("CC123");

        // Criando uma conta poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca("PP456", 5);
        cliente1.criarConta(contaPoupanca);

        // Operações na conta poupança
        cliente1.depositar(200, "PP456");
        contaPoupanca.aplicarJuros(); // Aplicando juros na conta poupança
        cliente1.consultarSaldo("PP456");
    }
}
