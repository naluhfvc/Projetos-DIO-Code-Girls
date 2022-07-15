import java.util.Scanner;

/*Faça um Programa que leia um vetor de 6 caracteres, e diga
 *quantas consoantes foram lidas. Imprima as consoantes.
 */
public class Consoantes {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] consoantes = new String [6];
        int qtdConsoantes = 0;


        for(int i=0; i<6; i++) {
            System.out.println("Letra: ");
            String letra = ler.next();

            if(!(letra.equalsIgnoreCase("a")||
                 letra.equalsIgnoreCase("e")||
                 letra.equalsIgnoreCase("i")||
                 letra.equalsIgnoreCase("o")||
                 letra.equalsIgnoreCase("u"))){
                consoantes[qtdConsoantes] = letra;
                qtdConsoantes ++;
            }
        }

        System.out.println("Quantidade de consoantes: " + qtdConsoantes);
        System.out.print("Consoantes:");

        for (int i=0; i<qtdConsoantes; i++){
            System.out.print(consoantes[i] + " ");
        }
    }
}
