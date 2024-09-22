import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Archibald Haddock";
        String tipoConta = "Corrente";
        double saldo = 1500.94;
        int opcao = 0;

        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldo) {
                    System.out.println("Saldo insuficiente para essa transferência.");
                } else {
                    saldo -= valorTransferido;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor recebido?");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção inválida!");
            }
        }
    }
}
