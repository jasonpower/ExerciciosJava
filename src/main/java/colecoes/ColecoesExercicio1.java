package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ColecoesExercicio1 {
    public static void main(String[] args) {

/*
        Crie uma lista vazia chamada pessoas.
        Adicione os nomes:
        Kiersten, Zaneta, Frank, Tedi, Bryana, Marigold, Devan, Jerrilyn, Isac, Kathrine, Bryana.
                Ordene a lista alfabeticamente.
                Ignore as repetições.
        Copie os primeiros 3 nomes (após ordenar) a uma segunda lista chamada primeiros.
        Opções: * converter para array * for pegando parando na 3a. interação.
*/
        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Kiersten");
        pessoas.add("Zaneta");
        pessoas.add("Frank");
        pessoas.add("Tedi");
        pessoas.add("Bryana");
        pessoas.add("Marigold");
        pessoas.add("Devan");
        pessoas.add("Jerrilyn");
        pessoas.add("Isac");
        pessoas.add("Kathrine");
        pessoas.add("Bryana");

        Collections.sort(pessoas);

        LinkedHashSet<String> listaSemDuplicoes = new LinkedHashSet<>(pessoas);
        //listaSemDuplicoes.addAll(pessoas);

        LinkedList<String> primeiros = new LinkedList<>();

        int contador = 1;
        for (String nome : listaSemDuplicoes){
            if(contador++ > 3){
                break;
            }
            primeiros.add(nome);
        }

        for (String nome : primeiros){
            System.out.println(nome);
        }
    }
}
