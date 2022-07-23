import java.util.Arrays;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vet = new int[5];

        for(int i = 0; i< vet.length; i++) {
            System.out.print("Adicione numero: ");
            vet[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(vet));
    }
}
