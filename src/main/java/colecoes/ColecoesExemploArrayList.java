package colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class ColecoesExemploArrayList {

    public static void main(String[] args) {

        //ArrayList Lista de linguagens: Java, PHP, C#, JS, Scala.
        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("C#");
        linguagens.add("JS");
        linguagens.add("Scala");

        //Ordenação explícita para tipos não auto ordenados (ArrayList, LinkedList, HashSet)
        Collections.sort(linguagens);

        //Vai ficar desordenado...
        linguagens.add("BashScript");

        for (String ling : linguagens){
            System.out.println(ling);
        }

        boolean temPHP = linguagens.contains("PHP");
        System.out.println("Contém PHP? " + temPHP);

        String primeiroElemento = linguagens.get(0);
        System.out.println("Primeiro elemento: "+primeiroElemento);

        linguagens.remove(0); // OU: linguagens.remove("C#");

        int posicao = linguagens.indexOf("Scala");
        System.out.println("A Scala está na posição: "+posicao);

        for (String ling : linguagens){
            System.out.println(ling);
        }

    }
}
