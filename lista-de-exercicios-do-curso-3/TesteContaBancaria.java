import java.util.ArrayList;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroConta(54165);
        conta1.setSaldo(640);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNumeroConta(98465);
        conta2.setSaldo(848);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);

        for (ContaBancaria conta : listaDeContas) {
            if (conta[i].getSaldo() < conta[i-1].getSaldo()) {
                System.out.println();
            }
        }
    }
}
