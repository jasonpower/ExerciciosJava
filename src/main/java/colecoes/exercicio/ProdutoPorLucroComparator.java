package colecoes.exercicio;

import java.util.Comparator;

public class ProdutoPorLucroComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto produto, Produto outroProduto) {
        return produto.getLucro().compareTo(outroProduto.getLucro());
    }
}
