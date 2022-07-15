import java.util.Scanner;

/*
Altere o programa anterior permitindo ao usuário informar as populações e
as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int anos;
        boolean continuar = true;

        while(continuar) {
            anos = 0;
            System.out.print("Populaçao do Pais(A) com menos Habitantes: ");
            double populacaoPaisA = ler.nextDouble();

            System.out.print("Populaçao do Pais (B) com mais Habitantes: ");
            double populacaoPaisB = ler.nextDouble();

            do {
                anos++;
                populacaoPaisA *= 1.03;
                populacaoPaisB *= 1.015;
            }while (populacaoPaisA < populacaoPaisB);

            System.out.println("Anos necessários: "+ anos);

            System.out.println("Deseja continuar?(Y/N)");
            String repeat = ler.next();

            if(repeat.equals("N"))
                continuar = false;
        }

    }
}
