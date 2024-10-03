public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFarenheit(double tempEmC) {
        double tempEmFaren = ((9 * tempEmC) / 5) + 32;
        System.out.println("A temperatura em °F é: " + tempEmFaren);
    }

    @Override
    public void farenheitParaCelsius(double tempEmFaren) {
        double tempEmC = (tempEmFaren - 32) * 5 / 9;
        System.out.println("A temperatura em °C é: " + tempEmC);
    }
    
}
