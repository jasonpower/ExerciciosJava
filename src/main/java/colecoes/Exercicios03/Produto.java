package colecoes.Exercicios03;

public class Produto implements Comparable<Produto>  {

    private String nome;
    private Float custoAquisicao;
    private Float valorVenda;
    private Float lucro;

    public Produto(String nome, float custoAquisicao, float valorVenda ){
        this.nome = nome;
        this.custoAquisicao = custoAquisicao;
        this.valorVenda = valorVenda;
        this.lucro = valorVenda - custoAquisicao;
    }

    Float getCustoAquisicao(){
        return this.custoAquisicao;
    }

    Float getLucro() {return this.lucro; }

    public String getDescricaoCompleta(){
        return String.format("%s - R$ %.2f - R$ %.2f - R$ %.2f", this.nome, this.custoAquisicao, this.valorVenda, this.lucro);
    }

    //cria a comparacao com base o nome
    @Override
    public int compareTo(Produto comparaNome){

        return this.nome.compareTo(comparaNome.nome);
        //System.out.println("Comparando: "+this.custoAquisicao + " e " + comparaCusto.custoAquisicao + " Resultado: "+comparacao);
        //return comparacao;
    }

}
