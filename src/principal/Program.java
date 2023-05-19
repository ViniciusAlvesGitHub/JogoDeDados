package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int dado3 = random.nextInt(6) + 1;

        int soma = dado1 + dado2 + dado3;

        int bonus = 0;
        if (dado1 == dado2 && dado2 == dado3) {
            bonus = 6;
            System.out.println("Voc� � muito sortudo!");
        } else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado3) {
            bonus = 2;
        }

        int total = soma + bonus;
        if (total >= 15) {
            System.out.println("Parab�ns, voc� ganhou!");
        } else {
            System.out.println("Lamento, mas voc� perdeu");
        }

        System.out.println("Dados: " + dado1 + " " + dado2 + " " + dado3);
        System.out.println("Soma dos dados: " + soma);
        System.out.println("B�nus: " + bonus);
        System.out.println("Total: " + total);

	}

}
