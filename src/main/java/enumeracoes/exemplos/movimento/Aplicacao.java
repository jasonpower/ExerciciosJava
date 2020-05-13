package enumeracoes.exemplos.movimento;

import java.util.Arrays;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        List<Transacao> transacoes = Arrays.asList(
                new Transacao("Compra iFood", 50F, "DEBITO"),
                new Transacao("Picpay", 25F, "CREDITO"),
                new Transacao("Saque caixa 24h", 25F, "SAQUE")
        );

        for (Transacao transacao : transacoes){
            save(transacao);
            System.out.println(transacao.getDescricaoCompleta());
        }

    }

    private static void save(Transacao transacao) {
        if(transacao.getTipo().equals("DEBITO")){
            //tira saldo
        }
        if(transacao.getTipo().equals("CREDITO")){
            //incrementa saldo
        }

        //fake
    }
}
