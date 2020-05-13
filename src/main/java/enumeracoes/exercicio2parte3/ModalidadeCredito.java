package enumeracoes.exercicio2parte3;

public class ModalidadeCredito {

    public TipoCartao obtemTipoCartaoPelaRendaMensal(Float rendaMensal ){
        return TipoCartao.obterTipoEnumPorRenda(rendaMensal);
    }
}
