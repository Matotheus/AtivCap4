import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoMedio, valorCredito, percentual, percentual2, percentual3, percentual4;

        System.out.print("Informe o saldo médio: ");
        saldoMedio = input.nextDouble();

        if (saldoMedio > 400) {
            percentual = saldoMedio * 0.30;
            System.out.println("O percetual é de: 30%");
            System.out.println("O seu saldo medio é: " +saldoMedio);
            System.out.println("O valor do credito é: " +percentual);
        } else if (saldoMedio > 300) {
            percentual2 = saldoMedio * 0.25;
            System.out.println("O percetual é de: 25%");
            System.out.println("O seu saldo medio é: " +saldoMedio);
            System.out.println("O valor do credito é: " +percentual2);
        } else if (saldoMedio > 200) {
            percentual3 = saldoMedio * 0.20;
            System.out.println("O percetual é de: 20%");
            System.out.println("O seu saldo medio é: " +saldoMedio);
            System.out.println("O valor do credito é: " +percentual3);
        } else if(saldoMedio <= 200) {
            percentual4 = saldoMedio * 0.10;
            System.out.println("O percetual é de: 10%");
            System.out.println("O seu saldo medio é: " +saldoMedio);
            System.out.println("O valor do credito é: " +percentual4);
        }


        input.close();
    }
}

