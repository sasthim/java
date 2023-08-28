/*
    7) Uma empresa deseja aumentar seus preços em 20%. Faça um algoritmo que leia o código e
       o preço de custo de cada produto e calcule o preço novo. Calcule também, a média dos
       preços com e sem aumento. Mostre o código e o preço novo de cada produto e, no final, as
       médias. A entrada de dados deve terminar quando for lido um código de produto negativo.
 */

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        double input, aumento = 0.2;
        int qtt = 0, maxProdutos = 100;
        int[] codigo = new int[maxProdutos];
        double[] valorAntigo = new double[maxProdutos];
        double[] valorNovo = new double[maxProdutos];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < maxProdutos; i++) {
            System.out.println("Digite o codigo do produto (negativo para sair): ");
            input = scan.nextDouble();
            if (input < 0)
                break;
            codigo[i] = (int) input;

            System.out.println("Digite o preco do produto: ");
            valorAntigo[i] = scan.nextDouble();
            qtt++;
        }

        scan.close();

        for (int i = 0; i < qtt; i++) {
            valorNovo[i] = valorAntigo[i] * (1 + aumento);
            System.out.println("--------------------------");
            System.out.println("Codigo: " + codigo[i]);
            System.out.println("Preco original: " + valorAntigo[i]);
            System.out.println("Preco atualizado: " + valorNovo[i]);
        }
        System.out.println("--------------------------");
        scan.close();
    }
}
