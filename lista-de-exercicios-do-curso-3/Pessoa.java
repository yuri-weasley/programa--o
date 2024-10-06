public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "A pessoa criada é a: " + nome + " que tem " + idade + " anos de idade.";
    }
}
