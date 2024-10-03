public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int n) {
        while (n <= 10) {
            System.out.println("Exibindo a tabuada de: " + n);

            for(int multi = 0; multi <= 10; multi++) {
                System.out.println(n + " x " + multi + " = " + n * multi);
            }
            break;
        }
    }
    
}
