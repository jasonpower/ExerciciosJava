package colecoes.ordenacao.comparable;

import java.util.Comparator;

public class DespesaPorValorComparator implements Comparator<Despesa> {

    @Override
    public int compare(Despesa umaDespesa, Despesa outraDespesa) {
        return umaDespesa
                .getValor()
                .compareTo(outraDespesa.getValor());
    }
}
