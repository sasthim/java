/*
    5) Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os
       números.
 */

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args)
    {
        int tamanho = 5, soma = 0, mult = 1;
        int[] vetor = new int[tamanho];
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira "+tamanho+" valores: ");
        
        for (int i = 0; i < tamanho; i++)
            vetor[i] = scan.nextInt();

        for(int i = 0; i < tamanho; i++)
        {
            soma += vetor[i];
            mult *= vetor[0];
        }

        System.out.println("Soma dos numeros: " + soma);
        System.out.println("Multiplicacao dos numeros: " + mult);
        scan.close();
    }
}
