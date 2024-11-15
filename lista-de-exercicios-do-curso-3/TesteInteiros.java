import java.util.ArrayList;
import java.util.Collections;

public class TesteInteiros {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros = new ArrayList<>();

        inteiros.add(1);
        inteiros.add(9);
        inteiros.add(21);
        inteiros.add(6);
        System.out.println(inteiros);

        Collections.sort(inteiros);
        System.out.println(inteiros);
    }
}
