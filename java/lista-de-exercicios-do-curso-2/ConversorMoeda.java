public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorEmDolar) {
        double cotacaoDolar = 5.50;
        double valorEmReal = valorEmDolar * cotacaoDolar;
        System.out.println("O valor em Reais é: R$ " + valorEmReal);
    }
}
