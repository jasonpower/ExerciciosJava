package projetos.comunicador;

import java.util.Scanner;

public class Chat {

    //Métodos estáticos só acessam atributos estáticos
    private static Mensagem[] listaMensagens = new Mensagem[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        Usuario novoUsuario = new Usuario(nome);

        int contador = 0;
        while (true) {
            System.out.println("Escreva sua mensagem ou escreva 'sair': ");
            String texto = scanner.nextLine();
            if(texto.equals("sair")){
                break;
            }
            Mensagem novaMensagem = new Mensagem(texto, novoUsuario);
            listaMensagens[contador++] = novaMensagem;
        }

        System.out.println("Lista de mensagens:");
        for(Mensagem mensagem : listaMensagens){
            if(mensagem != null){
                System.out.println(mensagem.getDescricao());
            }
        }
    }
}
