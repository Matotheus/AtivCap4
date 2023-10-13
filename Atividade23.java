import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigoProduto, quantidadeProduto;
        double precoUnitario = 0, precoTotal, desconto, precoFinal;

        System.out.print("Informe o codigo do produto (De 1 a 40): ");
        codigoProduto = input.nextInt();
        System.out.print("Informe a quantidade de produtos comprados: ");
        quantidadeProduto = input.nextInt();

        if (codigoProduto >= 1 && codigoProduto <= 10) {
            System.out.println("O preço unitario do produto é de 10R$!");
        } else if (codigoProduto >= 11 && codigoProduto <= 20) {
            System.out.println("O preço unitario de produto é de 15R$!");
        } else if (codigoProduto >= 21 && codigoProduto <= 30) {
            System.out.println("O preço unitario de produto é de 20R$!");
        } else if (codigoProduto >= 31 && codigoProduto <= 40) {
            System.out.println("O preço unitario de produto é de 25R$!");
        } else {
            System.out.println("Esse valor é inválido");
        }

        precoTotal = precoUnitario * quantidadeProduto;

        if (precoTotal < 250) {
            desconto = precoTotal * 0.05;
        } else if (precoTotal >= 250 && precoTotal <= 500) {
            desconto = precoTotal * 0.10;
        } else {
            desconto = precoTotal * 0.15;
        }

        precoFinal = precoTotal - desconto;

        System.out.println("O preço unitario do produto é: " +precoUnitario);
        System.out.println("O preço total da nota é: " +precoTotal);
        System.out.println("O valor do desconto é: " +desconto);
        System.out.println("O preço final da nota com desconto é: " +precoFinal);


        input.close();
    }
}
