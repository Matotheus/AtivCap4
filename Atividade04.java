import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1, numero2, numero3;

        System.out.print("Informe o primeiro número: ");
        numero1 = input.nextDouble();
        System.out.print("Informe o segundo número: ");
        numero2 = input.nextDouble();
        System.out.print("Informe o segundo número: ");
        numero3 = input.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número é " +numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior número é: " +numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O maior número é: " +numero3);
        } else if(numero1 == numero2 && numero1 == numero3) {
            System.out.println("Esses números são iguais, tente números diferentes.");
        }


        input.close();
    }
}