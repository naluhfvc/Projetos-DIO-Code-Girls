
/* Gere e imprima uma matriz M 4x4 com valores
 *aleatórios entre 0-9. Após isso determine o menor
 * número da matriz e a sua posição(linha, coluna)
 */

import java.util.Random;

public class Multidimensional {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz  ) { //navega pela matriz ou seja linha = array
            for (int coluna : linha ) {// pega o elemento da coluna que esta dentro da linha i
                System.out.print(coluna + " ");
            }
            System.out.println();//pula linha
        }
    }

}
