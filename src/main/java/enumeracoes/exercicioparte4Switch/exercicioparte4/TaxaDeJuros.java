package enumeracoes.exercicioparte4Switch.exercicioparte4;

import java.security.spec.ECField;

public class TaxaDeJuros {

    // Recebe = STANDARD e GOLD: 3.05%PREMIUM: 2.95%BLACK: 1.98%
//    Recebe o tipo de conta por parâmetro.
//    Retorna a taxa de juros de um mês de financiamento para cada tipo de cartão:


    public Float obtenTaxaDeJurosPorCartao(TipoCartao tipoCartao){

       switch (tipoCartao){
           case STANDARD:
           case GOLD:
               return 3.05F;
           case PREMIUM:
               return 2.95F;
           case BLACK:
               return 1.98F;
           default:
               throw new RuntimeException("Taxa de juros n configurada para este card.");
       }

    }


}
