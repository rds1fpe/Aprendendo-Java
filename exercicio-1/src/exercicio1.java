import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em ANOS: ");
        int pergunta = scanner.nextInt();
        System.out.print("Digite sua idade em MESES: ");
        int pergunta2 = scanner.nextInt();
        System.out.print("Digite sua idade em DIAS: ");
        int pergunta3 = scanner.nextInt();

        int qntd_dias = ((pergunta * 365) + (pergunta2 * 30) + pergunta3);
        System.out.print("Voce viveu ate o momento: " + qntd_dias + " dias");

    }

}
