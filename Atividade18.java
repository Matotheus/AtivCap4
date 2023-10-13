import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.print("Informe a sua idade: ");
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }

        input.close();
    }
}
