package java1.lista2.exercicio1;

import java.util.Scanner;

public class MainEx1 {
    public static void main(String[] args) {
        Pessoa pessoa = null;
        int opcao = 0;
        boolean loop = true;
        pessoa = new Pessoa();

        Scanner scan = new Scanner(System.in);

        while(loop) {
            System.out.println("Digite a opcao desejada:");
            System.out.println("[1] Criar pessoa");
            System.out.println("[2] Mostrar pessoa");
            System.out.println("[3] Sair");
            
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    String cpf;
                    String nome;
                    int idade;
                    char sexo;

                    System.out.println("CPF: ");
                    cpf = scan.next();
                    System.out.println("Nome: ");
                    nome = scan.next();
                    System.out.println("Idade: ");
                    idade = scan.nextInt();
                    System.out.println("Sexo (M/F): ");
                    sexo = scan.next().charAt(0);

                    pessoa.setCPF(cpf);
                    pessoa.setNome(nome);
                    pessoa.setIdade(idade);
                    pessoa.setSexo(sexo);
                    break;
                case 2:
                    System.out.println(pessoa.imprimir());
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }
        scan.close();
    }
}