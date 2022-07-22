/*
Faça um programa que, dado um conjunto de N números,
determine o menor valor, o maior valor e a soma dos valores.
 */

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números tem no conjunto? ");
        int n = scan.nextInt();

        double maiorValor = 0.0;
        double menorValor = 9999999999999d;
        double soma = 0.0;

        for (int i = 0; i<n; i++){
            System.out.print("Insira o número: ");
            double numero = scan.nextDouble();

            if(numero>maiorValor)
                maiorValor = numero;
            if(numero<menorValor)
                menorValor = numero;

            soma += numero;
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Soma dos valores: " + soma);
    }
}
