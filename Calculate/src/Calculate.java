public class Calculate {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            minus(x, y);
        } else if(args[0].equals("dividir")){
            div(x,y);
        } else if (args[0].equals("multiplicar")){
            multi(x,y);
        } else {
            System.out.println("Nenhuma instrucao definida");
        }
    }

    static void sum(int x, int y){
        System.out.println("A soma dos valore e: " + (x + y));
    }
    static void minus(int x, int y){
        System.out.println("A subtracao entre os dois valores e: " + (x + y));
    }
    static void multi(int x, int y){
        System.out.println("A multiplicacao entre os dois valores e: " + (x * y));
    }
    static void div(int x, int y){
        System.out.println("A divisao entre os dois valores e: " + (x / y));
    }

}