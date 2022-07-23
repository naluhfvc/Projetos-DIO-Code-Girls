/*
Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
 */
import java.util.*;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        for(int i = 0; i< notas.length; i++){
            System.out.print("Adicione a nota: ");
            notas[i] = scan.nextDouble();
            soma += notas[i];
        }

        System.out.println("A média das notas é " + (soma/ notas.length));

    }
}
