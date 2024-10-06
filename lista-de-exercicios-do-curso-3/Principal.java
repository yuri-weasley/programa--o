import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Mário", 23);
        Pessoa pessoa2 = new Pessoa("Ana Júlia", 29);
        Pessoa pessoa3 = new Pessoa("Akemi", 18);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanha do Array: " listaDePessoas.size());

        System.out.println("O primeiro da lista é: " + listaDePessoas.get(0));

        System.out.println("Lista de pessoas:");
        for (Pessoa pessoa: listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
