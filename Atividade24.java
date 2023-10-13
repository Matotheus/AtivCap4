import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco, aumento = 0, imposto, novoPreco;
        int categoria;
        char situacao;
        String classificacao = "";

        System.out.print("Informe o preço do produto: ");
        preco = input.nextInt();

        System.out.println("Escolha uma categoria: \n 1º - Limpeza \n 2º - Alimentação \n 3º - Vestuario ");
        categoria = input.nextInt();

        System.out.println("Escolha a situação: \n R - produtos que necessitam de refrigeração \n N - — produtos que não necessitam de refrigeração");
        situacao = input.next().charAt(0);


        if (preco <= 25) {
            switch (categoria) {
                case 1:
                    aumento = preco * 0.05;
                    break;
                case 2:
                    aumento = preco * 0.08;
                    break;
                case 3:
                    aumento = preco * 0.10;
                    break;
            }
        } else {
            switch (categoria) {
                case 1:
                    aumento = preco * 0.12;
                    break;
                case 2:
                    aumento = preco * 0.15;
                    break;
                case 3:
                    aumento = preco * 0.18;
                    break;
            }
        }

        if (categoria == 2 && situacao == 'R') {
            imposto = preco * 0.05;
        } else{
            imposto = preco * 0.08;
        }

        novoPreco = (preco + aumento) - imposto;


        if (novoPreco <= 50) {
            System.out.println("Classificação: Barata");
        } else if (novoPreco > 50 && novoPreco < 120) {
            System.out.println("Classificação: Normal");
        } else {
            System.out.println("Classificação: Cara");
        }

        System.out.println("O valor do aumento é: " +aumento+ "R$");
        System.out.println("O valor do imposto é: " +imposto+ "R$");
        System.out.println("O novo preço é: " +novoPreco+ "R$");
        System.out.println("A classificação é: " +classificacao);


        input.close();
    }
}