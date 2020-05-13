package funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemplosStream {
    public static void main(String[] args) {

        //ArrayList da Lista de linguagens: Java, PHP, C#, JS, Scala.
        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("C#");
        linguagens.add("JS");
        linguagens.add("Scala");
        linguagens.add("JS");

        List<String> linguagensComJ = linguagens
                //Criei a Stream
                .stream()

                //INTERMEDIÁRIAS - quantas eu quiser
                //.filter(  (linguagem) -> { return linguagem.contains("J"); }   )
                .filter(linguagem -> linguagem.contains("J"))
                //.filter(linguagem -> linguagem.contains("S"))
                .distinct()

                //FINAIS - Mata a Stream.
                //.collect(Collectors.joining(","));
                //.forEach(linguagem -> System.out.println(linguagem));
                //.count();
                .collect(Collectors.toList());

        linguagensComJ.forEach(linguagem -> System.out.println(linguagem));
    }
}
