import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precoProduto, desconto, desconto2, novoPreco, valorDesconto, valorDesconto2;

        System.out.print("Informe o preço do produto: ");
        precoProduto = input.nextDouble();

        valorDesconto = precoProduto * 0.10;
        valorDesconto2 = precoProduto * 0.15;
        desconto = precoProduto - valorDesconto;
        desconto2 = precoProduto - valorDesconto2;

        if (precoProduto < 30) {
            System.out.println("Sem desconto!");
        } else if (precoProduto > 100) {
            System.out.println("O valor do disconto sera de: " +valorDesconto);
            System.out.println("O novo preço do produto vai ser: " +desconto);
        } else {
            System.out.println("O valor do disconto sera de: " +valorDesconto2);
            System.out.println("O novo preço do produto vai ser: " + desconto2);
        }


        input.close();
    }
}
