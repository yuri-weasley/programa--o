import java.util.Random;
import java.util.Scanner;

public class Advinha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        //System.out.println(numero);
        int tentativas = 0;
        int palpite = 0;

        while (tentativas < 5) {
            System.out.println("Digite seu palpite: ");
            palpite = leitor.nextInt();
            tentativas++;

            if (palpite == numero) {
                System.out.println("Parabéns, você advinhou o número!");
                break;
            } else if (palpite < numero) {
                System.out.println("O seu palpite é menor que o número.");
            } else {
                System.out.println("O seu palpite foi maior que o número.");
            }
        }
        
        if (tentativas == 5 && palpite != numero) {
            System.out.println("Você esgotou o número de tentativas que tinha! O número era: " + numero);
        }
    }
}
