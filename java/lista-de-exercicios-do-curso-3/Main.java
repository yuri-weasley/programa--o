import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaDePalavras = new ArrayList<>();
        listaDePalavras.add("Helicóptero");
        listaDePalavras.add("Capitão");
        listaDePalavras.add("Pá");

        for (String palavra: listaDePalavras) {
            System.out.println(palavra);
        }
    }
}
