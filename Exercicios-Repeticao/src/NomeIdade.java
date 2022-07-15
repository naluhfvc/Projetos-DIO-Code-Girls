package Exercicio_Nome_Idade;

import java.util.Scanner;
/*
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 */
public class NomeIdade {

    public static void main (String[] args) {

        String nome;
        int idade;

        Scanner ler = new Scanner(System.in);

        while(true){

            System.out.println("Nome:");
            nome = ler.next();

            if(nome.equals("0"))
                break;

            System.out.println("Idade:");
            idade = ler.nextInt();
        }
    }
}