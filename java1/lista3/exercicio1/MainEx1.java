package java1.lista3.exercicio1;

import java.util.Scanner;

public class MainEx1 {
    public static void main(String[] args) {
        Apolice apolice = null;
        int opcao = 0;
        boolean loop = true;
        apolice = new Apolice(223523, "Jose", 20, 'M', 123456.78);

        Scanner scan = new Scanner(System.in);

        while(loop) {
            System.out.println("Digite a opcao desejada:");
            System.out.println("[1] Criar apolice");
            System.out.println("[2] Ver dados apolice");
            System.out.println("[3] Sair");
            
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Numero: ");
                    apolice.setNumero(scan.nextInt());
                    System.out.println("Nome: ");
                    apolice.setNome(scan.next());
                    System.out.println("Idade: ");
                    apolice.setIdade(scan.nextInt());
                    System.out.println("Sexo: ");
                    apolice.setSexo(scan.next().charAt(0));
                    System.out.println("Valor automovel: ");
                    apolice.setValorAutomovel(scan.nextDouble());
                    break;
                case 2:
                    System.out.println(apolice.imprimir());
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }
        scan.close();
    }
}