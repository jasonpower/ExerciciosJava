package excecoes;

public class B {
    public String getDescricaoClasseB() throws MinhaException{
        C terceira = new C();
        return terceira.getDescricaoClasseC();
    }

}
