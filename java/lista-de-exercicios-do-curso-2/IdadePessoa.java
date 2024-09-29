public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade < 17) {
            System.out.println("É menor de idade.");
        } else {
            System.out.println("É maior de idade.");
        }
    }
}
