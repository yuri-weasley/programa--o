import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Café", 5.59, 1);
        Produto produto2 = new Produto("Morango", 4.5, 2);
        Produto produto3 = new Produto("Desinfetante", 8, 1);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Arroz", 6.60, 1, "18/10/2024");
        System.out.println(produtoPerecivel);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("O segundo produto da lista é: " + listaProdutos.get(1).getNome());

        for(Produto produto : listaProdutos) {
            System.out.println(produto);
        }
        
    }
}
