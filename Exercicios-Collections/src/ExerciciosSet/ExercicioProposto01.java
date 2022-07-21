/*
Crie um conjunto contendo as cores do arco-íris e:
Exiba todas as cores uma abaixo da outra
A quantidade de cores que o arco-íris tem
Exiba as cores em ordem alfabética
Exiba as core na ordem inversa da que foi informada
Exiba todas as cores que começam com a letra ”v”
Remova todas as cores que não começam com a letra “v”
Limpe o conjunto
Confira se o conjunto está vazio
 */

package ExerciciosSet;


import java.util.*;

public class ExercicioProposto01 {

    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>(Arrays.asList("vermelha","laranja","amarela","verde","azul","azul-escuro","violeta"));

        System.out.println("\nCONJUNTO DE CORES DO ARCO IRIS:");
        System.out.println(coresArcoIris);

        System.out.println("\na) Exiba todas as cores uma abaixo da outra:");
        for(String cor : coresArcoIris){
            System.out.println(cor);
        }

        System.out.println("\nb)A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("\nc)Exiba as cores em ordem alfabética:");

        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);

        System.out.println(coresArcoIris2);

        System.out.println("\nd)Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(coresArcoIris);
        System.out.println(coresArcoIris3);

        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("\ne)Exiba todas as cores que começam com a letra ”v”:");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("\nf)Remova todas as cores que não começam com a letra “v”:");
        System.out.println(coresArcoIris);
        coresArcoIris.removeIf(cor -> !(cor.startsWith("v")));
        System.out.println(coresArcoIris);

        System.out.println("\ng)Limpe o conjunto:");
        coresArcoIris.clear();

        System.out.println("\nh)Verifique se o cojunto esta vazio: ");
        System.out.println("O conjunto está vazio: " + coresArcoIris.isEmpty());


    }
}
