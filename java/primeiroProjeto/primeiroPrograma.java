package java.primeiroProjeto;

public class primeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: To Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        // Média calculada pelas 3 notas da jaque, Paulo e Suellen
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}
