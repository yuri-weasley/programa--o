public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double ladoMaior, double ladoMenor) {
        double area = ladoMaior * ladoMenor;
        System.out.println("A área da sala é (em unidades de área): " + area);
    }

    @Override
    public void calcularPerimetro(double ladoMaior, double ladoMenor) {
        double perimetro = (ladoMaior * 2) + (ladoMenor * 2);
        System.out.println("O perímetro da sala é (em unidade de medida): " + perimetro);
    }
    
}
