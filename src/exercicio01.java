import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1, x2, soma;
		System.out.print("Digite 1º número inteiro: ");
		x1 = sc.nextInt();
		System.out.print("Digite 2º número inteiro: ");
		x2 = sc.nextInt();
		
		soma = x1 + x2;
		System.out.println("Resultado: "+ soma);
		
		sc.close();
	}

}
