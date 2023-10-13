import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, mediaArtimetica;

        System.out.print("Informe a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Informe a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Informe a terceira nota: ");
        nota3 = input.nextDouble();
        System.out.print("Informe a quarta nota: ");
        nota4 = input.nextDouble();

        mediaArtimetica = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("A sua media aritmética é: " + mediaArtimetica + "\n");

        if(mediaArtimetica >= 7) {
            System.out.println(" Você esta aprovado!");
        } else{
            System.out.println(" Você esta reprovado! ");
        }


    input.close();
    }
}