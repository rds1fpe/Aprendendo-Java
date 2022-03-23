import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um saldo qualquer: ");
        double pergunta = scanner.nextDouble();
        double reajuste = ((pergunta *0.01) + pergunta);
        System.out.println("O valor com reajuse de 1% eh: " + reajuste +" R$");

    }

}
