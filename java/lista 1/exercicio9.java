/*
    9) Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
        - a quantidade de pessoas com mais de 90 quilos;
        - a média das idades das sete pessoas

 */

import java.util.Scanner;

public class exercicio9 {
    public static void main (String[] args)
    {
        int maxPessoas = 7, pessoas90kg = 0, qtt = 0;
        int[] idade = new int[maxPessoas];
        int[] peso = new int[maxPessoas];
        double mediaIdade = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < maxPessoas; i++)
        {
            System.out.println("Idade: ");
            idade[i] = scan.nextInt();
            mediaIdade += idade[i];

            System.out.println("Peso: ");
            peso[i] = scan.nextInt();

            if(peso[i] > 90)
                pessoas90kg += 1;

            qtt++;
        }

        scan.close();

        mediaIdade /= qtt; // Usei qtt inves de maxPessoas pra evitar um hardcode =]

        System.out.println("Quantidade de pessoas com mais de 90 quilos: " + pessoas90kg);
        System.out.println("Media de idade: " + mediaIdade);
    }
}
