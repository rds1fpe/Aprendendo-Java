
import br.com.ronaldodaniel.megasena.Users;

import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {

        Random generate = new Random();

        System.out.print("O numero sorteado foi: ");
        for(int i = 0; i < 6; i ++) {
            int number = generate.nextInt(60);
            System.out.print(number + " ");

            Users users = new Users();

        }
    }
}
// Package é quando nos criamos um caminho e colocamos um arquivo especifico dentro
// import quando buscamos uma certa função dos caminhos que vem instalados no Java