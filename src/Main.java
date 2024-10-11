public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(new ProdutoFisico("Camiseta", 100.00));
        estoque.adicionarProduto(new ProdutoDigital("E-book", 50.00));

        estoque.exibirPrecosComDesconto(10); // 10% de desconto
    }
}
