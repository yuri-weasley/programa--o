import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um número: ");
        num = leitor.nextInt();
        
        System.out.println("O dobro do número digitado é: " + 2 * num);
    }
}
