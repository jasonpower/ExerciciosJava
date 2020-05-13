package enumeracoes.exercicioparte3;

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

    public Float getRendaMinima() {
        return this.rendaMinima;
    }

    public Float getRendaMaxima() {
        return this.rendaMaxima;
    }
}
