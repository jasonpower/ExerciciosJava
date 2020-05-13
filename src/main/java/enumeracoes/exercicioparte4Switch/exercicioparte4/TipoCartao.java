package enumeracoes.exercicioparte4Switch.exercicioparte4;

public enum TipoCartao {
    STANDARD(0F, 999F),
    GOLD(1_000F, 2_999F),
    PREMIUM(3_000F, 9_999F),
    BLACK(10_000F, 99_999F),
    MASTERBLACK(100_000f, Float.MAX_VALUE);

    private Float rendaMinima;
    private Float rendaMaxima;

    TipoCartao(Float rendaMinima, Float rendaMaxima) {
        this.rendaMinima = rendaMinima;
        this.rendaMaxima = rendaMaxima;
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
