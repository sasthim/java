/*
    1) Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos. 
       O final da leitura acontecerá quando for lido um valor negativo.
 */

import java.util.Scanner;

public class exercicio1
{
    public static void main (String[] args)
    {
        int total = 0, qtt = 0, input;
        System.out.println("Hello, World.");
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira valores positivos, negativos para finalizar e calcular a media.");

        do {
            input = scan.nextInt();
            if (input >= 0) {
                total += input;
                qtt++;
            }
        } while (input >= 0);      
        scan.close();
        
        if (qtt > 0)
            System.out.println("Media = " + (double) total / qtt);
        else
            System.out.println("Nenhum valor válido inserido.");
    }
}
