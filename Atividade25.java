import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horasExtras, horasFaltas, totalHoras;

        System.out.print("Informe o número de horas extras: ");
        horasExtras = input.nextInt();
        System.out.print("Informe o número de horas que o funcionário faltou: ");
        horasFaltas = input.nextInt();

        totalHoras = horasExtras - (2/3 * (horasFaltas));
        
        if (totalHoras >= 2400){
            System.out.println("O premio sera de 500R$");
        } else if (totalHoras > 1800 && totalHoras < 2400) {
            System.out.println("O premio sera de 400R$");
            
        } else if (totalHoras >= 1200 && totalHoras < 1800) {
            System.out.println("O premio sera de 300R$");
        } else if (totalHoras >= 600 && totalHoras < 1200) {
            System.out.println("O premio sera de 200R$");
        } else {
            System.out.println("O premio sera de 100R$");
        }

        input.close();
    }
}