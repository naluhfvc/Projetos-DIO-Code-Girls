/*
  Faça um programa que leia e valide as seguintes informações:
  Nome: maior que 3 caracteres;
  Idade: entre 0 e 150;
  Salário: maior que zero;
  Sexo: 'f' ou 'm';
  Estado Civil: 's', 'c', 'v', 'd';
 */

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do{
            System.out.print("Nome: ");
            nome = ler.next();
        }while(nome.length() <= 3 );

        do{
            System.out.print("Idade: ");
            idade = ler.nextInt();
        }while(idade<0 || idade >150);

        do{
            System.out.print("Salario: ");
            salario = ler.nextDouble();
        }while(salario < 0);

        do {
            System.out.print("Sexo: ");
            sexo = ler.next();
        }while(!(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")));

        do {
            System.out.print("Estado civil: ");
            estadoCivil = ler.next();
        }while(!(estadoCivil.equalsIgnoreCase("s")
                || estadoCivil.equalsIgnoreCase("c")
                || estadoCivil.equalsIgnoreCase("v")
                || estadoCivil.equalsIgnoreCase("d")));

        System.out.println("Validado!");
    }
}
