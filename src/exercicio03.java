import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, c, d, diferenca;

		System.out.print("Digite 1� Valor: ");
		a = input.nextInt();
		System.out.print("Digite 2� Valor: ");
		b = input.nextInt();
		System.out.print("Digite 3� Valor: ");
		c = input.nextInt();
		System.out.print("Digite 4� Valor: ");
		d = input.nextInt();

		diferenca = (a * b - c * d);

		System.out.println("Resultado: " + diferenca);
		
		input.close();
	}

}
