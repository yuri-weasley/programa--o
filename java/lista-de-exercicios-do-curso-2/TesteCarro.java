public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setModelo("Caminhonete");
        meuCarro.definirPrecos(84000, 97000, 114000);
        meuCarro.exibirFichaTecnica();
    }
}
