import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Objeto de input estanciado

        System.out.println("Digite o valor a ser acrescido em %: ");
        double ipi = scanner.nextDouble();
        System.out.println("Digite o código do produto 1: ");
        var produto1 = scanner.next();
        System.out.println("Digite o valor unitario do produto 1: ");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto 1: ");
        double qntd1 = scanner.nextDouble();
        System.out.println("Digite o código do produto 2: ");
        var produto2 = scanner.next();
        System.out.println("Digite o valor unitario do produto 2: ");
        double valor2 = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto 2: ");
        double qntd2 = scanner.nextDouble();

        double valor_total = ((valor1 * qntd1) + (valor2 * qntd2)) * ((ipi/100) + 1);

        System.out.println("O valor do reajuste eh: " + valor_total);



    }

}
