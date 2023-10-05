package lista3.exercicio2;

import java.util.Scanner;

public class MainEx2 {
    public static void main(String[] args) {
        Vendedor vendedor = null;
        int opcao = 0;
        boolean loop = true;

        Scanner scan = new Scanner(System.in);

        while (loop) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Cadastrar Vendedor");
            System.out.println("2 - Calcular Venda");
            System.out.println("3 - Sair");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Código do Vendedor: ");
                    int codigo = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Nome do Vendedor: ");
                    String nome = scan.nextLine();
                    System.out.println("Percentual de Comissão: ");
                    double percentualComissao = scan.nextDouble();

                    vendedor = new Vendedor(codigo, nome, percentualComissao);
                    break;
                case 2:
                    System.out.println("Valor da Venda: ");
                    double valorVenda = scan.nextDouble();
                    scan.nextLine();

                    System.out.println("Valor do Desconto (deixe em branco se não houver): ");
                    String descontoInput = scan.nextLine();
                    double desconto = 0.0;

                    if (!descontoInput.isEmpty()) {
                        desconto = Double.parseDouble(descontoInput);
                    }

                    if (descontoInput.isEmpty()) {
                        System.out.println(vendedor.imprimir(valorVenda));
                    } else {
                        System.out.println(vendedor.imprimir(valorVenda, desconto));
                    }
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }
        scan.close();
    }
}
