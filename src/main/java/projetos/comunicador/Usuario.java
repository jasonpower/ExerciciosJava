package projetos.comunicador;

public class Usuario {

    private String nome;
    private char status;

    public Usuario(String nome){
        this.nome = nome;
        this.status = '1';
    }

    public String getDescricao(){
        return this.nome;
    }
}
