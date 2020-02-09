package estrutura_condicional;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x;

		System.out.print("Digite um valor:");
		x = input.nextInt();

		if (x < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		input.close();
	}

}
