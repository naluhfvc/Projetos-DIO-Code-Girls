package ExercicioInterface;
/*
Apenas para praticar, crie uma interface chamada "OperacaoMatematica".
 Crie também 4 métodos das operações básicas: soma, subtração,
 multiplicação e divisão.
*/
public class Calculadora implements OperacoesMatematicas{

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("soma = " + (operando1 + operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtração = " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("Multiplicação = " + (operando1 * operando2));
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("Divisao = " + (operando1 / operando2));
    }
}
