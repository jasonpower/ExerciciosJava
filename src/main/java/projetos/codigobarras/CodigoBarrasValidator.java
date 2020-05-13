package projetos.codigobarras;

//- Lançamos um novo tipo de código de barras composto de 22 dígitos
//- Os 20 números primeiros números são a numeração definida pelo estabelecimento e os 2 restantes são os dígitos verificadores.
//- Os dígitos verificadores são compostos da soma dos 20 primeiros números.
//- Caso a soma ultrapasse 99, ou seja, use mais de 2 casas, são consideradas somente as duas últimas casas.
public class CodigoBarrasValidator {

    public static void main(String[] args) {

//        String codigoBarras = "2135785552341234567843";// Deveria ser 86
//        String codigoBarras = "4242342342342423423423";//Digito 61 - invalido
//        String codigoBarras = "9889997999899989797970";//Digito 170 - válido
        String codigoBarras = "127919";//Menor tamanho - inválido

        boolean valido = validaCodigoBarras(codigoBarras);

        if(valido){
            System.out.println("* Código de Barras válido!");
        }else{
            System.err.println("* Código de Barras inválido!");
        }

    }

    public static boolean validaCodigoBarras(String codigoBarras){

        //TODO mover para fora do método!
        final int TAMANHO_CODIGO_BARRAS = 22;

        if(codigoBarras.length() != TAMANHO_CODIGO_BARRAS){
            System.err.println("* Tamanho deve ser igual a 22!");
            return false;
        }

        int digitosExtraidos = extraiDigitoVerificador(codigoBarras);
        int digitoCalculado = calculaDigitoVerificador(codigoBarras);

//Versão mais extensa....
//        boolean ehValido = digitoCalculado == digitosExtraidos;
//        if(ehValido){
//            return true;
//        }else{
//            return false;
//        }
//        return ehValido;

        //Versão compacta
        return digitoCalculado == digitosExtraidos;
    }

    public static int extraiDigitoVerificador(String codigoBarras){

        String doisUltimosDigitos = codigoBarras.substring(codigoBarras.length() - 2);
        System.out.println(" -> Dois últimos digitos: " + doisUltimosDigitos);
        int digitos = Integer.parseInt(doisUltimosDigitos);

        return digitos;
    }

    public static int calculaDigitoVerificador(String codigoBarras){

        String codigoSemVerificador = codigoBarras.substring(0, codigoBarras.length()-2);
        System.out.println(" -> Código sem verificador: "+ codigoSemVerificador);

        int soma = 0;
        char[] codigoEmChars = codigoSemVerificador.toCharArray();
        for(char digito : codigoEmChars){
            soma += Integer.parseInt(String.valueOf(digito));
        }
        System.out.println(" -> Soma: "+ soma);

        int digito = soma;

        if(soma > 99){
            digito = soma%100;
        }

        System.out.println(" -> Digito verificador: "+ digito);
        return digito;
    }

}
