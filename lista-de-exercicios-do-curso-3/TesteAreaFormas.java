import java.util.ArrayList;

public class TesteAreaFormas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listaDeForma = new ArrayList<>();
        listaDeForma.add(quadrado);
        listaDeForma.add(circulo);

        for (Forma forma : listaDeForma) {
            System.out.println("Área: " + forma.calcularArea() + " u.a");
        }
    }
}
