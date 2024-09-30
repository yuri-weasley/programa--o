public class Carro {
    String modelo;
    int ano;
    String cor;
    double preco1;
    double preco2;
    double preco3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double preco1, double preco2, double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço no 1º ano: " + preco1);
        System.out.println("Preço no 2º ano: " + preco2);
        System.out.println("Preço no 3º ano: " + preco3);
        System.out.println("Menor preço: " + calcularMenorPreco());
        System.out.println("Maior preço: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco() {
        double menorPreco = preco1;

        if (preco2 < preco1) {
            menorPreco = preco2;
        }

        if (preco3 < menorPreco) {
            menorPreco = preco3;
        }
        return menorPreco;
    }
    private double calcularMaiorPreco() {
        double maiorPreco = preco1;

        if (preco2 > preco1) {
            maiorPreco = preco2;
        }

        if (preco3 > maiorPreco) {
            maiorPreco = preco3;
        }
        return maiorPreco;
    }

    int calcularIdade() {
        return 2024 - ano;
    }
}
