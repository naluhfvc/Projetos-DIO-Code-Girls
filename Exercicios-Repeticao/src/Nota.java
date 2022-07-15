import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez.
 *Mostre uma mensagem caso o valor seja inválido e
 *continue pedindo até que o usuário informe um valor válido.
 */

public class Nota {

    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota;

        System.out.println("Insira uma nota entre 0 e 10: ");
        nota = ler.nextInt();

        while(nota<0 || nota>10){

            System.out.println("Valor Invalido. Insira novamente: ");
            nota = ler.nextInt();

        }
    }
}
