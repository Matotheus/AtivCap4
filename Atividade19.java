import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char sexo;
        double peso, pesoIdealM, pesoIdealF, altura;

        System.out.print("Informe a altura: ");
        altura = input.nextDouble();
        System.out.print("Informe o sexo (M para masculino F para feminino): ");
        sexo = input.next().charAt(0);
        System.out.print("Informe o peso: ");
        peso = input.nextDouble();

        pesoIdealM = (72.7 * altura) - 58;
        pesoIdealF = (62.1 * altura) - 44.7;

        if (sexo == 'M' || sexo =='m') {
            pesoIdealM = (72.7 * altura) - 58;
            System.out.printf("O peso ideal é: %.3f" ,pesoIdealM);
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdealF = (62.1 * altura) - 44.7;
            System.out.printf("O pessoa ideal é: %.3f" ,pesoIdealF);

        } else {
            System.out.println("Valor invalido. Use M para masculino e F para feminino");
            return;
        }


        input.close();
    }
}
