package estrutura_repetitiva;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = 1, y = 1;
		
		while (x != 0 && y != 0) {
			System.out.print("Digite o Valor de X: ");
			x = input.nextInt();

			System.out.print("Digite o valor de Y: ");
			y = input.nextInt();

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
		}
		
		input.close();

	}

}
