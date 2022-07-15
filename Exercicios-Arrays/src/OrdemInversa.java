import java.util.Scanner;

/*Faça um Programa que leia um vetor de 5 números inteiros
 *e mostre-os na ordem inversa.
 */

public class OrdemInversa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vet[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            vet[i] = ler.nextInt();
        }

        System.out.println("Ordem Inversa do vetor");
        for (int i = 4; i >= 0; i--) {
            System.out.println(vet[i]);
        }
    }
}
