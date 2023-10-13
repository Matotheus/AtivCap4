import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senhaUsuario;


        System.out.println("Digite a senha");
        senhaUsuario = input.nextLine();

        String senhaValida = "4531";

        switch (senhaUsuario){
            case "4531":

                System.out.println("Entrada permitida!");
            break;
            default:
                System.out.println("Entrada negada!");
        }



        input.close();
    }
}
