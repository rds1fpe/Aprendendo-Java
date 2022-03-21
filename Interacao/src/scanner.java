import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine( );
        System.out.println("Seja vem vindo: " + name);

    }


}
