package aulasprimeraparte.strings;

import java.util.Scanner;

public class ExercicioString {

    public static void main(String[] args) {

        String texto;
        texto = solicitarTexto();

        if(texto.length() <= 140){
            System.out.println(texto);
        }else {
            String textoCortado = texto.substring(0, 140).concat("...");
            System.out.println(textoCortado);
        }
    }

    private static String solicitarTexto(){
        String texto = new Scanner(System.in).nextLine();
        return texto;
    }
}
