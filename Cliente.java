import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private double balance;
    private boolean bloqueada = false;
    private List<String> extrato;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.balance = 0.0;
        this.extrato = new ArrayList<>();
        extrato.add("Saldo: " + balance);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getBalance() {
        return balance;
    }

    public void addValue(double value) {
        if (value > 0) {
            balance += value;
            extrato.add("Added: " + value + ", New balance: " + balance);
        } else {
            System.out.println("Value to add must be positive.");
        }
    }

    public void removeValue(double value) {
        if (value > 0 && value <= balance) {
            balance -= value;
            extrato.add("Removed: " + value + ", New balance: " + balance);
        } else {
            System.out.println("Invalid value to remove. Ensure it's positive and less than or equal to the balance.");
        }
    }

    public void printAccountStatement() {
        System.out.println("Account Statement for " + nome + ":");
        for (String entry : extrato) {
            System.out.println(entry);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void bloquearConta() {
        this.bloqueada = true;
        System.out.println("Conta bloqueada.");
    }

    public void desbloquearConta() {
        this.bloqueada = false;
        System.out.println("Conta desbloqueada.");
    }

    public boolean isBloqueada() 
    {
        return bloqueada;
    }
}