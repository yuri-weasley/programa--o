public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria minhaContaDeTeste = new ContaBancaria();

        minhaContaDeTeste.depositar(540);
        minhaContaDeTeste.getSaldo();
        minhaContaDeTeste.sacar(100);
        minhaContaDeTeste.sacar(1000);
    }
}
