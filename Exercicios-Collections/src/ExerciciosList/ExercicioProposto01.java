/*
Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).
 */
package ExerciciosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>(); //cria lista

        double soma = 0;

        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print("Insira a temperatura: ");
            double graus = ler.nextDouble();
            temperaturas.add(graus); // add a lista
            soma += graus;
        }

        double mediaSemestral = soma / temperaturas.size(); // tamanho da lista

        System.out.println("Temperaturas: " + temperaturas);
        System.out.println("Média semestral das temperaturas: " + mediaSemestral);

        System.out.println("\nMESES DE TEMPERATURAS ACIMA DA MÉDIA:");

        for (Double graus: temperaturas) {
            if (graus > mediaSemestral) {
                int index = temperaturas.indexOf(graus); //retorna a posicao/mes

                switch (index){
                    case 0:
                        System.out.println((index + 1) + " - Janeiro: " + graus + "°");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - Fevereiro: " + graus + "°");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - Março: " + graus + "°");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - Abril: " + graus + "°");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - Maio: " + graus + "°");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - Junho: " + graus + "°");
                        break;
                    default:
                        break;
                }
            }

        }



    }
}
