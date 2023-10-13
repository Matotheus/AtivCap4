import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int tipoInvestimento;
    double investimento1, investimento2, poupanca, rendaFixa, novoValor, valorInvestimento;

        System.out.print("Informe o tipo de investimento(1 para poupança e 2 para fudos rendas fixas): ");
        tipoInvestimento = input.nextInt();

        System.out.print("Informe o valor do investimento: ");
        valorInvestimento = input.nextDouble();

        investimento1 = valorInvestimento * 0.03;
        investimento2 = valorInvestimento * 0.04;

        if (tipoInvestimento == 1) {
            novoValor = investimento1 + valorInvestimento;
            System.out.println("O valor apos um mês é de: " +investimento1);
            System.out.println("O valor apos a correção é de: " +novoValor);
        } else if (tipoInvestimento == 2) {
            novoValor = investimento2 + valorInvestimento;
            System.out.println("O valor apos um mês é de: " +investimento2);
            System.out.println("O valor apos a correção é de: " +novoValor);
        }else {
            System.out.println("Valor invalido");
        }


        input.close();
    }
}
