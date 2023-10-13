import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, mediaAritmetica;

        System.out.print("Informe a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Informe a Segunda nota nota: ");
        nota2 = input.nextDouble();

        mediaAritmetica = (nota1 + nota2) / 2;



        if ((mediaAritmetica > 10 || mediaAritmetica < 0)) {
            System.out.println("Esse valor é invalido!");
        } else if ((mediaAritmetica >= 0 && mediaAritmetica  < 3)) {
            System.out.println("Reprovado!");
        } else if (mediaAritmetica < 7) {
            System.out.println("Exame!");
            System.out.println("A sua media aritmética é: " + mediaAritmetica + "\n");
        } else{
            System.out.println("Aprovado!");
            System.out.println("A sua media aritmética é: " + mediaAritmetica + "\n");
        }


        input.close();
    }
}