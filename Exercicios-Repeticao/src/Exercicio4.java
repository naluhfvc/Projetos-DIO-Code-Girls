/*Supondo que a população de um país A seja da ordem de
  80000 habitantes com uma taxa anual de crescimento de 3% e que a
  população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
  Faça um programa que calcule e escreva o número de anos necessários para
  que a população do país A ultrapasse ou iguale a população do país B,
  mantidas as taxas de crescimento.
 */

public class Exercicio4 {

    public static void main(String[] args) {

        double populacaoPaisA = 80000;
        double populacaoPaisB = 200000;
        double taxaCrescimentoA = 1.03;
        double taxaCrescimentoB = 1.015; // = 1.5/100 * habitantes
        int anos = 0;


        while(populacaoPaisA<populacaoPaisB){
            populacaoPaisA *= taxaCrescimentoA;
            populacaoPaisB *= taxaCrescimentoB;
            anos++;
        }

        System.out.println("Anos necessários: "+ anos);
    }
}
