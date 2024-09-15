public class App {
    public static void main(String[] args) throws Exception {
        var artigo = new artigo(titulo: "VS Code", new autor(nome: "Jacqueline Oliveira"), LocalDate.of(year: 2022, month: 07, dayOfMonth: 13), Categoria.BACKEND);
        System.out.println(artigo);
    }
}
