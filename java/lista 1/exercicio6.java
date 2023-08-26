/*
    6) Faça um Programa que leia 10 números inteiros e armazene-os num vetor. Armazene os números
       pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
 */

import java.util.Arrays;
import java.util.Scanner;

public class exercicio6
 {
   public static void main (String[] args)
   {
      int[] input = new int[10];
      int pares = 0, impares = 0, contador1 = 0, contador2 = 0;

      Scanner scan = new Scanner(System.in);


      System.out.println("Digite 10 numeros inteiros:");

      for (int i = 0; i < 10; i++)
      {
         input[i] = scan.nextInt();
         if (input[i]%2 == 0)
            pares++;
         else
            impares++;
      }
      
      scan.close();
      
      int[] par = new int[pares];
      int[] impar = new int[impares];

      for (int i = 0; i < 10; i++)
      {
         if (input[i]%2 == 0)
            par[contador1++] = input[i];
         else
            impar[contador2++] = input[i]; 
      }

      System.out.println("Vetor orignal: " + Arrays.toString(input));
      System.out.println("Vetor pares: " + Arrays.toString(par));
      System.out.println("Vetor impares: " + Arrays.toString(impar));
   }
 }