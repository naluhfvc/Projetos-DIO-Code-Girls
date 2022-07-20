/*
A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
 Faça um programa capaz de gerar a série até o n−ésimo termo.
 */

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a quantidade termos: ");
        int n = ler.nextInt();
        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.print("\n" + primeiro + " ");
        System.out.print(segundo + " ");
        for(int i = 3; i<=n; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.print(proximo + " ");
        }
    }
}
