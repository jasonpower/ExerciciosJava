package comandos;

public class ExemploSwitch {

    public static void main(String[] args) {

        float valorInicial = 1000;
        float valorComDesconto = 0;

        // I - IOF
        // R - renda
        char tipoImposto = 'R';

        switch (tipoImposto){
            case 'I':
                valorComDesconto = (float) (valorInicial*0.94);
                break;// Cai fora do SWITCH
            case 'R':
                valorComDesconto = (float) (valorInicial*0.85);
                break;// Cai fora do SWITCH
            default:
                valorComDesconto = (float) (valorInicial*0.95);
        }

        System.out.println("Valor com desconto:");
        System.out.println(valorComDesconto);

    }
}
