import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precoProduto, aumento;

        System.out.print("Informe o preço do produto: ");
        precoProduto = input.nextDouble();

        if (precoProduto < 50) {
            aumento = precoProduto * 0.05;
            System.out.println("Esse produto tera um aumento de 5%!");
            System.out.println("Barato!");
        } else if (precoProduto < 120) {
            System.out.println("Esse produto tera um aumento de 10%!");
            System.out.println("Normal!");
        } else if (precoProduto < 200) {
            System.out.println("Esse produto tera um aumento de 15%!");
            System.out.println("Caro!");
        } else {
            System.out.println("Esse produto tera um aumento de 15%!");
            System.out.println("Muito caro!");
        }


        input.close();
    }
}
