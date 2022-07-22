/*
Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial
várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
 */

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;
        int fatorial = 1;
        int numero;

        while (continuar) {
            System.out.print("Insira o número da fatorial:");
            numero = scan.nextInt();

            if (numero > 0 && numero <= 16) {

                System.out.print(numero + "! = ");
                for (int i = numero; i > 0; i--) {
                    fatorial *= i;
                    System.out.print(i + " ");
                }
                System.out.println(" = " + fatorial);
            } else {
                System.out.println("Numero invalido!\n");
            }

            System.out.println("Deseja continuar ?(s/n) ");
            String resposta = scan.next();

            if (resposta.equals("n"))
                continuar = false;

            fatorial = 1;
        }

    }
}
