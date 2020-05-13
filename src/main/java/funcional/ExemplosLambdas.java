package funcional;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ExemplosLambdas {

    public static void main(String[] args) {

        ArrayList<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(12);
        listaInteiros.add(7);
        listaInteiros.add(100);

        //Consumer: void accept(Integer t);
        //Lamba:        (Integer t) -> { return; }

//        listaInteiros.forEach((Integer t) -> { System.out.println(t);return; });//Tirei a tipagem Integer
//        listaInteiros.forEach((t) -> { System.out.println(t);return; });//Tirei os parenteses
//        listaInteiros.forEach(t -> { System.out.println(t);return; });// tirei o return, por que é void
//        listaInteiros.forEach(t -> { System.out.println(t); });//Tirei as chaves e ";", pois é um método só

//        listaInteiros.forEach( t -> System.out.println(t) );// Trocar por método por referência
        listaInteiros.forEach(ExemplosLambdas::meuMetodoQueAtendeAInterface);//Final
    }

    public static void meuMetodoQueAtendeAInterface(Integer i){
        System.out.println(i);
    }

    //public void accept(Integer t){
    //    System.out.println(t);
    //    return;
    //}

    //(Integer t) -> { System.out.println(t);return; }


}
