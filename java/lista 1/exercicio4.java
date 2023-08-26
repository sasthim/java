/*
    4) Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem
       pares. Termine a leitura se o usuário digitar zero (0).
 */

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        double media;
        int input, temp = 0, qtt = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println(
                    "Insira os numeros para calcular a media, apenas numeros pares serao calculados (0 para terminar):");
            input = scan.nextInt();

            if (input == 0)
                break;
            else {
                if (input % 2 == 0) {
                    temp += input;
                    qtt++;
                }
            }
        } while (true);

        scan.close();
        media = (double) temp / qtt;
        System.out.printf("Media = %.2f%n", media);
    }
}
