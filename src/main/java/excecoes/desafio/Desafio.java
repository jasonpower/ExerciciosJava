package excecoes.desafio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
Ações possíveis:

    - Nada! Está ok assim
    - Try/Catch no método (trato no método)
    - Throws no método e no main (to nem aí)
    - Throws no método e try/catch no main (trato no main)
    - Mudo a lógica (adiciono um if/else por exemplo)
 */
public class Desafio {

    //1 - Trate as exceções a seguir:
    public static void main(String args[]) {
        try{
            excecoesNumericas();
        }catch (ArithmeticException e){
            System.out.println ("Não pode ser feita divisão por zero!");
        }

        nullPointerException();
        try {
            indexOfBounds();
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        arquivoInexistente();
        erroDeConversao();
        try {
            disparoDeExcecao();
        }catch (IllegalArgumentException e){
            System.out.println("Ocorreu um erro desconhecido");
        }
    }

    private static void disparoDeExcecao() {
        //[..]
        throw new IllegalArgumentException();
        //[..]
    }

    private static void erroDeConversao() {
        try {
            int num = Integer.parseInt("zero");
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("Erro ao parsear a string: "+e.getMessage());
        }
    }

    private static void arquivoInexistente() {
        try {
            File file = new File("E://arquivo.txt");
            FileReader fr = new FileReader(file);
        }catch (FileNotFoundException exception){
            System.err.println("Arquivo não existe!");
        }
    }

    private static void indexOfBounds() {
        String e = "Imersao Java";
        if(e.length() > 29){
            char f = e.charAt(29);
        }else{
            throw new RuntimeException("Posição inválida!");
        }
        System.out.println(e);
    }

    private static void nullPointerException() {
        String d = null;

        if(d != null){
            System.out.println(d.charAt(0));
        }
    }

    private static void excecoesNumericas() throws ArithmeticException {
        int a = 30, b = 0;
        int c = a/b;
        System.out.println ("Resultado = " + c);
    }
}