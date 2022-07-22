package ExercicioEstruturaBasica;
/*
/*
Evolua o conceito do exercício 3 criando objetos da classe "Carro".
Use os métodos set/get, quando aplicáveis, para definir os valores dos atributos
e exibir estes valores "get". Passe também uma mensagem para o cálculo do total
 pra encher o tanque.
 */
public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setModelo("Gol");
        carro1.setCor("vermelho");
        carro1.setCapacidadeTanque(50);

        System.out.println("\nCARRO 1:");
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.calcularValorTotal(7.39));

        Carro carro2 = new Carro();

        carro2.setModelo("Uno");
        carro2.setCor("azul");
        carro2.setCapacidadeTanque(56);

        System.out.println("\nCARRO 2: ");
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.calcularValorTotal(7.39));

        Carro carro3 = new Carro("branco",70,"Civic"); //sobrecarga

        System.out.println("\nCARRO 3:");
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getCor());
        System.out.println(carro3.getCapacidadeTanque());
        System.out.println(carro3.calcularValorTotal(7.39));

    }
}
