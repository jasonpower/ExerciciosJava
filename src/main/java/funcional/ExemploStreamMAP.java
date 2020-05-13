package funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStreamMAP {

    public static void main(String[] args) {

        List<String> erros = Arrays.asList("Erro inesperado", "Erro Catastrófico");

//        List<RuntimeException> excecoes = new ArrayList<>();
//
//        excecoes.add(new RuntimeException(erros.get(0)));
//        excecoes.add(new RuntimeException(erros.get(1)));
//
//        for (RuntimeException e : excecoes){
//            System.out.println(e.getMessage());
//        }

        erros.stream()
                //.map( (mensagem) -> {return new RuntimeException(mensagem);})//Longo
                //.map(mensagem -> new RuntimeException(mensagem))Curto
                .map(RuntimeException::new)//Método por referência
                .map(e -> new RuntimeException("dasdasdas"))
                .filter(excecao -> excecao.getMessage().contains("Erro"))
                .forEach(excecao -> System.out.println(excecao.getMessage()));

        Stream.of("imeedendorpe1@usa.gov",
                "dbattram2@google.ru");

    }
}
