package enumeracoes.exercicio2parte2;

public class TaxaDeJuros {

    public Float obtemTaxaDeJurosPorTipoCartao(TipoCartao tipoCartao){

        switch (tipoCartao){
            case STANDARD:
            case GOLD:
                return 3.05F;
            case PREMIUM:
                return 2.95F;
            case BLACK:
                return 1.98F;
            default:
                throw new RuntimeException("Taxa de juros não configurada para este cartão!");
        }
    }
}
