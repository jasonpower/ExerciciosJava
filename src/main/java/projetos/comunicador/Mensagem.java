package projetos.comunicador;

import java.time.LocalDateTime;

public class Mensagem {

    private String texto;
    private LocalDateTime timestamp;
    private Usuario autor;

    public Mensagem(String texto, Usuario autor) {
        this.texto = texto;
        this.autor = autor;
        this.timestamp = LocalDateTime.now();
    }

    public String getDescricao() {
        return String.format("Mensagem: %s\nData/Hora: %s\nAutor: %s\n\n",
                this.texto, this.timestamp, this.autor.getDescricao());
    }
}
