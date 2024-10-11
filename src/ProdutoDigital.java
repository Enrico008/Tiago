public class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco * (1 - (porcentagem + 5) / 100); // 5% a mais de desconto
    }
}
