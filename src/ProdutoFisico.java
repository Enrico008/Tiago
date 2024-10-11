public class ProdutoFisico extends Produto {
    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco * (1 - porcentagem / 100);
    }
}
