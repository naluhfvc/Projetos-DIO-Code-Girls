/*
Faça um Programa que leia um vetor de 5 números inteiros,
 mostre a soma, a multiplicação e os números.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];

        int soma = 0;
        int multiplicacao = 1;

        for(int i = 0; i< numeros.length; i++){
            System.out.print("Insira o numero: ");
             numeros[i] = scan.nextInt();

             soma += numeros[i];
             multiplicacao *= numeros[i];
        }

        System.out.println("Numeros: " + Arrays.toString(numeros));
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação : " + multiplicacao);

    }
}
