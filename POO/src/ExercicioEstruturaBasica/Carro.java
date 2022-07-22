package ExercicioEstruturaBasica;
/*
Crie a classe "Carro".
 */
/*
Evolua o exercicio 1 e defina 3 atributos para sua classe "Carro": cor, modelo e capacidade do tanque.
 */
/*
Evolua o conceito do exercício 2 e defina 1 método para calcular o valor total
 para encher o tanque. Este deve receber como parâmetro o valor da gasolina.
 Faça também duas sobrecargas do construtor
 */
public class Carro {

    String modelo;
    String cor;
    int capacidadeTanque;

    Carro(){
    }

   public Carro (String cor, int capacidadeTanque, String modelo) { //construtor do objeto
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double calcularValorTotal (double valorGasolina){

        return capacidadeTanque * valorGasolina;
    }

}
