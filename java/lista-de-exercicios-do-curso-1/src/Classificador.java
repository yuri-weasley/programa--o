import java.util.Scanner;

public class Classificador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número inteiro: ");
        numero = leitor.nextInt();

        if (numero > 0) {
            System.out.println("O número digitado é positivo.");
        } else if (numero == 0) {
            System.out.println("O némro digitado foi o ZERO.");
        } else {
            System.out.println("O número digitado é negativo.");
        }
    }
}
