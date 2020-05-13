package colecoes.Exercicios03;

import colecoes.ordenacao.comparable.Despesa;

import java.util.Comparator;

public class ProdutoComparatorCusto implements Comparator<Produto> {


    public int compare(Produto produtoUm, Produto outroProduto) {
        return produtoUm
                .getCustoAquisicao()
                .compareTo(outroProduto.getCustoAquisicao());
    }

}
