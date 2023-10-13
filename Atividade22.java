import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, idade;
        int grupoDeRisco = 0;

        System.out.print("Informe sua idade: ");
        idade = input.nextDouble();
        System.out.print("Informe seu peso: ");
        peso = input.nextDouble();

        if (idade < 20) {
            if (peso <= 60) {
                grupoDeRisco = 9;
            } else if (peso <= 90) {
                grupoDeRisco = 8;
            } else {
                grupoDeRisco = 7;
            }
        } else if (idade <= 50) {
            if (peso <= 60) {
                grupoDeRisco = 6;
            } else if (peso <= 90) {
                grupoDeRisco = 5;
            } else {
                grupoDeRisco = 4;
            }
        } else {
            if (peso <= 60) {
                grupoDeRisco = 3;
            } else if (peso <= 90) {
                grupoDeRisco = 2;
            } else {
                grupoDeRisco = 1;
            }
        }

        System.out.println("O grupo de risco da pessoa é: " +grupoDeRisco);


        input.close();
    }
}
