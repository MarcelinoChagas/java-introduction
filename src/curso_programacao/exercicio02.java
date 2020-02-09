package curso_programacao;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, x, in = 0, out = 0;
		

		System.out.print("Digite um Valor Inteiro: ");
		n = input.nextInt();

		x = n;
		
		System.out.printf("Será lido %d Valores\n", x);
		for (int i = 1; i <= x; i++) {
			
			System.out.printf("Digite o %d valor: ", i);
			n = input.nextInt();
			
			if(n >= 10 && n<=20) {
				in++;
			}else {
				out++;
			}
		}
		
		System.out.printf("%d in\n%d out", in, out);
		input.close();
		
	}

}
