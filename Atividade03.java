import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero1,numero2;

        System.out.print("Informe o primeiro número: ");
        numero1 = input.nextDouble();
        System.out.print("Informe o segundo número: ");
        numero2 = input.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O menor número é " +numero2);
        } else if (numero2 > numero1) {
            System.out.println("O menor número é: " +numero1);
        } else if(numero1 == numero2) {
            System.out.println("Esses números são iguais, tente números diferentes.");
        }

        input.close();
    }
}