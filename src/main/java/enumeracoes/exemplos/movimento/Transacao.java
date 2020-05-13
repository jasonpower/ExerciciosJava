package enumeracoes.exemplos.movimento;

import java.time.LocalDateTime;

public class Transacao {

    private String descricao;
    private LocalDateTime timestamp;
    private Float valor;
    private TipoMovimento tipo;

    public Transacao(String descricao, Float valor, String tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.timestamp = LocalDateTime.now();
        this.tipo = TipoMovimento.valueOf(tipo);
    }

    public String getDescricaoCompleta() {
        return String.format("%s - %s - Sigla: %s",
                this.descricao, this.tipo, this.tipo.getSigla());
    }

    public TipoMovimento getTipo() {
        return this.tipo;
    }
}
