import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número inteiro
 *fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
 */

public class Fatorial {

    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Numero: ");
        int  numero = ler.nextInt();

        int fatorial = 1;

        for(int i = numero; i>0; i--){
            fatorial *= i;
        }

        System.out.println("resultado: " + fatorial);
    }
}
