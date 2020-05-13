package colecoes;

import java.util.*;

public class ColecoesExemploSet {

    public static void main(String[] args) {

        //Lista de nomes: "Tom", "John", "Mary", "Peter", "David", "Alice", "Tom"

        HashSet<String> pessoas = new HashSet<>();
        pessoas.add("Tom");
        pessoas.add("John");
        pessoas.add("Mary");
        pessoas.add("Peter");
        pessoas.add("David");
        pessoas.add("Alice");
        pessoas.add("Tom");

        pessoas.remove("Tom");

        //Foreach
        for (String nome : pessoas){
            System.out.println(nome);
        }

        //LinkedList - Lista de quantidades: 3,2,1,4,5,6,6

        LinkedHashSet<Integer> quantidades = new LinkedHashSet<>();
        quantidades.add(3);
        quantidades.add(2);
        quantidades.add(1);
        quantidades.add(4);
        quantidades.add(5);
        quantidades.add(6);
        quantidades.add(6);

        //Foreach
        for (Integer qtd : quantidades){
            System.out.println(qtd);
        }

    }
}
