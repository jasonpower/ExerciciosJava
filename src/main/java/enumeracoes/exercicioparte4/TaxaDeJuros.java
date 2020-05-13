package enumeracoes.exercicioparte4;

public class   TaxaDeJuros {

    // Recebe = STANDARD e GOLD: 3.05%PREMIUM: 2.95%BLACK: 1.98%
//    Recebe o tipo de conta por parâmetro.
//    Retorna a taxa de juros de um mês de financiamento para cada tipo de cartão:


    public Float obtenTaxaDeJurosPorCartao(TipoCartao tipoCartao){

        if (tipoCartao.STANDARD.equals(tipoCartao) || TipoCartao.GOLD.equals(tipoCartao)){
            return 3.05F;
        }else if (TipoCartao.PREMIUM.equals(tipoCartao)){
            return 2.95F;
        }else if(TipoCartao.BLACK.equals(tipoCartao)){
            return 1.98F;
        }else {
            throw new   RuntimeException("Taxa de Juros n configurada");
        }

    }


}
