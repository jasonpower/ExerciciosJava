package enumeracoes.exercicio2parte3;

public enum TipoCartao {
    STANDARD(0F, 999F, 3.05F),
    GOLD(1_000F, 2_999F, 3.05F),
    PREMIUM(3_000F, 9_999F, 2.95F),
    BLACK(10_000F, 99_999F, 1.98F),
    MASTERBLACK(100_000f, Float.MAX_VALUE, null);

    private Float rendaMinima;
    private Float rendaMaxima;
    private Float taxaDeJuros;

    TipoCartao(Float rendaMinima, Float rendaMaxima, Float taxaDeJuros) {
        this.rendaMinima = rendaMinima;
        this.rendaMaxima = rendaMaxima;
        this.taxaDeJuros = taxaDeJuros;
    }

    public Float getTaxaDeJuros() {
        if(this.taxaDeJuros == null){
            throw new RuntimeException("Taxa de juros não configurada para este cartão!");
        }
        return this.taxaDeJuros;
    }

    public static TipoCartao obterTipoEnumPorRenda(Float rendaMensal){
        TipoCartao tipoRetorno = null;

        for(TipoCartao tipo : TipoCartao.values()){
            if(rendaMensal >= tipo.rendaMinima && rendaMensal <= tipo.rendaMaxima){
                tipoRetorno = tipo;
                break;
            }
        }
        return tipoRetorno;
    }
}
