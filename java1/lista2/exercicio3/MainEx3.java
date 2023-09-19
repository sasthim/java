package java1.lista2.exercicio3;

import java.util.Scanner;

public class MainEx3 {
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
                    funcionario.setCracha(scan.nextInt());
                    System.out.println("Nome: ");
                    funcionario.setNome(scan.next());
                    System.out.println("Tipo de vinculo (H/N): ");
                    funcionario.setTipoVinculo(scan.next().charAt(0));

                    if (funcionario.getTipoVinculo() == 'H') {
                        System.out.println("Valor hora");
                        funcionario.setValorHora(scan.nextFloat());
                        System.out.println("Quantidade de horas");
                        funcionario.setQtdeHora(scan.nextFloat());
                    }
                    else {
                        System.out.println("Salario");
                        funcionario.setSalario(scan.nextFloat());    
                    }

                    System.out.println("Valor desconto");
                    funcionario.setValorDesconto(scan.nextFloat());
                    break;
                case 2:
                    System.out.println(funcionario.imprimir());
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }
        scan.close();
    }
}