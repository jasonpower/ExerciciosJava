package tipos;

import java.math.BigDecimal;

public class ExemplosTipos {

    public static void main(String[] args) {
        //Ano atual
        short anoAtual = 2020;

        //Quantidade de vendas de um dia de uma pequena empresa (1023)
        int quantidadeVendasDia = 1023;

        //Situação de um boleto (pago/não pago)
        boolean boletoPago = true;

        //Não usem os três estados do boolean...
        Boolean f = false;
        Boolean tr = true;
        Boolean n = null;

        //Tipo de pagamento (Crédito, Débito)
        char tipoPagamento = 'C';// 'D'

        //Dados binários, por exemplo, um documento
        byte[] documento = new byte[]{};

        //CNPJ
        String cnpj = "05.104.996/0001-20";

        //Valor de um produto, considerando itens de uma farmácia
        float valorProdutoFarmacia = 167.67F;
        BigDecimal valorProdutoBig = BigDecimal.valueOf(167.67);

        //Código de barras de um Produto
        String codigoBarrasProduto = "83282380989230230923";
    }

}
