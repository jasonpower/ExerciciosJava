package visibilidade;

public class ClasseA {

    //Atributos
    private static int atributoA;
    static int atributoA2; // Default (sem visibilidade)
    public static int getAtributoA3;
    protected static int getAtributoA4;//Herança!!

    //Operações
    public static void metodoA(){
        int variavel;
        metodoA3();
    }

    static void metodoA2(){
        metodoA3();
    }

    private static void metodoA3(){
    }

}
