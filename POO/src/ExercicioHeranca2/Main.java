package ExercicioHeranca2;
/*
Crie as classes "Funcionario", "Gerente", "Vendedor" e "Faxineiro".
 Realize upcasts e downcasts.
 */
public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

    }
}
