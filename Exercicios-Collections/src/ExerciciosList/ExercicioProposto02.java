package ExerciciosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:
- "Telefonou para a vítima?" -"Esteve no local do crime?"
- "Mora perto da vítima?" -"Devia para a vítima?"
"Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".
 */

public class ExercicioProposto02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println();
        System.out.println("RESPONDA COM 'S' OU 'N'\nPERGUNTAS:\n");

        System.out.println("Telefonou para a vítima?");
        String resp = scan.next();
        respostas.add(resp);

        System.out.println("Esteve no local do crime?");
        resp = scan.next();
        respostas.add(resp);

        System.out.println("Mora perto da vitima?");
        resp = scan.next();
        respostas.add(resp);

        System.out.println("Devia para vitima?");
        resp = scan.next();
        respostas.add(resp);

        System.out.println("Já trabalhou com a vitima?");
        resp = scan.next();
        respostas.add(resp);

        System.out.println();

        int i = 0;

        for (String resposta : respostas) {
            if (resposta.contains("S"))
                i++;
        }

        switch (i){
            case 2:
                System.out.println("SUSPEITA!!");
                break;
            case 3:
            case 4:
                System.out.println("CUMPLICE!!");
                break;
            case 5:
                System.out.println("ASSASSINA!!!!");
                break;
            default:
                System.out.println("INOCENTE");
                break;
        }
    }
}
