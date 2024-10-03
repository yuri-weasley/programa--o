public class Livro implements Calculavel {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + " de " + autor);
    }
    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
