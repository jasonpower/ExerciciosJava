package enumeracoes.exercicio2parte2;

public class ModalidadeCredito {

    public TipoCartao obtemTipoCartaoPelaRendaMensal(Float rendaMensal ){
        return TipoCartao.obterTipoEnumPorRenda(rendaMensal);
    }
}
