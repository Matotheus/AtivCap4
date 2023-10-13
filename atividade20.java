import java.util.Scanner;

public class atividade20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.print("Informe sua idade: ");
        age = input.nextInt();

        if (age < 5) {
            System.out.println("Mensagem: Você ainda não tem idade para competir!");
        } else if (age >= 5 && age <= 7) {
            System.out.println("Categoria: Infantil!");
        } else if (age >= 8 && age <= 10) {
            System.out.println("Categoria: Juvenil!");
        } else if (age >= 11 && age <= 15) {
            System.out.println("Categoria: Adolescente!");
        } else if (age >= 16 && age <= 30) {
            System.out.println("Categoria: Adulto!");
        } else {
            System.out.println("Categoria: Sênior");
        }


        input.close();
    }
}
