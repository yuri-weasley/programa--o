public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 1 (cálculo de média de 2 números)");
        double nota1 = 9.6;
        double nota2 = 7.5;
        double media = (nota1 + nota2)/2;
        System.out.println("A média das notas digitadas é: " + media);

        System.out.println("Exercício 2 (casting)");

        double a = 8.9;
        int b = 9;
        int aCasting = (int) a;
        System.out.println(aCasting);

        System.out.println("Exercício 3 (concantenando variáveis)");

        char letra = 'A'; //A variável char deve ser declarada com uso de ASPAS SIMPLES
        String palavra = "marelo";
        System.out.println(letra + palavra);

        System.out.println("Exercício 4 (cálculo do preço)");

        double precoProduto = 7.99;
        int quantidade = 2;
        double total = precoProduto * quantidade;
        System.out.println("O preço total da compra é: R$ " + total);

        System.out.println("Exercício 5 (convertendo moedas)");

        double valorEmDolares = 8.50;
        double quantosReaisValeUmDolar = 4.94;
        double valorEmDolarConvertidoEmReal = valorEmDolares * quantosReaisValeUmDolar;
        System.out.println("O valor convertido para R$ é: " + valorEmDolarConvertidoEmReal);

        System.out.println("Exercício 6 (cálculo do desconto)");

        double precoOriginal = 21.5;
        double peercentualDesconto = 10;
        double precoComDesconto = precoOriginal - ((peercentualDesconto/100) * precoOriginal);
        System.out.println("O preço do produto com desconto é: R$ " + precoComDesconto);
        }
    }