package colecoes.Exercicios03;

import java.util.Comparator;

public class ProdutoComparatorLucro implements Comparator<Produto> {

    public int compare(Produto produto, Produto outroProduto){
        return produto
                .getLucro()
                .compareTo(outroProduto.getLucro());
    }
}
