/*
Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os
números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
 */
import java.util.*;
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numerosPar = new ArrayList<>();
        ArrayList<Integer> numerosImpar = new ArrayList<>();

        for (int i =0; i<20; i++){
            System.out.print((i+1) + "° numero: ");
            int numero =  scan.nextInt();

            numeros.add(numero);

            if(numero % 2 == 0){
                numerosPar.add(numero);
            } else {
                numerosImpar.add(numero);
            }
        }

        System.out.println("Numeros: " + numeros);
        System.out.println("Numeros pares: " + numerosPar);
        System.out.println("Numeros impares: " + numerosImpar);

    }
}
