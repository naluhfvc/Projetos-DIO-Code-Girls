package exercicio1;

 /*
    Classe principal
  */
public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Calculadora");
        Calculadora.soma(10, 7);
        Calculadora.subtracao(20,12);
        Calculadora.multiplicacao(10,5);
        Calculadora.divisao(100,50);

        // Mensagem
        System.out.println("\nMensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(23);

        //Emprestimo
        System.out.println("\nEmprestimo");

    }
}
