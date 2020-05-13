package enumeracoes.exercicioparte1;

/*
    Exercício 1:

    Crie um novo pacote enumeracoes.
    Neste crie uma classe ExercicioEnumeracoes com o método main.
    No mesmo pacote crie a classe ModalidadeCredito e nela crie um método
    que devolve o tipo de cartão de uma financeira de acordo com a rendaMensal:
    < 1000: STANDARD
    < 3000: GOLD
    < 10000: PREMIUM
    >= 10000: BLACK
    Na classe ExercicioEnumeracoes, instancie a nova classe e faça algumas simulações
    para validar o comportamento.

 */
public class ExercicioEnumeracoes {
    public static void main(String[] args) {

        ModalidadeCredito modalidadeCredito = new ModalidadeCredito();

        //998
        TipoCartao cartao = modalidadeCredito.obtemTipoCartaoPelaRendaMensal(998F);
        System.out.println("Cartão (998): "+cartao);

        //10001
        TipoCartao cartao10001 = modalidadeCredito.obtemTipoCartaoPelaRendaMensal(10001F);
        System.out.println("Cartão (1001): "+cartao10001);

    }
}
