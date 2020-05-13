package excecoes;

public class A {
    public String getDescricaoClasseA() {
        B segunda = new B();
        try {
            return segunda.getDescricaoClasseB();
        }catch (MinhaException excecao){
            System.out.println("Ocorreu um erro: "+ excecao);
            excecao.printStackTrace();//Não usa em produção
            return "Deu erro e parei na classe A... Dai retornei isso :D";
        }


    }

}
