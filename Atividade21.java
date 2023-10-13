import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String procedencia;
        double preco;
        int codigoOrigem;

        System.out.print("Informe o preço do produto: ");
        preco = input.nextDouble();

        System.out.print("Escolha um codigo de origem (De 1 a 30): ");
        codigoOrigem = input.nextInt();


        switch (codigoOrigem) {
            case 1:
                procedencia = "Sul";

            break;

            case 2:
                procedencia = "Norte";
            break;

            case 3:
                procedencia = "Leste";
            break;

            case 4:
                procedencia = "Oeste";
            break;

            case 5:
            case 6:
                procedencia = "Nordeste";
            break;

            case 7:
            case 8:
            case 9:
                procedencia = "Sudeste";
            break;

            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                procedencia = "Centro-oeste";
            break;

            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                procedencia = "Nordeste";
            break;
            default:
                procedencia = "Codigo de origem inválido!";
            break;
        }
        System.out.println("A procedência do produto é de " +procedencia);



    input.close();
    }
}
