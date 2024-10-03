import java.util.Scanner;

public class Comparador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Digite um número inteiro: ");
        num1 = leitor.nextInt();

        System.out.println("Digite o próximo número inteiro: ");
        num2 = leitor.nextInt();

        if (num1 == num2) {
            System.out.println("Os número digtados são iguais.");
        } else if (num1 > num2) {
            System.out.println("O numero " + num1 + " digitado, é maior que o número " + num2 + "digitado.");
        } else {
            System.out.println("O número " + num1 + "digitado, é menor que o número " + num2 + " digitado.");
        }
    }
}
