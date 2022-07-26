import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Faça um Programa que peça as quatro notas de 10 alunos,
calcule e armazene num vetor a média de cada aluno,
 imprima o número de alunos com média maior ou igual a 7.0.
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] mediaAlunos = new double[10];

        for (int i = 0; i < mediaAlunos.length; i++) {
            double soma = 0;
            System.out.println();
            System.out.println((i + 1)+ "° aluno");

            for (int j = 0; j < 4; j++) {
                System.out.print((j + 1) + "° nota: ");
                double nota = scan.nextDouble();
                soma += nota;
            }

            mediaAlunos[i] = (soma / 4);
        }

        System.out.println("Média dos estudantes: " + Arrays.toString(mediaAlunos));
        int count = 0;
        for( Double media : mediaAlunos){
            if (media >= 7.0)
                count ++;
        }

        System.out.println("Quantidade de alunos com media maior ou igual a 7: " + count);


    }
}
