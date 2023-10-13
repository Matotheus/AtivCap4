import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, media, diferenca, produto, divisao, escolha;

        System.out.println("Informe o primeiro número: ");
        num1 = input.nextDouble();
        System.out.println("Informe o primeiro número: ");
        num2 = input.nextDouble();

        System.out.println("Escolha uma operação: ");
        System.out.println("1º Media entre dois números");
        System.out.println("2º Diferença do maior para o menor");
        System.out.println("3º Produto entre dois números");
        System.out.println("4º Divisão do primeiro pelo segundo");
        escolha = input.nextDouble();

        if (escolha == 1) {
            media = (num1 + num2) / 2;
            System.out.println("A meida entre dois números é: " +media);

        } else if (escolha == 2) {
            diferenca = num1 - num2;
            System.out.println("A diferença do primeiro pelo segundo: " +diferenca);

        } else if (escolha == 3) {
            produto = num1 * num2;
            System.out.println("O produto dos númeors é: " +produto);

        } else if (escolha == 4) {
            if (num2 != 0) {
                divisao = num1 / num2;
                System.out.println("A divisão do primeiro pelo segundo é: " +divisao);
            } else {
                System.out.println("Erro: A divisão por zero é invalida!");
            }

        }else {
                System.out.println("Essa opção e invalida");
            }





    input.close();
    }
}
