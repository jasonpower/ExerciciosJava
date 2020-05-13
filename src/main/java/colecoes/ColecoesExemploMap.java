package colecoes;

import java.util.HashMap;
import java.util.Map;

public class ColecoesExemploMap {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("RS", "");
        map.put("RS", "Porto Alegre");
        map.put("SC", "Florianópolis");
        map.put("PR", "Curitiba");
        map.put(null, "Rio Branco");//Null é permitido, menos no tree.

        //Obtém
        String valorRS = map.get("RS");
        System.out.println("Capital do RS: "+ valorRS);

        //Valores
        for (String estado : map.values()){
            System.out.println(estado);
        }

        //Chave/valor
        for (Map.Entry estado : map.entrySet()){
            System.out.println(estado.getKey() +" -> "+ estado.getValue());
        }
    }
}
