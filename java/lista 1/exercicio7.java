/*
    7) Uma empresa deseja aumentar seus preços em 20%. Faça um algoritmo que leia o código e
       o preço de custo de cada produto e calcule o preço novo. Calcule também, a média dos
       preços com e sem aumento. Mostre o código e o preço novo de cada produto e, no final, as
       médias. A entrada de dados deve terminar quando for lido um código de produto negativo.
 */

import java.util.Scanner;

public class exercicio7 
{
    public static int[] cadastrar()
    {
        Scanner scan = new Scanner(System.in);
        int[] produto = new int[2];

        System.out.println("Digite o codigo do produto:");
        produto[0] = scan.nextInt();
        System.out.println("Digite o preco do produto:");
        produto[1] = scan.nextInt();

        return produto;
    }
    
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
    }
}
