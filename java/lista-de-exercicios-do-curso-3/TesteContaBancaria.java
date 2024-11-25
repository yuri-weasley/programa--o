import java.util.ArrayList;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(101, 1500);
        ContaBancaria conta2 = new ContaBancaria(102, 2500);
        ContaBancaria conta3 = new ContaBancaria(103, 1800);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);
        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() + ", saldo: " + contaMaiorSaldo.getSaldo());
    }
}
