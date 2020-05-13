package enumeracoes.exercicioparte2;

public class ModalidadeCredito {

    public TipoCartao obtemTipoCartaoPelaRendaMensal(Float rendaMensal ){

        //< 1000: STANDARD
        if(rendaMensal < 1000F){
            return TipoCartao.STANDARD;

        //< 3000: GOLD
        } else if(rendaMensal < 3000F){
            return TipoCartao.GOLD;

        //< 10000: PREMIUM
        } else if(rendaMensal < 10000F){
            return TipoCartao.PREMIUM;

        //>= 10000: BLACK
        }else{
            return TipoCartao.BLACK;
        }
    }
}
