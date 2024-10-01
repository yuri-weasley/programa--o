public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo(int num) {
        if (verificarPrimalidade(num)) {
            System.out.println(num + "é primo.");
        } else {
            System.out.println(num + "não é primo.");
        }
    }
}
