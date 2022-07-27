/*
1. Vamos ABSTRAIR o DOMÍNIO Bootcamp e MODELAR seus ATRIBUTOS
 MÉTODOS
2. Criaremos as CLASSES: Bootcamp, Cursos, Mentorias e Devs e
vamos relacionar.
3. As CLASSES Curso, Mentoria e Devs também serão MODELADOS, ou
 seja, criaremos os seus ATRIBUTOS E MÉTODOS
4. Para que o código fique mais legível e de fácil manutenção,
 iremos utilizar de algumas das ferramentas
que o PARADIGMA DE ORIENTAÇÃO A OBJETOS (POO) nos oferece:
ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO
5. E para representar CLASSES que foram criadas e relacionadas,
 iremos transformar em OBJETOS
 */

import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("descrição curso de C#");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
