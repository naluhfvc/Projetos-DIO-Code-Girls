/*
 Faça um programa que receba dois números inteiros e gere os
 números inteiros que estão no intervalo compreendido por eles.
 */

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        int numero1 = ler.nextInt();
        System.out.print("Insira o segundo numero: ");
        int numero2 = ler.nextInt();

        if(numero1<numero2) {
            for (int i = numero1+1; i < numero2; i++) {
                System.out.printf("%d ", i);
            }
        }else {
            for(int i = numero1-1; i>numero2; i--){
                System.out.printf("%d ", i);
            }
        }
    }
}
