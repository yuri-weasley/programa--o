public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    int idade;

    public String getNome() {
        return this.nome;
    }
    public double getNota1() {
        return this.nota1;
    }
    public double getNota2() {
        return this.nota2;
    }
    public double getNota3() {
        return this.nota3;
    }
    public double getNota4() {
        return this.nota4;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public void calcularMedia() {
        double media = (nota1 + nota2 + nota3 +nota4) / 4;
        System.out.println("A média das notas apresentadas é igual a: " + media);
    }

    void exibeInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }
}