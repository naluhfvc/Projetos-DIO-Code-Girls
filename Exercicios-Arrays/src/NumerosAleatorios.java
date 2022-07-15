import java.util.Random;

/* Faça um Programa que leia 20 números inteiros aleatorios
 *(entre 0 e 100) armazene-os num vetor. Ao final
 * mostre os números e seus sucessores.
 */

public class NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random(); // Gera numeros aleatorios

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100); //numeros aleatorios ate 100
            System.out.println("Numero: "+ numerosAleatorios[i]);
            System.out.println("Sucessor: " + (numerosAleatorios[i]+1));
        }

    }
}
