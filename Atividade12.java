import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioBruto, gratificacao, imposto, novoSalario;

        System.out.print("Informe o salario bruto: ");
        salarioBruto = input.nextDouble();

        gratificacao = 0;
        imposto = 0.07 * salarioBruto;
        novoSalario = (salarioBruto + gratificacao) - imposto;

        if (salarioBruto < 350) {
            gratificacao = 100;
            novoSalario = (salarioBruto + gratificacao) - imposto;
            System.out.println("A gratificação sera de 100 R$");
            System.out.println("Seu salario com taxa sera de: " +novoSalario);
        } else if (salarioBruto > 300 && salarioBruto < 600) {
            gratificacao = 75;
            novoSalario = (salarioBruto + gratificacao) - imposto;
            System.out.println("A gratificação sera de 75 R$ ");
            System.out.println("Seu salario com taxa sera de: " +novoSalario);
        } else if (salarioBruto >= 600 && salarioBruto <= 900) {
            gratificacao = 50;
            novoSalario = (salarioBruto + gratificacao) - imposto;
            System.out.println("A gratificação sera de 50 R$");
            System.out.println("Seu salario com taxa sera de: " +novoSalario);
        } else {
            gratificacao = 35;
            novoSalario = (salarioBruto + gratificacao) - imposto;
            System.out.println("A gratificação sera de 35 R$");
            System.out.println("Seu salario com taxa sera de: " +novoSalario);
        }


        input.close();
    }
}
