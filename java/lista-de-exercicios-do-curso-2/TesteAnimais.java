public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Gato miau = new Gato();

        miau.emitirSom();
        miau.arranharMoveis();

        dog.abanarRabo();
        dog.emitirSom();
    }
}
