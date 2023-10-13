import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, novoSalario, som;

        System.out.print("Informe o salário: ");
        salario = input.nextDouble();

        if (salario < 300) {
            som = salario * 0.50;
            novoSalario = salario + som;
            System.out.println("O salário tera um aumento de 50%");
            System.out.println("O novo salário sera de:" +novoSalario);

        } else if (salario > 300 && salario <= 500) {
            som = salario * 0.40;
            novoSalario = salario + som;
            System.out.println("O salário tera um aumento de 40%");
            System.out.println("O novo salário sera de:" +novoSalario);

        } else if (salario > 500 && salario <= 700) {
            som = salario * 0.30;
            novoSalario = salario + som;
            System.out.println("O salário tera um aumento de 30%");
            System.out.println("O novo salário sera de:" +novoSalario);

        } else if (salario > 700 && salario <800) {
            som = salario * 0.20;
            novoSalario = salario + som;
            System.out.println("O salário tera um aumento de 20%");
            System.out.println("O novo salário sera de:" +novoSalario);

        } else if (salario > 800 && salario <= 1000) {
            som = salario * 0.10;
            novoSalario = salario + som;
            System.out.println("O salário tera um aumento de 10%");
            System.out.println("O novo salário sera de:" +novoSalario);

        } else {
            System.out.println("Não recebera aumento");
        }

        input.close();
    }
}
