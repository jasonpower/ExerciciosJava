package colecoes.ordenacao.comparable;

//implements - estou seguindo o contrato da inteface Comparable para a classe Despesa
// o que tem nesse contrato??  public int compareTo(T o);
public class Despesa implements Comparable<Despesa> {

    private String descricao;
    private Float valor;

    public Despesa(String descricao, float valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    //Visibilidade 'default' - acessa no mesmo package!!
    Float getValor(){
        return this.valor;
    }

    public String getDescricaoCompleta(){
        return String.format("%s - R$ %.2f", this.descricao, this.valor);
    }

    @Override
    //Ordenação padrão - por descrição
    public int compareTo(Despesa outraDespesa) {

        int comparacao = this.descricao.compareTo(outraDespesa.descricao);
        System.out.println("Comparando: "+this.descricao + " e " + outraDespesa.descricao + " Resultado: "+comparacao);

        //Se mesmo nome, compara a valor
        if(comparacao == 0){
            return this.valor.compareTo(outraDespesa.valor);
        }
        return comparacao;
    }
}
