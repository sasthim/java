package java1.lista2.exercicio1;

import java.util.Scanner;

public class MainEx1 {
    public static void main(String[] args) {
        Funcionario funcionario = null;
        int opcao = 0;
        boolean loop = true;
        funcionario = new Funcionario();

        Scanner scan = new Scanner(System.in);

        while(loop) {
            System.out.println("Digite a opcao desejada:");
            System.out.println("[1] Criar funcionario");
            System.out.println("[2] Mostrar folha de pagamento");
            System.out.println("[3] Sair");
            
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Cracha: ");
                    funcionario. = scan.nextInt();
                    System.out.println("Nome: ");
                    funcionario. = scan.next();
                    System.out.println("Tipo de vinculo (H/N): ");
                    funcionario. = scan.next();
                    System.out.println("");
                    funcionario. = scan.next();
                    System.out.println("");
                    funcionario. = scan.next();
                    System.out.println("");
                    funcionario. = scan.next();
                    System.out.println("");
                    funcionario. = scan.next();
                    
                    break;
                case 2:
                    System.out.println(aluno.imprimir());
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }
        scan.close();
    }
}