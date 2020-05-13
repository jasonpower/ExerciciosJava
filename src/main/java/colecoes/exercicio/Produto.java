package colecoes.exercicio;

import excecoes.CustoAquisicaoNaoPodeSerNuloException;

public class Produto implements Comparable<Produto>{

    private String nome;
    private Float custoAquisicao;
    private Float valorVenda;

    public Produto(String nome, Float custoAquisicao, Float valorVenda) {
        this.nome = nome;
        if(this.custoAquisicao == null){
            //dispara uma exceção CustoAquisicaoNaoPodeSerNuloException

            CustoAquisicaoNaoPodeSerNuloException excecao = new CustoAquisicaoNaoPodeSerNuloException();
            throw excecao;
        }
        this.custoAquisicao = custoAquisicao;
        this.valorVenda = valorVenda;
    }

    public String getDescricao(){
        return String.format("%s - Aquisição: R$ %.2f Venda: R$ %.2f Lucro: R$ %.2f",
                this.nome, this.custoAquisicao, this.valorVenda, this.getLucro()
        );
    }

    Float getCustoAquisicao(){//Default - mesmo package tem acesso
        return this.custoAquisicao;
    }

    Float getLucro(){
        if(this.valorVenda == null){
            return 0 - this.custoAquisicao;
        }
        if(this.custoAquisicao == null){
            return this.valorVenda;
        }
        return this.valorVenda - this.custoAquisicao;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        //Desprioriza o null
        if(outroProduto == null || outroProduto.nome == null){
            return -1;
        }
        if(this.nome == null){
            return 1;
        }
        return this.nome.compareTo(outroProduto.nome);
    }
}
