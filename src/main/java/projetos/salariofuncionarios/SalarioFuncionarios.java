package projetos.salariofuncionarios;

import java.io.InputStream;
import java.util.Scanner;

/*
Exercício: SalarioFuncionarios
        Precisamos mostrar a lista de pessoas da empresa e seu salário com benefícios.
        Os funcionarios estão no arquivo "pessoas.csv" fornecido
        O resultado esperado para cada funcionário é: nome completo (nome + sobrenome) e o valor da soma do do salário + benefícios.
        Para juntar as strings utilizar StringBuilder.
*/
public class SalarioFuncionarios {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(Path.of("src/main/java/resources/pessoas.csv"));
//        InputStream resource = SalarioFuncionarios.class.getResourceAsStream("/pessoas.csv");
//        Scanner scanner = new Scanner(resource);

        System.out.printf("%-20s %s\n\n", "Nome", "Salário+Benefícios");

        Scanner scanner = lerArquivo("/pessoas.csv");

        while (scanner.hasNextLine()){
            String[] partes = scanner.nextLine().split(",");

            String nome = obtemNomeCompleto(partes);
            Float salario = obtemSalarioComBeneficios(partes);

            System.out.printf("%-20s R$ %.2f\n", nome, salario);
        }
    }

    public static Scanner lerArquivo(String arquivo){
        InputStream resource = SalarioFuncionarios.class.getResourceAsStream(arquivo);
        Scanner scanner = new Scanner(resource);

        if(scanner.hasNextLine()){
            System.out.printf("Linha ignorada: %s\n\n", scanner.nextLine());
        }

        return scanner;
    }

    public static String obtemNomeCompleto(String[] partes){
//        String[] partes = linha.split(",");

        String nomeCompleto = new StringBuilder()
         .append(partes[1])
         .append(" ")
         .append(partes[2])
        .toString();

        return nomeCompleto;
    }

    public static Float obtemSalarioComBeneficios(String[] partes){
//        String[] partes = linha.split(",");

        return Float.parseFloat(partes[3]) + Float.parseFloat(partes[4]);
    }

}
