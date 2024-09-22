import java.util.Scanner;

public class CalculadorArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-------MENU-------");
            System.out.println("1. Calcular área de um quadrado.");
            System.out.println("2. Calcular área de uma circunferência.");
            System.out.println("3. Sair");
            System.out.println("Escolha uma das opções: ");
            escolha = leitor.nextInt();

            if (escolha ==1) {
                System.out.println("Digite o lado do quadrado: ");
                double lado = leitor.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado + " u.a.");
            } else if (escolha ==2) {
                System.out.println("Qual o valor do Raio da circunfrência?");
                double raio = leitor.nextDouble();
                double areaCircunferencia = 3.14 * raio * raio;
                System.out.println("A área da circunferência é " + areaCircunferencia + " u.a.");
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
