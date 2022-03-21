public class AreaCirculo {


    public static void main(String[] args) {

        int raio = Integer.parseInt(args[1]);


        if(args[0].equals("calcular")){
            calcCirculo(raio);
        }else{
            System.out.println("Nada definido");
        }
    }

    static void calcCirculo(int raio){
        System.out.println("O diametro do circulo e: " + (raio * 2));
        System.out.println("A area do circulo e:" + (3 * (raio * raio)));
        System.out.println("O cumprimento do circulo e: " + (2 * 3 * raio));

    }

}
