import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
