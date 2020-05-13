package enumeracoes.exercicio2parte1;

public class TaxaDeJuros {

    public Float obtemTaxaDeJurosPorTipoCartao(TipoCartao tipoCartao){

        //STANDARD e GOLD: 3.05%
        if(TipoCartao.STANDARD.equals(tipoCartao) || TipoCartao.GOLD.equals(tipoCartao)){
            return 3.05F;

        //PREMIUM: 2.95%
        }else if(TipoCartao.PREMIUM.equals(tipoCartao)){
            return 2.95F;

        //BLACK: 1.98%
        }else if(TipoCartao.BLACK.equals(tipoCartao)){
            return 1.98F;

        }else{
            throw new RuntimeException("Taxa de juros não configurada para este cartão!");
        }

    }
}
