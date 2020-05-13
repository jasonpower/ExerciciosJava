package excecoes.excecoesExercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioExcecoes {

    private static Scanner escolhaDoUsuario = new Scanner(System.in);

    public static void main(String[] args)  {

        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("1 - Porto Alegre");
        cidades.add("2 - São Paulo");
        cidades.add("3 - Curitiba");
        cidades.add("4 - Rio de Janeiro");
        cidades.add("5 - Cuiabá");
        cidades.add("6 - São Luís");

        Collections.sort(cidades);

        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        while (true) {
            System.out.println("Digite o numero de uma Cidade da Lista: ");
            String escolha = escolhaDoUsuario.nextLine();

            for (String cidade : cidades) {

                String[] parte = cidade.split("-");
                String valorDaCidade = parte[0];

                //System.out.println("Escolha do usuario:"+escolha);
                //System.out.println("Numero da Cidade:"+valorDaCidade.trim());


                if (escolha.equals(valorDaCidade.trim())) {
                    System.out.println(cidade);
                    System.out.println("Voce escolheu a Cidade Numero: "+cidade);
                    return;
                }

                }
            System.out.println("Opção inválida, informe uma opção de 1 a 5");
            //break;
            }
        }

}