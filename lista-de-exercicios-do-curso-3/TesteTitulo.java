import java.util.ArrayList;
import java.util.Collections;

public class TesteTitulo {
    public static void main(String[] args) {
        ArrayList<Titulo> listaDeTitus = new ArrayList<>();
        listaDeTitus.add(new Titulo("Gravidade"));
        listaDeTitus.add(new Titulo("Vingadores"));
        listaDeTitus.add(new Titulo("Red"));

        Collections.sort(listaDeTitus);

        for (Titulo titulo : listaDeTitus) {
            System.out.println(titulo.nome);
        }
    }
}
