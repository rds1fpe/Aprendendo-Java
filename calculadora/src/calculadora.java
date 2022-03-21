import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println(" Seja Bem Vindo a Calculadora!");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" 1 --> SOMAR");
        System.out.println(" 2 --> SUBTRAIR");
        System.out.println(" 3 --> MULTIPLICAR");
        System.out.println(" 4 --> DIVIDIR");

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite a operacao que deseja realizar");
        int escolha = scanner.nextInt();
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        if (escolha == 12) {
            soma(num1, num2);
        }else if (escolha == 2){
            sub(num1,num2);
        }else if (escolha == 3){
            multi(num1,num2);
        }else if(escolha == 4){
            div(num1,num2);
        }
    }


    static void soma(int x, int y){
        System.out.println("A soma dos numeros eh: " + (x + y));
    }
    static void sub(int x, int y){
        System.out.println("A subtracao dos numeros eh: " + (x - y));
    }
    static void multi(int x, int y){
        System.out.println("A multiplicacao dos numeros eh: " + (x * y));
    }
    static void div(int x, int y){
        System.out.println("A divisao dos numeros eh: " + (x / y));
    }
}