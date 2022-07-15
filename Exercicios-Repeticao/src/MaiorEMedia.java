import java.util.Scanner;
/*
 * Faça um programa que leia 5 números e informe
 * o maior numero e a media desses numeros.
 */

public class MaiorEMedia {

    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        int i = 0;
        double numero;
        double maiorNumero = 0;
        double soma = 0;

        do {
            System.out.println("Número: ");
            numero = ler.nextDouble();

            if(numero > maiorNumero)
                maiorNumero = numero;

            soma += numero;

            i++;
        }while(i<5);

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Média: " + (soma/5));

    }
}
