/*
Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
 */

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números tem no conjunto? ");
        int n = scan.nextInt();

        double maiorValor = 0.0;
        double menorValor = 1000;
        double soma = 0.0;
        int count = 0;

        do {
            System.out.print("Insira o número: ");
            double numero = scan.nextDouble();

            if (numero >= 0 && numero <= 1000) {

                if (numero > maiorValor)
                    maiorValor = numero;

                if (numero < menorValor)
                    menorValor = numero;

                soma += numero;
                count++;
            } else {
                System.out.println("Numero invalido.");
            }
        } while (count != n);

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Soma dos valores: " + soma);

    }
}
