package aulasprimeraparte.strings;

public class ExemplosString {

    public static void main(String[] args) {

//        concat();

//        bufferEBuilder();

        alteracaoStrings();
    }

    private static void concat() {
        String nomeEstabelecimento = "Bom sabor";

        int tamanho = nomeEstabelecimento.length();

        String texto = String.format(
                "Nome \"%s\" tem \"%s\" caracteres",
                nomeEstabelecimento, tamanho);

        System.out.println(texto);

        String textoConcat = "Nome ".concat(nomeEstabelecimento)
                .concat(" tem ").concat(String.valueOf(tamanho))
                .concat("caracteres");

        System.out.println(textoConcat);
    }

    private static void alteracaoStrings() {
        String original = "Padaria Bom Sabor: Melhor sonho da cidade!";
        String modificada = original.replace("a", "b");

        String[] partes = original.split(":");
        System.out.println(partes[0].replace("Padaria", "").trim());
        System.out.println(partes[1].trim());

        for(int cont=0; cont < partes.length;cont++){
            System.out.println(partes[cont]
                    .replace("Padaria", "")
                    .trim());
        }

        for(String parte : partes){
            System.out.println(parte.replace("Padaria", "").trim());
        }
    }

    private static void bufferEBuilder() {

        //new Scanner(System.in).nextLine()
        String nomeEstabelecimento = "Bom sabor";

        StringBuffer buffer = new StringBuffer();
        buffer.append("Nome ");
        buffer.append(nomeEstabelecimento);
        buffer.append(" tem ");
        buffer.append(nomeEstabelecimento.length());
        buffer.append(" carateres! ");

        String texto = buffer.toString();

        //Builder
        String textoBuilder = new StringBuilder()
            .append("Nome ").append(nomeEstabelecimento)
            .append(" tem ").append(nomeEstabelecimento.length()).append(" carateres! ")
            .toString();

        System.out.println(textoBuilder);
    }
}
