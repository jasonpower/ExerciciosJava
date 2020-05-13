package colecoes.ordenacao.comparable;

import java.util.*;

public class AplicacaoDespesa {
    public static void main(String[] args) {

//        List<Despesa> lista = Arrays.asList(
//                new Despesa("Netflix", 37.90F),
//                new Despesa("Mercado", 120.00F),
//                new Despesa("Fruteira", 60F)
//        );

        Set<Despesa> despesas = new TreeSet<>();

        //Adiciona
        Despesa despesa1 = new Despesa("Netflix", 37.90F);
        despesas.add(despesa1);

        Despesa despesa2 = new Despesa("Mercado", 120.00F);
        despesas.add(despesa2);

        Despesa despesa3 = new Despesa("Fruteira", 60F);
        despesas.add(despesa3);

        Despesa despesa4 = new Despesa("Amazon", 60F);
        despesas.add(despesa4);

        Despesa despesa5 = new Despesa("Fruteira", 10F);
        despesas.add(despesa5);

        //A chamada do sort() dispara as chamadas para o compareTo()!!!
        //Collections.sort(despesas);//Ordem padrão

        //Imprime ordenado por descrição - PADRÃO
        System.out.println("--------------------------------------------------------------");
        for (Despesa despesa : despesas){
            System.out.println(despesa.getDescricaoCompleta());
        }

        DespesaPorValorComparator comparador = new DespesaPorValorComparator();
        //Collections.sort(despesas, comparador);//Ordem pelo comparator

        Set<Despesa> novaLista = new TreeSet<>(comparador);
        novaLista.addAll(despesas);

        //Imprime ordenado por valor???
        System.out.println("--------------------------------------------------------------");
        for (Despesa despesa : novaLista){
            System.out.println(despesa.getDescricaoCompleta());
        }
    }
}
