
/*Altere o programa anterior para mostrar no final a soma dos números.
 */

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        int numero1 = ler.nextInt();
        System.out.print("Insira o segundo numero: ");
        int numero2 = ler.nextInt();

        int soma = 0;

        if(numero1<numero2) {
            for (int i = numero1+1; i < numero2; i++) {
                System.out.printf("%d ", i);
                soma += i;

            }
        }else {
            for(int i = numero1-1; i>numero2; i--){
                System.out.printf("%d ", i);
                soma += i;
            }
        }

        System.out.println("\nSoma dos numeros: " + soma);
    }
}
