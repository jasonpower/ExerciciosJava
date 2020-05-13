package colecoes;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class ColecoesExercicio2 {

    //Constante
    // private - visibilidade - não uso fora dessa classe
    // static final - criando uma constante...
    private static final int COLUNA_NOME_DO_PAIS = 1;

    public static void main(String[] args) throws IOException {

        //Leitura de arquivo
        Scanner scanner = new Scanner(Path.of("src/main/resources/campeoes.csv"));

        List<String> paises = new ArrayList<>();

        while (scanner.hasNext()) {
            //ano - pais
            String linha = scanner.nextLine();

            String pais = linha
                    .split("-")[COLUNA_NOME_DO_PAIS]
                    .trim();

            paises.add(pais);
        }

        Iterator<String> paisesIterator = paises.iterator();

        while (paisesIterator.hasNext()){
            System.out.println(paisesIterator.next());
        }

//        Collections.sort(paises);
//        Map<String, Integer> campeoes = new LinkedHashMap<>();
        //OU
        Map<String, Integer> campeoes = new TreeMap<>();

        for (String pais : paises){
            //int quantidadeTitulos = 0;

            //Se não está ainda no map = 1
            if( ! campeoes.containsKey(pais)){// ! -> inverte
                int quantidadeTitulos = 1;
                campeoes.put(pais, quantidadeTitulos);

            //Se já está no map, incrementa
            }else{
                int quantidadeAnterior = campeoes.get(pais);
                int quantidadeTitulos = quantidadeAnterior+1;
                campeoes.replace(pais, quantidadeTitulos);
            }

            //campeoes.put(pais, quantidadeTitulos);
        }

        //Imprime map
        for(Map.Entry<String, Integer> campeao: campeoes.entrySet()){
            System.out.println(campeao.getKey() + " -> " + campeao.getValue());
        }

    }
}
