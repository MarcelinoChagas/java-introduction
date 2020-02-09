package curso_programacao;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int valor;

		System.out.print("Digite um valor inteiro: ");
		valor = input.nextInt();

		for (int i = 0; i <= valor && valor <= 1000; i++) {
			if(i % 2 != 0) {
				System.out.printf("%d\n", i);
			}
		}
		
		input.close();
	}

}
