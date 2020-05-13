package colecoes.iterator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExemploIterator {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Path.of("src/main/resources/campeoes.csv"));
        List<String> paises = new ArrayList<>();
        while (scanner.hasNext()) {
            String linha = scanner.nextLine();
            String pais = linha
                    .split("-")[1]
                    .trim();
            paises.add(pais);
        }

        Iterator<String> paisesIterator = paises.iterator();

        StringBuilder paisesSeparadosPorVirgula = new StringBuilder();

        while (paisesIterator.hasNext()){
            String pais = paisesIterator.next();
            paisesSeparadosPorVirgula.append(pais);

            if(paisesIterator.hasNext()){
                paisesSeparadosPorVirgula.append(",");
            }else{
                paisesSeparadosPorVirgula.append(".");
            }
        }
        System.out.println(paisesSeparadosPorVirgula);
    }
}
