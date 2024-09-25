import java.sql.Date;

public class Musica {
    public String titulo;
    public String artista;
    public Date anoLancamento;
    public double somaDasAvaliacoes;
    public int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliarMusica(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return somaDasAvaliacoes / numAvaliacoes;
    }
}
