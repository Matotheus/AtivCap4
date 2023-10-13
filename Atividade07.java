
import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, aumento, salarioNovo;

        System.out.print("Informe o salário: ");
        salario = input.nextDouble();


        if (salario > 500) {
            System.out.println("Você não tem direito a aumento!");
        } else if (salario < 500) {
            aumento = salario * 0.30;
            salarioNovo = salario + aumento;
            System.out.println("Você tem direito a aumento: " +aumento);
            System.out.println("O seu salário com aumento é: " +salarioNovo);
        }


        input.close();
    }
}
