package enumeracoes.exercicio2parte1;

public class ModalidadeCredito {

    public TipoCartao obtemTipoCartaoPelaRendaMensal(Float rendaMensal ){
        return TipoCartao.obterTipoEnumPorRenda(rendaMensal);
    }
}
