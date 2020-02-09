import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, c, d, diferenca;

		System.out.print("Digite 1º Valor: ");
		a = input.nextInt();
		System.out.print("Digite 2º Valor: ");
		b = input.nextInt();
		System.out.print("Digite 3º Valor: ");
		c = input.nextInt();
		System.out.print("Digite 4º Valor: ");
		d = input.nextInt();

		diferenca = (a * b - c * d);

		System.out.println("Resultado: " + diferenca);
		
		input.close();
	}

}
