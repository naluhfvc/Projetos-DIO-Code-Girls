import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
 *qualquer número inteiro entre 1 a 10.O usuário deve informar
 * de qual numero ele deseja ver a tabuada.
 */

public class Tabuada {

    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Tabuada do número: ");
        int numero = ler.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }

    }
}
