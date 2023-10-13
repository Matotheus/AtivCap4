import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, aumento35, aumento15;
        System.out.print("Informe o salário: ");
        salario = input.nextDouble();

        if (salario <= 300) {
            aumento35 = salario + 0.35;
            System.out.println("O salário tera um aumento de 35%" + aumento35);
        } else if (salario > 300) {
            aumento15 = salario + 0.15;
            System.out.println("O salário tera um aumento de 15% " +aumento15);
        }


        input.close();
    }
}
