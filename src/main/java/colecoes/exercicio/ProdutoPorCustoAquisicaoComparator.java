package colecoes.exercicio;

import java.util.Comparator;

public class ProdutoPorCustoAquisicaoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto produtoUm, Produto outroProduto) {

        if(outroProduto.getCustoAquisicao() == null){
            return -1;
        }

        if(produtoUm.getCustoAquisicao() == null){
            return 1;
        }

        return produtoUm.getCustoAquisicao().compareTo(outroProduto.getCustoAquisicao());
    }
}
