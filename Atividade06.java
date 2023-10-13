import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, exp, raiz1, raiz2, raizcub1, raizcub2, operacao;

        System.out.println("Informe o primeiro númrero: ");
        num1 = input.nextDouble();
        System.out.println("Informe o segundo número: ");
        num2 = input.nextDouble();
        System.out.println("Escolha a operação (a Para potencia e b para raiz e c para raiz cubica)");
        operacao = input.next().charAt(0);



        if (operacao == 'a' || operacao == 'A') {
            exp = Math.pow(num1, num2);
            System.out.println("A potencia do primeiro número pelo segundo é: " +exp);
        } else if (operacao == 'b' || operacao == 'B' ) {
            raiz1 = Math.sqrt(num1);
            raiz2 = Math.sqrt(num2);
            System.out.println("A raiz quadrada do primeiro número é: " +raiz1);
            System.out.println("A raiz quadrada do segundo número é: " +raiz2);
        } else if (operacao == 'c' || operacao == 'C') {
            raizcub1 = Math.cbrt(num1);
            raizcub2 = Math.cbrt(num2);
            System.out.println("A raiz cubica do primeiro número é: " +raizcub1);
            System.out.println("A raiz cubica do segundo número é: " +raizcub2);
        }


        input.close();
    }
}