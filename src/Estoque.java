import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
            System.out.printf("Produto: %s, Preço com Desconto: %.2f%n", produto.nome, produto.calcularDesconto(porcentagem));
        }
    }
}
