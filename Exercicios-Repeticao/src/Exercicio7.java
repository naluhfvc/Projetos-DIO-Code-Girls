import java.util.Scanner;

/*
  Faça um programa que leia 5 números e informe o maior número.
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double maior = 0;

        for(int i=0; i<5; i++){
            System.out.print("Numero: ");
            double numero = ler.nextDouble();

            if(numero> maior)
                maior = numero;
        }

        System.out.print("O maior número digitado foi " + maior);
    }
}
