package colecoes.Exercicios03;

import colecoes.ordenacao.comparable.Despesa;
import colecoes.ordenacao.comparable.DespesaPorValorComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioOrdenacao {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        //Adiciona
        Produto produto1 = new Produto("Creme Dental", 29.49F, 2.99F);
        produtos.add(produto1);
        Produto produto2 = new Produto("Sabonete em Barra Corporal 90g", 22.99F, 3.30F);
        produtos.add(produto2);
        Produto produto3 = new Produto("Protetor Solar 30 FPS 200ml", 37.39F, 39.12F);
        produtos.add(produto3);
        Produto produto4 = new Produto("Fralda P Confort - 50 Unidades", 20.0F, 44.90F);
        produtos.add(produto4);
        Produto produto5 = new Produto("Condicionador 200ml", 100.90F, 15F);
        produtos.add(produto5);

        //A chamada do sort() dispara as chamadas para o compareTo()!!!
        // ordenacao por nome
        Collections.sort(produtos);
        System.out.println("Imprimindo lista Padrao: ");

        for (Produto produto : produtos){
            System.out.println(produto.getDescricaoCompleta());
        }

        ProdutoComparatorCusto comparador = new ProdutoComparatorCusto();
        Collections.sort(produtos, comparador);//Ordem pelo comparator

        //Imprime ordenado por valor???
        System.out.println("--------------------------------------------------------------");
        System.out.println("Imprimindo lista Ordenado pelo Custo de Aquisicao: ");

        for (Produto produto : produtos){
            System.out.println(produto.getDescricaoCompleta());
        }

        //ProdutoComparatorLucro comparadorLucro = new ProdutoComparatorLucro();
        Collections.sort(produtos, new ProdutoComparatorLucro());//Ordem pelo comparator

        //Imprime ordenado por valor???
        System.out.println("--------------------------------------------------------------");
        System.out.println("Imprimindo lista Ordenado pelo Lucro: ");

        for (Produto produto : produtos){
            System.out.println(produto.getDescricaoCompleta());
        }




    }
}
