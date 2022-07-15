import java.util.Scanner;

/*Faça um programa que peça N números inteiros.
 *Calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */

public class ParEImpar {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int i = 0;
        int numero;
        int pares = 0;
        int impares = 0;

        System.out.println("Insira 6 números.");

        do {
            System.out.println("Digite um número:");
            numero = ler.nextInt();

            if(numero % 2 == 0)
                pares++;
             else
                impares++;

            i++;

        }while(i<6);

        System.out.println("Pares: "+ pares + " Impares: " + impares);
    }
}
