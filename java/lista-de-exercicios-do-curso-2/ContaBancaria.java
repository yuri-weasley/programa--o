public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        System.out.println("Saldo atual: " + saldo);
        return this.saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /*
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    */

    public void depositar(double valor) {
        if (valor > 0) {
            System.out.println("Depósito efetuado com sucesso!");
            saldo += valor;
            System.out.println("Saldo atualizado: " + saldo);
        } else {
            System.out.println("Digite um valor válido.");
        }
    }

    public void sacar(double saque) {
        if (saque <= saldo) {
            System.out.println("Saque efetuado com sucesso!");
            saldo -= saque;
            System.out.println("Saldo atualizado " + saldo);
        } else {
            System.out.println("Saldo insuficiente para a operação digitada.");
        }
    }
}
