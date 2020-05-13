package enumeracoes.exercicioparte4Switch.exercicioparte4;

public class ModalidadeCredito {

    public TipoCartao obtemTipoCartaoPelaRendaMensal(Float rendaMensal ){


        return TipoCartao.obterTipoEnumPorRenda(rendaMensal);
    }
}
