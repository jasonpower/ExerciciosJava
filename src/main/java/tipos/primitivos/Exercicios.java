package tipos.primitivos;

public class Exercicios {

    public static void main(String[] args) {

        //- (1) crie um método que: Imprima todos os números de 150 a 300.
        //imprimeDe150a300();

        //- (2) crie um método que: Imprima a soma de 1 até 1000.
        //imprimeSomaDe1Ate1000();

        //- (3) crie um método que: Imprima todos os múltiplos de 3, entre 1 e 100.
        imprimeMultiplos3();

    }

    private static void imprimeMultiplos3() {
        int multiplo = 3;
        int maximo = 100;

        System.out.println("Imprime multiplos: ");
        for (int contador = multiplo; contador <= maximo; contador += multiplo) {
            System.out.println("Múltiplo: "+contador);
        }

        for (int contador = multiplo; contador <= maximo; contador ++) {
            if(contador % multiplo == 0){
                System.out.println("Múltiplo: "+contador);
            }
        }

    }

    private static void imprimeSomaDe1Ate1000() {

        int soma = 0;
        int contador = 1;

        while (contador <= 1_000){
            //soma = soma+contador;
            soma += contador;
            contador++;
        }
        System.out.println("Soma: "+soma);

    }

    private static void imprimeDe150a300() {
        System.out.println("150 a 300");
        for(int contador = 150; contador <= 300; contador++){
            System.out.println(contador);
        }
    }

}
