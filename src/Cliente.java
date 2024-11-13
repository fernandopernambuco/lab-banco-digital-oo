
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private List<Conta> contas;

    public Cliente(String nome, String cpf, String email) {
        if (nome == null || cpf == null || email == null) {
            throw new IllegalArgumentException("Nome, CPF e email não podem ser nulos.");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.contas = new ArrayList<>();
    }

    public void criarConta(Conta conta) {
        if (conta != null) {
            contas.add(conta);
            System.out.println("Conta " + conta.getNumero() + " criada com sucesso para " + nome);
        } else {
            System.out.println("Conta inválida!");
        }
    }

    public void depositar(double valor, String numeroConta) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void sacar(double valor, String numeroConta) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void consultarSaldo(String numeroConta) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            conta.consultarSaldo();
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    private Conta encontrarConta(String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", CPF: " + cpf + ", Email: " + email;
    }
}
