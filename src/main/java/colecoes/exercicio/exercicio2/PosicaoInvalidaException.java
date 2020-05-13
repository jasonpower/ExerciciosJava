package colecoes.exercicio.exercicio2;

public class PosicaoInvalidaException extends Exception {

    //private String mensagem;

    public PosicaoInvalidaException(String mensagem) {
        //this.mensagem = mensagem;
        super(mensagem);//Por que?? Por que já existe um atributo MESSAGE dentro da Exception
    }

    //public String getMensagem() {
    //    return this.mensagem;
    //}
}
