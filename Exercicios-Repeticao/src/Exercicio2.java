/*
  Faça um programa que leia um nome de usuário e a sua senha e
  não aceite a senha igual ao nome do usuário,
   mostrando uma mensagem de erro e voltando a pedir as informações.
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.print("Digite seu nome de usuario: ");
        usuario = ler.next();
        System.out.print("Insira sua senha: ");
        senha = ler.next();

        while(senha.equalsIgnoreCase(usuario)){
            System.out.print("\nSenha invalida. Insira outra senha: ");
            senha = ler.next();
        }

        System.out.println("Seja bem-vindo " + usuario);

    }
}
