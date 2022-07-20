/*
  Faça um programa que peça dois números, base e expoente, calcule
  e mostre o primeiro número elevado ao segundo número.
  Não utilize a função de potência da linguagem.
 */
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Numero base: ");
        int numeroBase = ler.nextInt();
        System.out.print("Numero expoente: ");
        int numeroExpoente = ler.nextInt();

        int resultado = 1;

        for (int i = 0; i < numeroExpoente ; i++) {
            resultado *= numeroBase;
        }

        System.out.println(numeroBase + " elevado a " + numeroExpoente + " é igual a " + resultado);
    }
}
