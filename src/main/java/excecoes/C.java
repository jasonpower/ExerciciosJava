package excecoes;

public class C {
    public String getDescricaoClasseC() throws MinhaException {
        if(true)
            throw new MinhaException();

        return "Descrição da terceira classe (C)";
    }

}
