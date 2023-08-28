/*
    8) Foi feita uma pesquisa entre os 1000 habitantes de uma região para coletar os seguintes dados:
        sexo (0-feminino, 1-masculino), idade e altura. Faça um algoritmo que leia as informações
        coletadas e mostre as seguintes informações:
            a) média da idade do grupo;
            b) média da altura das mulheres;
            c) média da idade dos homens;
            d) percentual de pessoas com idade entre 18 e 35 anos (inclusive).

 */

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        int  qttH = 0, qttM = 0, qtt = 0, input, habitantes = 1000;
        double mediaIdadeGrupo = 0, mediaAlturaMulheres = 0, mediaIdadeHomens = 0;
        int[] sexo = new int[habitantes];
        int[] idade = new int[habitantes];
        int[] altura = new int[habitantes];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < habitantes; i++) {
            System.out.println("Sexo ([0]Feminino | [1] Masculino):");
            input = scan.nextInt();

            if (input != 0 && input != 1)
                break;
            sexo[i] = input;

            if (input == 0)
                qttM++;

            else
                qttH++;

            System.out.println("Idade:");
            idade[i] = scan.nextInt();
            System.out.println("Altura (em centimetros):");
            altura[i] = scan.nextInt();

            qtt++;
        }

        scan.close();

        for (int i = 0; i < qtt; i++)
            mediaIdadeGrupo += idade[i];
        mediaIdadeGrupo /= qtt;
        System.out.println("Media de idade do grupo: " + mediaIdadeGrupo);

        for (int i = 0; i < qtt; i++)
            if (sexo[i] == 0)
                mediaAlturaMulheres += altura[i];
        mediaAlturaMulheres /= qttM;
        System.out.println("Media de altura das mulheres: " + mediaAlturaMulheres);

        for (int i = 0; i < qtt; i++)
            if (sexo[i] == 1)
                mediaIdadeHomens += idade[i];
        mediaIdadeHomens /= qttH;
        System.out.println("Media de idade dos homens: " + mediaIdadeHomens);
    }
}
