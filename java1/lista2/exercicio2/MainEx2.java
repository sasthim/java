package java1.lista2.exercicio1;

import java.util.Scanner;

public class MainEx1 {
    public static void main(String[] args) {
        Aluno aluno = null;
        int opcao = 0;
        boolean loop = true;
        aluno = new Aluno();

        Scanner scan = new Scanner(System.in);

        while(loop) {
            System.out.println("Digite a opcao desejada:");
            System.out.println("[1] Criar aluno");
            System.out.println("[2] Mostrar aluno");
            System.out.println("[3] Sair");
            
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    String ra;
                    String nome;
                    float ac1, ac2, ag, af;

                    System.out.println("RA: ");
                    aluno.setRa(scan.next());
                    System.out.println("Nome: ");
                    aluno.setNome(scan.next());
                    System.out.println("AC1: ");
                    aluno.setAC1(scan.nextFloat());
                    System.out.println("AC2: ");
                    aluno.setAC2(scan.nextFloat());
                    System.out.println("AG: ");
                    aluno.setAG(scan.nextFloat());
                    System.out.println("AF: ");
                    aluno.setAF(scan.nextFloat());
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