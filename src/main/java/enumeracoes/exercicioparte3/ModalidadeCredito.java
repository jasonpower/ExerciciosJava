package enumeracoes.exercicioparte3;

public class ModalidadeCredito {

    public TipoCartao obtemTipoCartaoPelaRendaMensal(Float rendaMensal ){

        TipoCartao tipoRetorno = null;

        for(TipoCartao tipo : TipoCartao.values()){
            if(rendaMensal >= tipo.getRendaMinima() && rendaMensal <= tipo.getRendaMaxima()){
                tipoRetorno = tipo;
                break;
            }
        }

        return tipoRetorno;
    }
}
