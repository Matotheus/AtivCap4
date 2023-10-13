import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double custoFabrica, precoConsumidor, precoConsumidor2, precoConsumidor3, valorTotal, valorTotal2, valorTotal3;

        System.out.print("Informe o valor do custo de fábrica: ");
        custoFabrica = input.nextDouble();


        if (custoFabrica <= 12000) {
            precoConsumidor = custoFabrica * 0.05;
            valorTotal = custoFabrica + precoConsumidor;
            System.out.print("O preço do consumidor é: " +precoConsumidor+ "\n");
            System.out.println("O valor total do preço consumidor é: " +valorTotal);
        } else if (custoFabrica < 25000) {
            precoConsumidor2 = (custoFabrica * 0.10) * 0.15;
            valorTotal2 = custoFabrica + precoConsumidor2;
            System.out.print("O preço do consumidor é: " +precoConsumidor2+"\n");
            System.out.println("O valor total do preço consumidor é: " +valorTotal2);
        } else {
            precoConsumidor3 = (custoFabrica * 0.15) * 0.20;
            valorTotal3 = custoFabrica + precoConsumidor3;
            System.out.print("O preço consummidor é: " +precoConsumidor3 +"\n");
            System.out.println("O valor total do preço consumidor é: " +valorTotal3);
        }


        input.close();
    }
}