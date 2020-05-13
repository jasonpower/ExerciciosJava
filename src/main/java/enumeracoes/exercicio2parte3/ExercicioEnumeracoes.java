package enumeracoes.exercicio2parte3;

import java.util.Scanner;

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

        while(true) {
            System.out.println("Informar a renda: ");
            Float valorRenda = new Scanner(System.in).nextFloat();

            TipoCartao cartao = modalidadeCredito.obtemTipoCartaoPelaRendaMensal(valorRenda);
            Float valorTaxaJuros = cartao.getTaxaDeJuros();
            System.out.format("Cartão (%.2f): %s - Taxa %.2f \n\n", valorRenda, cartao, valorTaxaJuros);
        }
    }
}
