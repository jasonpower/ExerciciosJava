package visibilidade;

public class ClasseB {

    public static void main(String[] args) {

//        ClasseA.metodoA();
//        ClasseA.metodoA2();
//        ClasseA.atributoA2 = 1;

        Pessoa pessoaGilberto = new Pessoa();
        pessoaGilberto.setNome("Gilberto");

        pessoaGilberto = new Pessoa();


        System.out.println(pessoaGilberto.getNome());

        Pessoa pessoaPedro = new Pessoa("Pedro");
        //pessoaPedro.setNome("Pedro");

        System.out.println(pessoaPedro.getNome());

    }

}
