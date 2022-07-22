/*
A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55
,... Faça um programa que gere a série até que o valor seja maior que 500.

 */

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            int primeiro = 0;
            int segundo = 1;
            int proximo;

            System.out.print("\n" + primeiro + " ");
            System.out.print(segundo + " ");

            do {
                proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;

                System.out.print(proximo + " ");
            }while(proximo<=500);
    }
}
