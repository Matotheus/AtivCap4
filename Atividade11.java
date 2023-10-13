import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, novoSalario, novoSalario2, novoSalario3, salarioTotal;

        System.out.print("Informe o valo do salário: ");
        salario = input.nextDouble();

        if ((salario < 300)) {
            novoSalario = salario * 0.15;
            salarioTotal = novoSalario + salario;
            System.out.print("O salário apos o aumento sera de: " +salarioTotal);
        } else if ((salario > 300 && salario < 600)) {
            novoSalario2 = salario * 0.10;
            salarioTotal = novoSalario2 + salario;
            System.out.print("O salário apos aumento sera de: " +salarioTotal);
        } else if ((salario >= 600 && salario <= 900)) {
            novoSalario3 = salario * 0.05;
            salarioTotal = novoSalario3 + salario;
            System.out.print("O salário apos aumento sera de:" +salarioTotal);
        }else {
            System.out.print("O aumento não sera aplicado!");
        }


        input.close();
    }
}
