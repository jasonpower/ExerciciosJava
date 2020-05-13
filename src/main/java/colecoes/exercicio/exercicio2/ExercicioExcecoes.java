package colecoes.exercicio.exercicio2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExercicioExcecoes {

    public static void main(String[] args) {

        List<String> cidades = Arrays.asList("Porto Alegre", "Curitiba", "São Paulo",
                                             "Rio de Janeiro", "Cuiabá", "São Luís.");

        while (true) {
            try {
                String nomeCidade = pedePosicaoERetornaNomeCidade(cidades);
                System.out.println("Você escolheu: " + nomeCidade);
                break;

            //Outras opções:

            //Multi-catch
            //}catch (PosicaoInvalidaException | InputMismatchException excecao){
            //    System.out.println(excecao.getMessage());

            // try com múltiplos catchs!
            //}catch (InputMismatchException e){
            //    System.out.println(e.getMessage());

            }catch (PosicaoInvalidaException excecao){
                System.out.println(excecao.getMessage());

            }
        }
    }

    public static String pedePosicaoERetornaNomeCidade(List<String> cidades) throws PosicaoInvalidaException {
        System.out.println("Informe a posição de uma das cidades [0-5]: ");
        int posicao = 0;

        try {
            posicao = new Scanner(System.in).nextInt();
        }catch (InputMismatchException e){
            throw new PosicaoInvalidaException("Você deve informar apenas números! Tente novamente!");
        }

        if (posicao < 0 || posicao >= cidades.size()) {
            throw new PosicaoInvalidaException("Informou posição inválida! Tente novamente!");
        }

        return cidades.get(posicao);
    }

}
