package enumeracoes.exemplos.movimento;

public enum TipoMovimento {
    DEBITO ("D"),
    CREDITO ("C"),
    SAQUE ("S");

    /**
     * Cria atributos extras num ENUM
     * Atributo + Cronstrutor recebendo esse atributo
     */
    private String sigla;

    TipoMovimento(String sigla){
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
