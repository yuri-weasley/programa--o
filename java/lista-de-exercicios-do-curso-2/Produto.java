public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return this.nome;
    }
    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(int desconto) {
        double novoPreco = preco - (preco * desconto);
        System.out.println("O preço do produto com o desconto de " + desconto + "%, é de: R$ " + novoPreco);
    }
}
