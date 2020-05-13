package aulasprimeraparte.primitivos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        //idade
        byte idade = 32;

        if (idade > 30) {
            System.out.println("Sujeito a corona");
            System.out.println("Deu ruim...");
        }

        if (idade >= 30) {
            System.out.println("Sujeito a corona");
        } else {
            System.out.println("Escapou!");
        }

        boolean idadeDeRisco = idade >= 30 || idade < 5;

        //if(idade >= 30 && idade < 5) { // AND
        if (idadeDeRisco) { // AND
            System.out.println("Sujeito a corona");
        } else if (idade == 0 || idade == 1) { // OR
            System.out.println("Perigo!");
        } else if (idade > 10) {
            System.out.println("Cuidado!");
        } else {
            System.out.println("Escapou!");
        }

        //ano atual
        short anoAtual = 2020;

        for (int temp = anoAtual; temp < 2040; temp++) {
            System.out.println("-" + temp);
        }
        System.out.println("Ano Atual: " + anoAtual);

        //está chovendo?
        boolean estaChovendo = true;

        int umidade = 100;
        while (true) {
            System.out.println("Está chovendo!");
            if(umidade < 80){
                System.out.println("Parou de chover!");
                break;
            }
            umidade--;
        }

        //valor de Pi (3.141592653589793)
        double pi = 3.141592653589793D;

        //a primeira letra do seu nome
        char letraNome = 'G';


        char tipoVirus = 'B';
        float letalidade = 0;

        switch(tipoVirus){
            case 'A':
                letalidade = 4.5F;
                System.out.println("A");
                break;
            case 'B':
                letalidade = 15.5F;
                System.out.println("B");
                break;
            case 'C':
                letalidade = 6;
                System.out.println("C");
                break;
            default:
                System.out.println("DEFAULT");
                letalidade = 1;
        }
        System.out.println("letalidade: "+ letalidade);


        //preço do dólar hoje em reais ()
        float dolarHoje = 4.76F;

        //população do Brasil (209,3 milhões)
        //Poderia ser long
        int populacaoBrasil = 209_300_000;

        //população mundial (7,7 bilhões)
        long populacaoMundial = 7_700_000_000L;

        System.out.println(
                "idade: " + idade + "\n" +
                        "anoAtual: " + anoAtual + "\n" +
                        "estaChovendo: " + estaChovendo + "\n" +
                        "pi " + pi + "\n" +
                        "letraNome: " + letraNome + "\n" +
                        "dolarHoje: " + dolarHoje + "\n" +
                        "populacaoBrasil: " + populacaoBrasil + "\n" +
                        "populacaoMundial: " + populacaoMundial
        );
    }
}
