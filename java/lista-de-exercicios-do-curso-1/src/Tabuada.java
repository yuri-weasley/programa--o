import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um número de 0 a 10: ");
        numero = leitor.nextInt();

        while (numero <= 10) {
            System.out.println("Tabuada de: " + numero);

            for (int multi = 1; multi <= 10; multi++) {
                System.out.println(numero + " x " + multi + " = " + numero * multi);
            }
            break;
        }
    }
}
