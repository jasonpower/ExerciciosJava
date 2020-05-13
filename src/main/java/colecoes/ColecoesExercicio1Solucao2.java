package colecoes;

import java.util.*;

public class ColecoesExercicio1Solucao2 {

    public static void main(String[] args) {

        List<String> pessoas = Arrays.asList("Kiersten", "Zaneta",
                "Frank", "Tedi", "Bryana", "Marigold", "Devan",
                "Jerrilyn", "Isac", "Kathrine", "Bryana");

//        Set<String> pessoas = Set.of("Kiersten", "Zaneta", "Frank", "Tedi", "Bryana",
//                "Marigold", "Devan", "Jerrilyn", "Isac", "Kathrine", "Bryana");

        Collections.sort(pessoas);
        LinkedHashSet<String> listaSemDuplicoes = new LinkedHashSet<>(pessoas);

        Object[] nomes = listaSemDuplicoes.toArray();

        //List<String> primeiros = Arrays.copyOfRange(nomes, 0, 3);

        List<String> primeiros = Arrays.asList(String.valueOf(nomes[0]),
                String.valueOf(nomes[1]), String.valueOf(nomes[2]));

        System.out.println(primeiros);
    }
}
