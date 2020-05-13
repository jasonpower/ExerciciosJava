package visibilidade;

public class Pessoa {

    private String nome;

    //Construtor default
    public Pessoa(){
        System.out.println("Construtor padrão");
    }

    //Meu construtor com um argumento
    public Pessoa(String n){
        System.out.println("Construtor com nome");
        nome = n;
    }

    //Setter
    public void setNome(String n){
        nome = n;
    }

    //Getter
    public String getNome(){
        return nome;
    }

}
