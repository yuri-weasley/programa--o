public class ProdutoFisico implements Calculavel {

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
    
}
