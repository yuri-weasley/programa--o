//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao conversor de temperaturas!");

        double tempEmCelsius = 20;
        System.out.println("A temperatura que se deseja ser convertida é: " + tempEmCelsius + "°C.");

        double tempEmFaren = ((9 * tempEmCelsius) / 5) + 32;
        System.out.println("A temperatura é, em °F: " + tempEmFaren + "°F.");
    }
}
/* SOLUÇÃO DA PROF:

* public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }
}
* */